# Fetch Strategies

Fetch strategy determines how Hibernate loads associated entities.

Proper fetch strategy selection improves performance and prevents unnecessary database calls.

## Why Fetch Strategies Matter

Fetch strategy selection directly affects:

- Query performance
- Memory utilization
- Database load
- API response times
- Application scalability

Many Hibernate performance issues originate from incorrect fetch strategy choices.

## Fetch Types

Hibernate supports:

- LAZY
- EAGER

## Fetch Strategy Overview

| Strategy | Data Loading Behavior | Performance Impact |
| -------- | --------------------- | ------------------ |
| LAZY | Loads only when accessed | Usually better |
| EAGER | Loads immediately | Can be expensive |

## FetchType.LAZY

Associated entity loads only when required.

Example:

```java

@OneToMany(fetch = FetchType.LAZY)

private List<Order> orders;

```

Advantages:

- Better performance

- Reduced memory usage

- Lower database load

Potential risks:

- LazyInitializationException
- Additional queries if not optimized
- Unexpected database access patterns

Production engineering usage:

- Large collections

- High traffic systems

- Microservices APIs

## FetchType.EAGER

Associated entity loads immediately.

Example:

```java

@ManyToOne(fetch = FetchType.EAGER)

private Department department;

```

Advantages:

- Immediate availability

Disadvantages:

- Higher memory usage

- Extra database queries

- N+1 problem risk

Use carefully for:

- Small reference entities
- Frequently required relationships
- Predictable object graphs

## Default Fetch Types

| Relationship | Default Fetch Type |
| ------------ | ------------------ |
| OneToMany | LAZY |
| ManyToMany | LAZY |
| ManyToOne | EAGER |
| OneToOne | EAGER |

## N+1 SELECT Problem

N+1 occurs when parent query triggers multiple child queries.

Example:

1 query:

```sql

SELECT * FROM employee;

```

N queries:

```sql

SELECT * FROM address WHERE employee_id=?

```

Impact:

- Database overload

- Slow response time

- Performance degradation

## Why N+1 Is Dangerous

N+1 queries can:

- Increase database load
- Increase latency
- Reduce throughput
- Create scalability bottlenecks

N+1 problems are among the most common Hibernate performance issues.

## Solving N+1 Problem

### JOIN FETCH

Example:

```java

SELECT e FROM Employee e

JOIN FETCH e.department

```

### EntityGraph

Example:

```java

@EntityGraph(

attributePaths = {"department"}

)

```

### Batch Fetching

Example:

```properties

hibernate.default_batch_fetch_size=20

```

### Criteria API

Use optimized fetch joins.

### HQL Optimization

Reduce unnecessary entity loading.

## Fetch Optimization Strategy

Prefer:

- LAZY loading by default
- JOIN FETCH when required
- EntityGraph for controlled loading
- DTO projections for APIs
- Batch fetching for collections

Avoid:

- Unnecessary EAGER loading
- Large object graph loading
- Blind fetch strategy selection

## Production Engineering Perspective

Fetch strategy knowledge helps with:

- ORM performance tuning
- API optimization
- Query optimization
- Memory optimization
- Scalability engineering
- Production troubleshooting
- Database optimization
- Operational debugging

Engineers should always evaluate generated SQL when tuning fetch behavior.

## Interview Questions

1. What is LAZY loading?
2. What is EAGER loading?
3. Why is LAZY usually preferred?
4. What causes LazyInitializationException?
5. What is the N+1 SELECT problem?
6. How does JOIN FETCH solve N+1?
7. What is EntityGraph?
8. What is batch fetching?
9. When should DTO projections be used?
10. How would you troubleshoot Hibernate performance issues?

## Quick Revision

- LAZY loads data on demand.
- EAGER loads data immediately.
- Prefer LAZY by default.
- N+1 queries are a common ORM problem.
- JOIN FETCH reduces additional queries.
- EntityGraph provides controlled loading.
- Batch fetching improves collection loading.
- Always analyze generated SQL.