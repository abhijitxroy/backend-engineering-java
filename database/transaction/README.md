# Database Transactions

Database transaction concepts and consistency engineering discussions organized for scalable backend systems and production engineering scenarios.

## Why Transactions Matter

Transactions are fundamental for maintaining consistency and reliability in backend systems.

Transaction design directly affects:

- Data consistency
- Failure recovery
- Application reliability
- Distributed workflows
- Scalability
- User experience

Many production incidents originate from incorrect transaction boundaries, locking behavior, or consistency assumptions.

## Transaction Engineering Areas

Coverage:

- ACID Properties
- Transaction Lifecycle
- Commit
- Rollback
- Isolation Levels
- Transaction Propagation
- Distributed Transaction
- Multiple Database Transaction
- Consistency Handling
- Microservice Transaction Strategy

## Transaction Goals

A transaction should guarantee:

- Correctness
- Consistency
- Recoverability
- Isolation
- Durability

These goals are typically implemented using ACID principles.

## ACID Properties

Atomicity:

Transaction executes fully or rollback happens.

Example:

```text
Debit Account A

Credit Account B

Failure

Rollback
```

Consistency:

Database remains in valid state.

Isolation:

Concurrent transactions do not corrupt data.

Durability:

Committed transaction survives failures.

## ACID Summary

| Property | Purpose |
| -------- | ------- |
| Atomicity | All or nothing execution |
| Consistency | Valid state transitions |
| Isolation | Safe concurrent execution |
| Durability | Permanent committed changes |

## Transaction Lifecycle

Flow:

```text
Start Transaction

↓

Read Data

↓

Modify Data

↓

Commit

or

Rollback
```

## Commit and Rollback

Commit:

Persist transaction changes.

Example:

```sql
COMMIT;
```

Rollback:

Undo transaction changes.

Example:

```sql
ROLLBACK;
```

## Isolation Levels

Coverage:

- Read Uncommitted
- Read Committed
- Repeatable Read
- Serializable

## Isolation Level Comparison

| Isolation Level | Dirty Read | Non Repeatable Read | Phantom Read |
| --------------- | ---------- | ------------------- | ------------ |
| Read Uncommitted | Possible | Possible | Possible |
| Read Committed | Prevented | Possible | Possible |
| Repeatable Read | Prevented | Prevented | Possible |
| Serializable | Prevented | Prevented | Prevented |

## Read Uncommitted

Possible Issue:

- Dirty Read

## Read Committed

Prevents:

- Dirty Read

Possible Issue:

- Non Repeatable Read

## Repeatable Read

Prevents:

- Dirty Read
- Non Repeatable Read

Possible Issue:

- Phantom Read

## Serializable

Highest isolation guarantee.

Tradeoff:

- Lower concurrency

## Dirty Read

Example:

Transaction A:

```text
Update salary

No commit
```

Transaction B:

```text
Read modified salary
```

Rollback happens.

Transaction B consumed invalid data.

## Non Repeatable Read

Example:

Same row read twice.

Between reads another transaction modifies value.

## Phantom Read

Example:

Query returns different row count due to concurrent insert.

## Transaction Propagation

Coverage:

- REQUIRED
- REQUIRES_NEW
- SUPPORTS
- MANDATORY
- NEVER

REQUIRED:

Uses existing transaction or creates new.

REQUIRES_NEW:

Always creates independent transaction.

## Propagation Comparison

| Propagation | Existing Transaction | New Transaction |
| ----------- | ------------------- | --------------- |
| REQUIRED | Joins existing | If needed |
| REQUIRES_NEW | Suspends existing | Always |
| SUPPORTS | Uses existing | No |
| MANDATORY | Requires existing | No |
| NEVER | Fails if present | No |

## Distributed Transaction

Multiple services or databases participate in single business operation.

Challenges:

- Consistency
- Retry handling
- Failure recovery

Strategies:

- Saga Pattern
- Choreography
- Orchestration

Common challenges:

- Network failures
- Partial success scenarios
- Service outages
- Retry complexity
- Data reconciliation

Modern microservices often prefer eventual consistency approaches over traditional distributed transactions.

## One Database vs Multiple Database Transaction

Single Database:

- Easier consistency

Multiple Database:

- Complex coordination
- Distributed consistency concerns

## Deadlocks

A deadlock occurs when multiple transactions wait indefinitely for each other.

Common causes:

- Inconsistent lock ordering
- Long-running transactions
- Excessive locking

Mitigation:

- Consistent access order
- Smaller transaction scope
- Retry mechanisms

## Consistency Across Microservices

Approaches:

- Event Driven Consistency
- Saga Pattern
- Retry Strategy
- Idempotency

## Transaction Observability

Important metrics:

- Transaction duration
- Commit count
- Rollback count
- Deadlock frequency
- Lock wait time
- Retry count
- Database response latency

Production optimization should be driven by monitoring and measurement.

## Production Transaction Engineering

Production systems commonly require:

- Consistency management
- Failure recovery design
- Deadlock troubleshooting
- Isolation tuning
- Retry handling
- Distributed workflow design
- Capacity planning
- Reliability engineering
- Scalability engineering
- Operational debugging

## Interview Questions

1. What are ACID properties?
2. What is a transaction?
3. Commit vs Rollback?
4. What is a Dirty Read?
5. What is a Non Repeatable Read?
6. What is a Phantom Read?
7. Isolation levels comparison?
8. What is a deadlock?
9. Saga Pattern vs Distributed Transactions?
10. How would you troubleshoot transaction failures in production?

## Quick Revision

- ACID ensures consistency and reliability.
- Transactions group related operations.
- Commit persists changes.
- Rollback reverses changes.
- Isolation levels control concurrency behavior.
- Distributed consistency is difficult.
- Deadlocks impact availability.
- Monitor transaction latency, rollbacks, and lock contention.