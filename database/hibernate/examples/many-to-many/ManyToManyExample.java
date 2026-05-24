package database.hibernate.examples.manytomany;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.util.HashSet;
import java.util.Set;

public class ManyToManyExample {

    public static void main(String[] args) {

        Course java = new Course(1L, "Java");
        Course spring = new Course(2L, "Spring Boot");

        Student student = new Student(1001L, "Alex");

        student.getCourses().add(java);
        student.getCourses().add(spring);

        System.out.println("Student : " + student.getName());

        student.getCourses()
                .forEach(course ->
                        System.out.println(course.getName()));
    }
}

@Entity
class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> courses = new HashSet<>();

    public Student() {
    }

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Course> getCourses() {
        return courses;
    }
}

@Entity
class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Course() {
    }

    public Course(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
