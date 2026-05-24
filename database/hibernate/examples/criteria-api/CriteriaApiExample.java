package database.hibernate.examples.criteriaapi;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.util.ArrayList;
import java.util.List;

public class CriteriaApiExample {

    public static void main(String[] args) {

        System.out.println(
                "Criteria API Example - Dynamic Query Building"
        );

        /*
         Enterprise Example:

         salary > 100000

         AND

         department = Platform

         ORDER BY salary DESC

         Pagination:
         pageSize = 20
         */

    }

    public List<Employee> findEmployees(
            EntityManager entityManager,
            Integer minSalary,
            String department,
            Integer page,
            Integer size
    ) {

        CriteriaBuilder cb =
                entityManager.getCriteriaBuilder();

        CriteriaQuery<Employee> cq =
                cb.createQuery(Employee.class);

        Root<Employee> employee =
                cq.from(Employee.class);

        List<Predicate> predicates =
                new ArrayList<>();

        if (minSalary != null) {

            predicates.add(

                    cb.greaterThan(

                            employee.get("salary"),
                            minSalary
                    )
            );
        }

        if (department != null) {

            predicates.add(

                    cb.equal(

                            employee.get("department"),
                            department
                    )
            );
        }

        cq.select(employee)

                .where(

                        predicates.toArray(
                                new Predicate[0]
                        )
                )

                .orderBy(

                        cb.desc(
                                employee.get("salary")
                        )
                );

        return entityManager

                .createQuery(cq)

                .setFirstResult(

                        page * size
                )

                .setMaxResults(size)

                .getResultList();
    }

}

@Entity
class Employee {

    @Id
    @GeneratedValue(
            strategy =
                    GenerationType.IDENTITY
    )
    private Long id;

    private String name;

    private Integer salary;

    private String department;

    public Long getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public Integer getSalary() {

        return salary;
    }

    public String getDepartment() {

        return department;
    }

}