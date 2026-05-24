# Transaction Management

Transaction management ensures database consistency and maintains data integrity.

A transaction follows ACID properties:

- Atomicity
- Consistency
- Isolation
- Durability

Transaction management is critical for enterprise backend systems and distributed applications.

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

Backend engineering perspective:

- Reduces transaction boilerplate
- Simplifies consistency handling
- Improves maintainability

## Transaction Propagation

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

Backend engineering considerations:

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

## Backend Engineering Perspective

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