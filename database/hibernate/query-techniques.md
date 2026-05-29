# Query Techniques

Hibernate provides multiple approaches to query and retrieve data efficiently.

Choosing the proper query strategy improves performance, maintainability, and scalability.

## Why Query Techniques Matter

Query design directly affects:

- API response times
- Database load
- Memory utilization
- Application scalability
- Infrastructure costs

Many Hibernate performance issues originate from inefficient query patterns rather than database limitations.

## Hibernate Query Language (HQL)

HQL (Hibernate Query Language) is an object-oriented query language.

HQL operates on entity objects instead of database tables.

Example:

```java
String hql = "FROM Employee WHERE salary > :salary";

Query<Employee> query = session.createQuery(hql, Employee.class);
query.setParameter("salary", 100000);
```

## Query Technique Selection Guide

| Technique | Best For |
| --------- | -------- |
| HQL | Static business queries |
| Criteria API | Dynamic filtering |
| Named Queries | Reusable queries |
| Projection | Optimized read operations |

Advantages:

- Database independent
- Object oriented querying
- Supports joins and aggregation
- Reduces SQL boilerplate

Production engineering usage:

- Enterprise applications
- Dynamic filtering
- Reporting systems

## Criteria API

Criteria API provides type-safe dynamic query generation.

Example:

```java
CriteriaBuilder cb = entityManager.getCriteriaBuilder();
CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
Root<Employee> root = cq.from(Employee.class);

cq.select(root)
  .where(cb.gt(root.get("salary"), 100000));
```

## Dynamic Query Pattern

Criteria API is commonly used when query conditions are generated from request parameters.

Typical use cases:

- Search APIs
- Admin dashboards
- Reporting systems
- Enterprise workflow applications

Advantages:

- Dynamic query generation
- Compile-time safety
- Better refactoring support

Production engineering usage:

- Search APIs
- Dynamic filtering systems
- Complex enterprise queries

## Restrictions

Restrictions are used to limit retrieved data.

Examples:

```java
salary > 100000
```

```java
department = 'Platform'
```

Common restriction scenarios:

- Filtering
- Search operations
- Conditional retrieval

## Criteria vs DetachedCriteria

Criteria:

- Requires Session
- Online query construction
- Executes immediately

DetachedCriteria:

- Independent of Session
- Query can be built offline
- Session required only during execution

Production engineering usage:

- Multi-layer enterprise architecture
- Delayed query execution

## Named Queries

Named queries are predefined reusable queries.

Example:

```java
@NamedQuery(
name = "Employee.findActive",
query = "FROM Employee WHERE active=true"
)
```

Advantages:

- Query reuse
- Better maintainability
- Faster startup validation

Production benefits:

- Centralized query management
- Early validation during startup
- Better maintainability
- Reduced query duplication

## Pagination

Pagination prevents loading large datasets.

Example:

```java
query.setFirstResult(0);
query.setMaxResults(20);
```

Benefits:

- Reduced memory usage
- Faster API responses
- Better scalability
- Lower database load

Pagination should be considered mandatory for large result sets.

## Projection

Projection retrieves selected columns instead of entire entities.

Example:

```java
SELECT name, salary FROM Employee
```

Benefits:

- Reduced memory usage
- Better performance
- Lower database overhead

Common production use cases:

- REST APIs
- Dashboard queries
- Reporting systems
- Search endpoints

DTO projections are often preferred over returning full entities.

## get() vs load()

get():

- Immediately hits database
- Returns null if object not found

Example:

```java
Employee employee = session.get(Employee.class, 1);
```

load():

- Returns proxy object
- Database query executes when needed
- Throws exception if object missing

Example:

```java
Employee employee = session.load(Employee.class, 1);
```

Production engineering usage:

- get() for validation workflows
- load() for lazy access optimization

## get() vs load() Comparison

| Feature | get() | load() |
| ------- | ----- | ------ |
| Database Access | Immediate | Lazy |
| Missing Entity | Returns null | Throws exception |
| Proxy Usage | No | Yes |
| Typical Usage | Validation | Reference loading |

## Filtering Strategies

Common filtering approaches:

- HQL filtering
- Criteria filtering
- Named parameter filtering

Example:

```java
query.setParameter("department", "Platform");
```

## Query Performance Best Practices

Prefer:

- Pagination
- DTO projections
- Proper indexing
- Parameterized queries
- Query-specific fetch optimization

Avoid:

- Full table scans
- Large result sets
- Unnecessary entity loading
- N+1 query patterns
- Missing indexes

## Production Engineering Perspective

Query optimization knowledge helps with:

- Production troubleshooting
- Database optimization
- API optimization
- ORM performance tuning
- Large dataset handling
- Scalability engineering
- Capacity planning
- Operational debugging

Engineers should understand both query abstractions and generated SQL execution behavior.

## Interview Questions

1. What is HQL?
2. HQL vs SQL?
3. When should Criteria API be used?
4. What are Named Queries?
5. Why are projections important?
6. get() vs load()?
7. Why is pagination important?
8. How do parameterized queries improve security?
9. What causes query performance issues?
10. How would you optimize Hibernate queries in production?

## Quick Revision

- HQL operates on entities.
- Criteria API supports dynamic query generation.
- Named Queries improve reuse and maintainability.
- Pagination prevents large memory consumption.
- DTO projections improve performance.
- get() loads immediately.
- load() uses proxies.
- Always analyze generated SQL.