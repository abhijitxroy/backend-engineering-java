# Caching Strategies

Hibernate caching improves application performance by reducing unnecessary database calls.

Caching minimizes database interaction and improves backend scalability.

## Why Hibernate Caching Matters

Database access is typically one of the most expensive operations in backend applications.

Hibernate caching helps:

- Reduce database load
- Improve response times
- Lower infrastructure costs
- Improve scalability
- Increase throughput

Effective caching can significantly improve application performance when used appropriately.

## Hibernate Cache Layers

```text
Application
   ↓
Session (First Level Cache)
   ↓
Second Level Cache
   ↓
Database
```

## Cache Architecture Flow

Typical request flow:

```text
Application Request
        ↓
First Level Cache
        ↓
Second Level Cache
        ↓
Database
```

The goal is to satisfy requests from the nearest available cache layer before reaching the database.

## First Level Cache

First Level Cache exists inside Hibernate Session.

Characteristics:

- Enabled by default
- Session scoped
- Always enabled for Session lifecycle
- Stores managed entity objects
- Improves performance

Example:

```java
Employee e1 = session.get(Employee.class, 1);
Employee e2 = session.get(Employee.class, 1);
```

Database query executes only once.

Second retrieval uses cache.

Production engineering benefits:

- Reduces database load
- Improves response time
- Helps transaction performance

## Second Level Cache

Second Level Cache exists across Sessions.

Characteristics:

- Optional
- SessionFactory scoped
- Shared across transactions
- Requires cache provider

Popular providers:

- Ehcache
- Hazelcast
- Infinispan
- Redis (commonly via integration layer)

Example configuration:

```properties
hibernate.cache.use_second_level_cache=true
```

Production engineering benefits:

- Improves application scalability
- Reduces repeated database access
- Useful for frequently accessed reference data

## Query Cache

Query cache stores query result sets.

Example:

```properties
hibernate.cache.use_query_cache=true
```

Use carefully.

Query cache works best with Second Level Cache.

Important:

Query Cache stores identifiers and result metadata.
Actual entities should typically use Second Level Cache.

Suitable scenarios:

- Frequently executed queries
- Reporting queries
- Dashboard data

## When To Use Query Cache

Good candidates:

- Reporting queries
- Dashboard aggregations
- Frequently repeated lookups
- Reference data queries

Avoid using Query Cache for highly volatile transactional data.

## First Level Cache vs Second Level Cache

| Feature | First Level Cache | Second Level Cache |
| ------- | ----------------- | ------------------ |
| Scope | Session | SessionFactory |
| Enabled | Default | Optional |
| Shared | No | Yes |
| Lifetime | Session Lifetime | SessionFactory Lifetime |
| Storage | Application Memory | Cache Provider |
| Configuration | Automatic | Explicit |

## Cache Concurrency Strategies

### READ_ONLY

Use for immutable data.

Examples:

- Country master data
- Configuration tables

### READ_WRITE

Supports strong consistency.

Suitable for transactional systems.

### NONSTRICT_READ_WRITE

Allows eventual consistency.

Better performance.

### TRANSACTIONAL

Supports transactional cache providers.

Enterprise use case.

## Strategy Selection Guide

| Strategy | Consistency | Performance | Typical Usage |
| -------- | ----------- | ----------- | ------------- |
| READ_ONLY | High | High | Reference Data |
| READ_WRITE | High | Moderate | Transactional Data |
| NONSTRICT_READ_WRITE | Moderate | Higher | Frequently Read Data |
| TRANSACTIONAL | Very High | Depends on Provider | Enterprise Systems |

## Cache Eviction

Cache eviction removes stale entries.

Example:

```java
sessionFactory.getCache().evictAllRegions();
```

Strategies:

- Time based eviction
- Size based eviction
- Manual eviction

Common eviction triggers:

- Data updates
- Cache expiration
- Capacity limits
- Administrative operations
- Deployment activities

## Production Caching Considerations

Important areas:

- Cache invalidation
- Memory utilization
- Cache hit ratio
- Stale data management
- Cache synchronization
- Capacity planning
- Cache warmup strategies
- Multi-node consistency

Common production issues:

- Over-caching
- Memory pressure
- Cache inconsistency
- Low cache hit rates
- Excessive invalidation

## Production Engineering Perspective

Caching knowledge helps with:

- Production troubleshooting
- Database optimization
- ORM performance tuning
- Scalability engineering
- Reliability engineering
- Capacity planning
- Distributed system optimization
- Operational debugging

Engineers should understand both cache behavior and generated SQL patterns.

## Interview Questions

1. What is the First Level Cache?
2. What is the Second Level Cache?
3. Why is First Level Cache enabled by default?
4. When should Second Level Cache be used?
5. What is Query Cache?
6. Query Cache vs Second Level Cache?
7. What are cache concurrency strategies?
8. READ_ONLY vs READ_WRITE?
9. How do you handle cache invalidation?
10. What metrics should be monitored in production?

## Quick Revision

- First Level Cache is Session scoped.
- Second Level Cache is SessionFactory scoped.
- Query Cache stores query results and identifiers.
- READ_ONLY is best for immutable data.
- READ_WRITE supports transactional consistency.
- Cache invalidation is a major challenge.
- Monitor hit ratio and memory usage.
- Always evaluate generated SQL and cache effectiveness.