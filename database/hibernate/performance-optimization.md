

# Performance Optimization

Hibernate performance optimization focuses on reducing database load, minimizing query execution time, and improving backend scalability.

Proper optimization improves throughput, latency, and production reliability.

## N+1 SELECT Problem

N+1 SELECT problem occurs when Hibernate executes one query for parent entities and additional queries for associated child entities.

Example:

Initial query:

```sql
SELECT * FROM employee;
```

Additional queries:

```sql
SELECT * FROM department WHERE employee_id=?;
```

If 100 employees exist:

- 1 parent query
- 100 child queries

Total:

101 database calls

Impact:

- Increased latency
- Database overload
- Higher CPU utilization
- Production performance degradation

## Solving N+1 Problem

### JOIN FETCH

Example:

```java
SELECT e FROM Employee e
JOIN FETCH e.department
```

Advantages:

- Single optimized query
- Lower database round trips

### EntityGraph

Example:

```java
@EntityGraph(
attributePaths = {"department"}
)
```

Advantages:

- Dynamic fetch control
- Cleaner repository design

### Batch Fetching

Example:

```properties
hibernate.default_batch_fetch_size=20
```

Advantages:

- Reduced query count
- Better collection loading performance

### Criteria Optimization

Use optimized fetch joins.

Avoid unnecessary entity loading.

## Fetch Optimization

Prefer:

- LAZY loading for large collections
- Controlled eager fetching
- Projection queries when full entity not required

Example:

```java
@OneToMany(fetch = FetchType.LAZY)
```

Backend engineering perspective:

- Lower memory utilization
- Better API response time

## Projection Optimization

Load only required columns.

Example:

```java
SELECT name, department
FROM Employee
```

Benefits:

- Lower memory usage
- Faster query execution
- Reduced serialization cost

## Pagination

Avoid loading large datasets.

Example:

```java
query.setFirstResult(0);
query.setMaxResults(100);
```

Benefits:

- Lower memory pressure
- Better scalability

## Connection Pool Optimization

Connection pooling reduces database connection overhead.

Popular connection pools:

- HikariCP
- Apache DBCP
- C3P0

Backend engineering perspective:

- Lower latency
- Better throughput
- Reduced resource overhead

## Index Optimization

Database indexing improves query execution.

Examples:

- Primary key index
- Composite index
- Covering index

Backend considerations:

- Avoid over indexing
- Monitor query plans
- Validate execution performance

## Query Optimization Best Practices

Prefer:

- Pagination
- Batch processing
- Projection
- Join optimization
- Lazy loading

Avoid:

- N+1 queries
- Large eager loading
- Full table scans
- Unnecessary entity retrieval

## Production Engineering Considerations

Monitor:

- Query execution time
- Slow queries
- Cache hit ratio
- Database CPU usage
- Connection pool utilization

Production tools:

- Hibernate statistics
- Application metrics
- Database execution plans
- APM monitoring tools

## Backend Engineering Perspective

Performance optimization knowledge helps:

- Production troubleshooting
- Database tuning
- Scalability improvement
- API optimization
- Infrastructure efficiency

## Interview Focus Areas

Common discussions:

- N+1 SELECT problem
- JOIN FETCH
- EntityGraph
- Batch fetching
- Projection optimization
- Pagination
- Connection pooling
- Index optimization
- Lazy vs Eager loading