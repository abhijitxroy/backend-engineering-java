

# Caching Strategies

Hibernate caching improves application performance by reducing unnecessary database calls.

Caching minimizes database interaction and improves backend scalability.

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

Backend engineering perspective:

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

Backend engineering perspective:

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

## First Level Cache vs Second Level Cache

| Feature | First Level Cache | Second Level Cache |
|----------|-------------------|--------------------|
| Scope | Session | SessionFactory |
| Enabled | Default | Optional |
| Shared | No | Yes |
| Lifetime | Session lifetime | SessionFactory lifetime |
| Storage | Memory | External provider |

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

## Production Considerations

Cache considerations:

- Cache invalidation
- Memory usage
- Cache hit ratio
- Stale data risk
- Distributed cache synchronization

Common problems:

- Over caching
- Memory pressure
- Cache inconsistency

## Backend Engineering Perspective

Caching knowledge helps:

- Production troubleshooting
- Database optimization
- Performance engineering
- Scalability improvement
- Distributed system optimization

## Interview Focus Areas

Common discussions:

- First Level Cache
- Second Level Cache
- Query Cache
- Cache invalidation
- Cache provider selection
- Cache concurrency strategy
- Performance optimization