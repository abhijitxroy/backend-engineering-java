# Multi Database Example

Multi database architecture allows a single backend application to interact with multiple databases.

## Why Multi-Database Architectures Matter

Large enterprise systems often separate workloads across multiple databases to improve scalability, reliability, security, and operational flexibility.

Common drivers include:

- Workload isolation
- Regulatory requirements
- Legacy integration
- Reporting workloads
- Independent scaling
- Fault isolation

Multi-database architectures are common in large backend platforms.

## Common Multi-Database Patterns

### Read-Write Separation

- Primary database handles writes
- Read replicas handle queries
- Improves scalability

### Audit Database Pattern

- Business data stored separately
- Audit events isolated
- Improves compliance and reporting

### Reporting Database Pattern

- Reporting workloads separated
- Reduces impact on transactional systems

### Legacy Integration Pattern

- New platform database
- Existing legacy database
- Gradual migration support

Example:

```text
Application
      ↓

-------------------------

Primary Database

(User Data)

-------------------------

Audit Database

(Activity Logs)

-------------------------

Analytics Database

(Reporting)
```

## Spring Boot Multi Database Components

Typical configuration includes:

- Multiple DataSource
- Multiple EntityManagerFactory
- Multiple TransactionManager

Example architecture:

```text
Order Service
      ↓

Primary EntityManager

Primary TransactionManager

------------------------

Audit Service
      ↓

Audit EntityManager

Audit TransactionManager
```

## Component Responsibilities

| Component | Responsibility |
| --------- | -------------- |
| DataSource | Database connectivity |
| EntityManagerFactory | Entity management |
| TransactionManager | Transaction boundaries |
| Repository Layer | Data access abstraction |

## DataSource Configuration

Enterprise applications configure separate datasource properties.

Example:

```properties
spring.datasource.primary.url

spring.datasource.audit.url
```

Production use cases:

- Database workload isolation
- Independent scaling
- Fault isolation

## EntityManagerFactory Configuration

Each database requires its own:

- EntityManagerFactory
- Repository scan package
- Transaction manager

Example:

```text
Primary Database

→ PrimaryEntityManagerFactory

Audit Database

→ AuditEntityManagerFactory
```

## Transaction Management

Single database:

```text
One TransactionManager
```

Multiple databases:

```text
Multiple TransactionManager
```

Challenges:

- Partial failure handling
- Distributed consistency
- Retry strategy

Common production challenges:

- Cross-database consistency
- Partial transaction failures
- Retry complexity
- Recovery workflows
- Audit reconciliation

## Distributed Transaction Considerations

Common approaches:

### Saga Pattern

Break large transaction into smaller local transactions.

Compensation handles failures.

Example:

```text
Order Service

↓

Payment Service

↓

Inventory Service

↓

Audit Service
```

### Outbox Pattern

Store event and database update together.

Improves consistency.

### Event Driven Architecture

Use asynchronous communication.

Improves scalability.

## Why Distributed Transactions Are Difficult

Distributed transactions require coordination across multiple systems.

Common challenges:

- Network failures
- Service outages
- Timeout handling
- Partial success scenarios
- Recovery complexity

Modern architectures often prefer eventual consistency approaches instead of traditional distributed transactions.

## Production Engineering Perspective

Multi-database knowledge helps with:

- Enterprise architecture design
- Legacy modernization
- Database scaling
- Fault isolation
- Compliance architecture
- Operational troubleshooting
- Reliability engineering
- Distributed system design

Engineers should understand both database configuration and operational behavior.

## Performance Considerations

Monitor:

- Database latency
- Connection pool utilization
- Transaction execution time
- Replica lag
- Query latency
- Retry handling

Optimization:

- Read-write separation
- Database indexing
- Connection pool tuning
- Query optimization
- Capacity planning

## Interview Questions

1. Why use multiple databases?
2. How do multiple DataSources work in Spring Boot?
3. Why does each database require its own EntityManagerFactory?
4. Why are multiple TransactionManagers needed?
5. What is read-write separation?
6. What challenges occur with distributed transactions?
7. Saga Pattern vs Two-Phase Commit?
8. Why is eventual consistency commonly used?
9. How would you troubleshoot cross-database failures?
10. How do multi-database systems scale?

## Quick Revision

- Multi-database architectures improve scalability and isolation.
- Each database requires its own DataSource.
- EntityManagerFactory is database-specific.
- TransactionManager controls transaction boundaries.
- Distributed consistency is challenging.
- Saga Pattern is commonly used.
- Read-write separation improves scalability.
- Monitor latency, retries, and connection pools.