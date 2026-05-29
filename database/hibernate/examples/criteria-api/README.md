# Criteria API Example

Criteria API provides type-safe and dynamic query generation in Hibernate and JPA.

Criteria API helps build queries programmatically instead of writing query strings manually.

It is commonly used in enterprise backend systems where filtering conditions change dynamically.

## Why Criteria API Matters

Criteria API is widely used when query conditions are not known at compile time.

Common examples:

- Search APIs
- Reporting platforms
- Admin dashboards
- Filtering systems
- Enterprise workflow applications

Criteria API enables flexible query construction while maintaining type safety.

## Why Criteria API

Advantages:

- Type-safe query generation
- Dynamic filtering support
- Better refactoring capability
- Reduced query string errors
- Complex query construction support

Common production use cases:

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

## Component Responsibilities

| Component | Responsibility |
| --------- | -------------- |
| CriteriaBuilder | Creates query objects and expressions |
| CriteriaQuery | Represents the query definition |
| Root | Represents the primary entity |
| Predicate | Represents filtering conditions |
| TypedQuery | Executes the generated query |

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

## Dynamic Search API Pattern

A common production pattern is building predicates dynamically based on optional request parameters.

Benefits:

- Flexible filtering
- Reduced query duplication
- Easier API evolution
- Better maintainability

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

## DTO Projection Strategy

For large datasets, returning full entities is often inefficient.

Prefer DTO projections when:

- Only a subset of fields is required
- API response size should be minimized
- Query performance is important
- Large object graphs are unnecessary

## Criteria API vs HQL

| Feature | Criteria API | HQL |
| ------- | ------------ | --- |
| Type Safety | Better | Lower |
| Dynamic Query Generation | Better | Moderate |
| Refactoring Support | Better | Lower |
| Readability | Moderate | Better |
| Complex Search APIs | Better | Moderate |
| Static Queries | Moderate | Better |

General guidance:

- Use HQL for simple static queries.
- Use Criteria API for dynamic query generation.

## Performance Considerations

Prefer:

- DTO projections
- Pagination
- Query filtering
- Fetch optimization
- Proper indexing

Avoid:

- Loading unnecessary entities
- Large dataset retrieval
- Missing pagination
- Excessive joins
- N+1 query patterns

## Production Engineering Perspective

Criteria API knowledge helps with:

- Enterprise backend systems
- Query optimization
- Dynamic API development
- Search platform design
- Reporting systems
- Production troubleshooting
- Persistence performance tuning

Criteria API is particularly valuable when query complexity grows beyond static query approaches.

## Interview Questions

1. What is Criteria API?
2. Why use Criteria API instead of HQL?
3. What is CriteriaBuilder?
4. What is a Predicate?
5. How do you implement dynamic filtering?
6. How do pagination and sorting work?
7. When should DTO projections be used?
8. What performance problems can occur?
9. How does Criteria API improve maintainability?
10. Criteria API vs JPQL?

## Quick Revision

- Criteria API provides type-safe query generation.
- Predicates represent filtering conditions.
- CriteriaBuilder creates query components.
- Pagination is essential for large datasets.
- DTO projections improve performance.
- Criteria API is ideal for dynamic search systems.
- Avoid N+1 query problems.
- Always analyze generated SQL.