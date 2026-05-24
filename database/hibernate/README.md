

# Hibernate and JPA

This module covers Hibernate and JPA concepts required for backend engineering, enterprise application development, production systems, and interview preparation.

Hibernate is an Object Relational Mapping (ORM) framework.

JPA (Java Persistence API) is a specification for object persistence.

Hibernate is one of the most widely used JPA implementations.

## Learning Coverage

### Hibernate Fundamentals

- Hibernate overview
- JPA fundamentals
- Session vs SessionFactory
- EntityManager vs Session
- Persistence Context
- Entity lifecycle

### Transaction Management

- @Transactional
- Propagation
- Isolation levels
- Rollback behavior
- Distributed transactions
- Multiple database handling

### Caching

- First Level Cache
- Second Level Cache
- Query Cache
- Cache optimization
- Cache concurrency strategy

### Query Techniques

- HQL
- Criteria API
- Named Query
- Pagination
- Projection
- Restrictions
- get() vs load()

### Performance Optimization

- N+1 SELECT problem
- JOIN FETCH
- EntityGraph
- Batch fetching
- Lazy vs Eager loading
- Connection pooling
- Query optimization

### Backend Engineering Considerations

- Production troubleshooting
- Database optimization
- API optimization
- Scalability improvements
- Distributed systems considerations

## Module Structure

```text
hibernate/
├── README.md
├── hibernate-overview.md
├── persistence-context.md
├── entity-lifecycle.md
├── transaction-management.md
├── caching-strategies.md
├── query-techniques.md
├── performance-optimization.md
└── examples/
```

## Learning Path

Recommended progression:

1. hibernate-overview.md
2. persistence-context.md
3. entity-lifecycle.md
4. transaction-management.md
5. caching-strategies.md
6. query-techniques.md
7. performance-optimization.md

## Interview Focus Areas

Common interview topics:

- Entity lifecycle
- Persistence Context
- First Level vs Second Level Cache
- get() vs load()
- FetchType.LAZY vs FetchType.EAGER
- N+1 SELECT problem
- Transaction propagation
- Isolation levels
- Distributed transactions

## Backend Engineering Goal

Build practical understanding for:

- Enterprise backend systems
- Production engineering
- Microservices persistence design
- Database performance optimization
- Scalable backend architecture