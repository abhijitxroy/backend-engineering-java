# Multi Database Example

Multi database architecture allows a single backend application to interact with multiple databases.

Enterprise systems commonly use multiple databases for scalability, legacy integration, reporting systems, and workload separation.

## Why Multi Database

Common enterprise scenarios:

- User database + Audit database
- Read database + Write database
- Legacy database integration
- Multi tenant systems
- Reporting database separation

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

## DataSource Configuration

Enterprise applications configure separate datasource properties.

Example:

```properties
spring.datasource.primary.url

spring.datasource.audit.url
```

Backend engineering usage:

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

## Backend Engineering Perspective

Multi database knowledge helps:

- Enterprise architecture design
- Legacy integration
- Database scaling
- Production troubleshooting
- Distributed system design

## Performance Considerations

Monitor:

- Database latency
- Connection pool utilization
- Transaction execution time
- Retry handling

Optimization:

- Separate read and write traffic
- Database indexing
- Connection pool tuning

## Interview Focus Areas

Common discussions:

- Multiple DataSource
- Multiple EntityManagerFactory
- Multiple TransactionManager
- Saga Pattern
- Distributed consistency
- Read write separation
- Legacy integration