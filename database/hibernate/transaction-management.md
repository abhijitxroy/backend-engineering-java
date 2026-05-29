# Transaction Management

Transaction management ensures database consistency and maintains data integrity.

A transaction follows ACID properties:

- Atomicity
- Consistency
- Isolation
- Durability

Transaction management is critical for enterprise backend systems and distributed applications.

## Why Transaction Management Matters

Transaction management directly impacts:

- Data consistency
- System reliability
- Failure recovery
- Application scalability
- Distributed system behavior

Many production incidents originate from incorrect transaction boundaries, propagation settings, or consistency assumptions.

## Transaction Lifecycle

Typical flow:

```text
Transaction Start
       ↓
Business Operations
       ↓
Validation
       ↓
Commit or Rollback
```

The transaction manager coordinates execution, consistency, and recovery.

## @Transactional Annotation

@Transactional is used to manage transaction boundaries in Spring applications.

Example:

```java
@Transactional
public void transferMoney() {

    accountService.withdraw();

    accountService.deposit();
}
```

Benefits:

- Automatic transaction management
- Rollback support
- Reduced boilerplate code
- Better consistency

Default behavior:

- Commit on successful execution
- Rollback on RuntimeException
- Rollback on Error

Production engineering benefits:

- Reduces transaction boilerplate
- Simplifies consistency handling
- Improves maintainability

## Transaction Propagation
## Propagation Comparison

| Propagation | Existing Transaction | New Transaction |
| ----------- | ------------------- | --------------- |
| REQUIRED | Joins existing | If required |
| REQUIRES_NEW | Suspends existing | Always |
| SUPPORTS | Uses existing | No |
| MANDATORY | Requires existing | No |
| NOT_SUPPORTED | Suspends existing | No |
| NEVER | Fails if present | No |
| NESTED | Savepoint based | Nested scope |

Propagation determines how transactions behave when one transactional method calls another.

### REQUIRED (Default)

Uses existing transaction.

Creates new transaction if none exists.

Example:

```java
@Transactional(
propagation = Propagation.REQUIRED
)
```

Usage:

- Most business operations
- Service layer transaction handling

### REQUIRES_NEW

Always creates new transaction.

Suspends existing transaction.

Example:

```java
@Transactional(
propagation = Propagation.REQUIRES_NEW
)
```

Usage:

- Audit logging
- Independent operations
- Notification persistence

### SUPPORTS

Uses existing transaction if available.

Runs without transaction otherwise.

Example:

```java
@Transactional(
propagation = Propagation.SUPPORTS
)
```

Usage:

- Read operations
- Optional transaction boundary scenarios

### MANDATORY

Requires existing transaction.

Throws exception if none exists.

Example:

```java
@Transactional(
propagation = Propagation.MANDATORY
)
```

Usage:

- Shared transactional workflow

### NOT_SUPPORTED

Suspends existing transaction.

Executes without transaction.

Example:

```java
@Transactional(
propagation = Propagation.NOT_SUPPORTED
)
```

Usage:

- Reporting
- Read-heavy operations
- Long-running analytics

### NEVER

Must execute without transaction.

Throws exception if transaction exists.

Example:

```java
@Transactional(
propagation = Propagation.NEVER
)
```

Usage:

- Validation logic
- Non-transactional operations

### NESTED

Creates nested transaction using savepoints.

Rollback can occur independently.

Example:

```java
@Transactional(
propagation = Propagation.NESTED
)
```

Usage:

- Partial rollback scenarios

Note:

- Requires database savepoint support
- Primarily supported using JDBC savepoints with DataSourceTransactionManager

## Isolation Levels
## Isolation Level Comparison

| Isolation Level | Dirty Reads | Non-Repeatable Reads | Phantom Reads |
| --------------- | ----------- | -------------------- | ------------- |
| READ_UNCOMMITTED | Possible | Possible | Possible |
| READ_COMMITTED | Prevented | Possible | Possible |
| REPEATABLE_READ | Prevented | Prevented | Possible |
| SERIALIZABLE | Prevented | Prevented | Prevented |

Isolation controls visibility of changes between transactions.

### READ_UNCOMMITTED

Lowest isolation level.

Allows:

- Dirty reads
- Non-repeatable reads
- Phantom reads

Example:

```java
@Transactional(
isolation = Isolation.READ_UNCOMMITTED
)
```

Usage:

- Rarely recommended
- Analytics scenarios where absolute consistency is not critical

### READ_COMMITTED

Prevents:

- Dirty reads

Allows:

- Non-repeatable reads
- Phantom reads

Common choice for balancing consistency and performance.

Example:

```java
@Transactional(
isolation = Isolation.READ_COMMITTED
)
```

