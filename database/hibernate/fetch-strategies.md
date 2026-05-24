# Fetch Strategies

Fetch strategy determines how Hibernate loads associated entities.

Proper fetch strategy selection improves performance and prevents unnecessary database calls.

## Fetch Types

Hibernate supports:

- LAZY
- EAGER

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

Backend engineering usage:

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

## Default Fetch Types

| Relationship | Default |

|--------------|----------|

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

## Backend Engineering Perspective

Fetch strategy knowledge helps:

- API optimization

- Database performance tuning

- Production troubleshooting

- Query optimization

## Interview Focus Areas

Common discussions:

- LAZY vs EAGER
- N+1 problem
- JOIN FETCH
- EntityGraph
- Batch fetch