# Transaction Propagation Example

Transaction propagation defines how Spring transactions behave when one transactional method calls another transactional method.

Propagation controls transaction boundaries and transaction participation.

Understanding propagation is important for enterprise backend systems, microservices, and production transaction management.

## Transaction Propagation Types

Spring provides multiple propagation strategies:

- REQUIRED
- REQUIRES_NEW
- SUPPORTS
- MANDATORY
- NOT_SUPPORTED
- NEVER
- NESTED

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

## Backend Engineering Perspective

Transaction propagation knowledge helps:

- Production troubleshooting
- Transaction consistency
- Failure recovery
- Distributed workflow handling
- Enterprise backend reliability

## Interview Focus Areas

Common discussions:

- REQUIRED vs REQUIRES_NEW
- SUPPORTS
- MANDATORY
- NOT_SUPPORTED
- NESTED
- Transaction boundary handling
- Independent transaction management