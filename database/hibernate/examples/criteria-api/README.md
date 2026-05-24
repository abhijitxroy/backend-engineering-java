# Criteria API Example

Criteria API provides type-safe and dynamic query generation in Hibernate and JPA.

Criteria API helps build queries programmatically instead of writing query strings manually.

It is commonly used in enterprise backend systems where filtering conditions change dynamically.

## Why Criteria API

Advantages:

- Type-safe query generation
- Dynamic filtering support
- Better refactoring capability
- Reduced query string errors
- Complex query construction support

Backend engineering perspective:

- Search APIs
- Dynamic reporting systems
- Enterprise filtering systems
- Multi-condition query generation

## Core Components

Hibernate Criteria API commonly uses:

- CriteriaBuilder
- CriteriaQuery
- Root
- Predicate

Example flow:

```text
EntityManager
      ↓
CriteriaBuilder
      ↓
CriteriaQuery
      ↓
Root
      ↓
Predicate
      ↓
Query Execution
```

## Basic Query Example

Example:

```java
CriteriaBuilder cb =
entityManager.getCriteriaBuilder();

CriteriaQuery<Employee> cq =
cb.createQuery(Employee.class);

Root<Employee> employee =
cq.from(Employee.class);

cq.select(employee);

entityManager
.createQuery(cq)
.getResultList();
```

## Dynamic Filtering Example

Example:

```java
Predicate salaryCondition =
cb.greaterThan(
employee.get("salary"),
100000
);

Predicate departmentCondition =
cb.equal(
employee.get("department"),
"Platform"
);

cq.where(
cb.and(
salaryCondition,
departmentCondition
)
);
```

Benefits:

- Runtime filtering
- Flexible query generation
- Cleaner backend code

## Sorting Example

Ascending:

```java
cq.orderBy(
cb.asc(
employee.get("salary")
)
);
```

Descending:

```java
cq.orderBy(
cb.desc(
employee.get("salary")
)
);
```

## Pagination Example

Example:

```java
query.setFirstResult(0);

query.setMaxResults(20);
```

Backend engineering usage:

- REST APIs
- Dashboard systems
- Large dataset processing

## Projection Example

Load required fields only.

Example:

```java
cq.multiselect(
employee.get("name"),
employee.get("salary")
);
```

Benefits:

- Lower memory usage
- Faster query execution
- Better performance

## Criteria API vs HQL

| Feature | Criteria API | HQL |
|----------|--------------|-----|
| Type Safety | Better | Lower |
| Dynamic Query | Better | Moderate |
| Refactoring Support | Better | Lower |
| Query Readability | Moderate | Better |

## Performance Considerations

Prefer:

- Projection
- Pagination
- Dynamic filtering

Avoid:

- Loading unnecessary entities
- Large dataset retrieval

## Backend Engineering Perspective

Criteria API knowledge helps:

- Enterprise backend systems
- Query optimization
- Dynamic API development
- Production troubleshooting

## Interview Focus Areas

Common discussions:

- CriteriaBuilder
- Predicate
- Pagination
- Projection
- Dynamic filtering
- Criteria API vs HQL