### REPEATABLE_READ

Prevents:

- Dirty reads
- Non-repeatable reads

Allows:

- Phantom reads

Common MySQL default.

Example:

```java
@Transactional(
isolation = Isolation.REPEATABLE_READ
)
```

### SERIALIZABLE

Highest isolation level.

Prevents:

- Dirty reads
- Non-repeatable reads
- Phantom reads

Tradeoff:

- Higher locking overhead
- Reduced concurrency

Example:

```java
@Transactional(
isolation = Isolation.SERIALIZABLE
)
```

## Single Database Transaction

Example:

```java
@Transactional
public void createOrder() {

    saveOrder();

    updateInventory();
}
```

Characteristics:

- Simple consistency handling
- Single TransactionManager
- Easier rollback management

## Multiple Database Transaction

Enterprise applications often use:

- Multiple DataSource
- Multiple EntityManagerFactory
- Multiple TransactionManager

Examples:

- User database + Audit database
- Legacy system integration
- Read-write database separation

Challenges:

- Partial failures
- Data consistency
- Retry handling

Common approaches:

- Separate TransactionManager per datasource
- Saga Pattern
- Event driven consistency handling

Production engineering considerations:

- Eventual consistency
- Retry mechanisms
- Failure recovery strategy

## Distributed Transactions

Distributed transaction spans multiple systems.

Examples:

- Multiple databases
- Database + Kafka
- Database + Message Queue
- Multiple microservices

Challenges:

- Network latency
- Partial failures
- Consistency management

Production considerations:

- Idempotency
- Retry mechanism
- Duplicate event handling
- Eventual consistency

Common solutions:

### Saga Pattern

Breaks large transaction into smaller local transactions.

Compensation handles failures.

Use case:

- Microservice transaction orchestration

### Outbox Pattern

Stores event and database update together.

Improves reliability.

Use case:

- Database + Event publishing consistency

### Two Phase Commit (2PC)

Coordinates commit across multiple systems.

Characteristics:

- Strong consistency
- Higher latency
- Coordinator dependency

Tradeoff:

- Reliability vs performance

### Event Driven Architecture

Uses asynchronous communication.

Improves scalability.

Use case:

- Distributed systems

## Rollback Behavior
## Common Transaction Mistakes

Common problems:

- Large transaction boundaries
- Long-running transactions
- Excessive database locking
- Incorrect propagation selection
- Missing rollback handling
- Cross-service transaction assumptions

These issues can create latency, scalability, and consistency problems.

Spring transaction interceptor automatically rolls back:

- RuntimeException
- Error

Spring does NOT automatically rollback checked exceptions unless configured.

Example:

```java
@Transactional(
rollbackFor = Exception.class
)
```

Use case:

- Custom business exception handling

## Transaction Observability

Important metrics:

- Transaction duration
- Rollback count
- Commit count
- Lock wait time
- Deadlock frequency
- Database response latency
- Connection pool utilization

Production optimization should be driven by measurement and monitoring.

## Production Engineering Perspective

Transaction management knowledge helps with:

- Production troubleshooting
- Data consistency management
- Failure recovery design
- Distributed system architecture
- Microservice reliability
- Multi-database workflows
- Scalability engineering
- Operational debugging

Engineers should understand both transaction abstractions and database execution behavior.

## Interview Questions

1. What are ACID properties?
2. What does @Transactional do?
3. REQUIRED vs REQUIRES_NEW?
4. What are isolation levels?
5. READ_COMMITTED vs REPEATABLE_READ?
6. What causes dirty reads?
7. What is a distributed transaction?
8. Saga Pattern vs Two-Phase Commit?
9. When does Spring roll back a transaction?
10. How would you troubleshoot transaction failures in production?

## Quick Revision

- ACID ensures consistency and reliability.
- @Transactional manages transaction boundaries.
- REQUIRED is the default propagation mode.
- REQUIRES_NEW creates an independent transaction.
- Isolation levels control visibility.
- Distributed consistency is difficult.
- Saga Pattern is common in microservices.
- Monitor transaction latency, rollbacks, and locks.

Transaction management knowledge helps:

- Production troubleshooting
- Data consistency handling
- Distributed system design
- Failure recovery strategy
- Microservice reliability
- Multi database architecture
- Transaction boundary optimization

## Interview Focus Areas

Common discussions:

- @Transactional
- Propagation
- Isolation levels
- Distributed transactions
- Rollback behavior
- Multiple database handling
- Transaction boundary design
- Saga Pattern
- Outbox Pattern
- Two Phase Commit
- Checked vs unchecked exception rollback
- Transaction propagation use cases
- Distributed consistency handling