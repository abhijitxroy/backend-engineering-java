# Transaction Propagation Example

Transaction propagation defines how Spring transactions behave when one transactional method calls another transactional method.

Propagation controls transaction boundaries and transaction participation.

Understanding propagation is important for enterprise backend systems, microservices, and production transaction management.

## Why Transaction Propagation Matters

Transaction propagation controls how transactional operations interact when multiple service methods participate in the same business workflow.

Common examples:

- Order processing
- Payment workflows
- Inventory management
- Audit logging
- Notification processing
- Financial transactions

Correct propagation configuration is critical for consistency, reliability, and failure handling.

## Transaction Propagation Types

Spring provides multiple propagation strategies:

- REQUIRED
- REQUIRES_NEW
- SUPPORTS
- MANDATORY
- NOT_SUPPORTED
- NEVER
- NESTED

## Choosing the Right Propagation

| Propagation | Existing Transaction Present | Creates New Transaction |
| ----------- | ---------------------------- | ----------------------- |
| REQUIRED | Joins existing | If needed |
| REQUIRES_NEW | Suspends existing | Always |
| SUPPORTS | Uses existing | No |
| MANDATORY | Requires existing | No |
| NOT_SUPPORTED | Suspends existing | No |
| NEVER | Fails if present | No |
| NESTED | Uses savepoints | Nested scope |

## REQUIRED (Default)

Uses existing transaction.

Creates a new transaction if none exists.

Example:

```java
@Transactional(
propagation =
Propagation.REQUIRED
)
```

Enterprise usage:

- Service layer operations
- Order processing
- Inventory updates

Flow:

```text
Order Service
      ↓
Payment Service

Single Transaction
```

## REQUIRES_NEW

Always creates a new transaction.

Existing transaction becomes suspended.

Example:

```java
@Transactional(
propagation =
Propagation.REQUIRES_NEW
)
```

Enterprise usage:

- Audit logging
- Notification persistence
- Independent tracking records

Flow:

```text
Order Service
      ↓

Payment Service
      ↓

Audit Service

Audit commits independently
```

Backend engineering benefit:

- Independent commit
- Failure isolation

Common production use cases:

- Audit records
- Compliance logging
- Notification tracking
- Workflow history

## SUPPORTS

Uses existing transaction if available.

Runs without transaction otherwise.

Example:

```java
@Transactional(
propagation =
Propagation.SUPPORTS
)
```

Enterprise usage:

- Read operations
- Reporting APIs

Typical scenarios:

- Read-only services
- Reporting operations
- Optional transactional participation

## MANDATORY

Requires an existing transaction.

Throws exception if transaction does not exist.

Example:

```java
@Transactional(
propagation =
Propagation.MANDATORY
)
```

Enterprise usage:

- Shared business workflow

## NOT_SUPPORTED

Executes without transaction.

Suspends existing transaction.

Example:

```java
@Transactional(
propagation =
Propagation.NOT_SUPPORTED
)
```

Enterprise usage:

- Reporting
- Long-running analytics

## NEVER

Must execute without transaction.

Throws exception if transaction exists.

Example:

```java
@Transactional(
propagation =
Propagation.NEVER
)
```

Enterprise usage:

- Validation service
- External read-only operations

## NESTED

Creates nested transaction using savepoints.

Example:

```java
@Transactional(
propagation =
Propagation.NESTED
)
```

Enterprise usage:

- Partial rollback scenarios

Example:

```text
Order Processing
      ↓
Inventory Update
      ↓
Audit Logging

Audit rollback

Inventory remains committed
```

Important note:

NESTED support depends on the underlying transaction manager and database capabilities.

## Enterprise Backend Example

Scenario:

```text
Order Service

→ Payment Service

→ Inventory Service

→ Audit Service
```

Recommendation:

```text
Payment
→ REQUIRED

Inventory
→ REQUIRED

Audit
→ REQUIRES_NEW
```

Reason:

Audit logs should persist independently.

## Common Propagation Mistakes

Common problems:

- Overusing REQUIRES_NEW
- Large transaction boundaries
- Long-running transactions
- Unexpected rollback behavior
- Hidden transactional dependencies

These issues can cause performance problems and operational complexity.

## Production Engineering Perspective

Transaction propagation knowledge helps with:

- Production troubleshooting
- Failure recovery
- Consistency management
- Service orchestration
- Database reliability
- Operational debugging
- Workflow design
- Enterprise backend architecture

Engineers must understand both transactional behavior and rollback implications.

## Interview Questions

1. What is transaction propagation?
2. REQUIRED vs REQUIRES_NEW?
3. When should REQUIRES_NEW be used?
4. What happens when REQUIRED joins an existing transaction?
5. What is the purpose of SUPPORTS?
6. What does MANDATORY enforce?
7. When should NOT_SUPPORTED be used?
8. How does NESTED differ from REQUIRES_NEW?
9. What causes unexpected rollback behavior?
10. How would you troubleshoot transaction failures in production?

## Quick Revision

- REQUIRED is the default propagation mode.
- REQUIRES_NEW creates an independent transaction.
- SUPPORTS participates only when a transaction exists.
- MANDATORY requires an existing transaction.
- NOT_SUPPORTED executes outside transactions.
- NEVER fails when a transaction exists.
- NESTED uses savepoints.
- Transaction boundaries directly affect consistency and reliability.