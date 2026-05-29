# Entity Lifecycle

Hibernate entities move through different lifecycle states during application execution.

Understanding entity lifecycle is important for transaction handling, persistence management, and backend optimization.

## Why Entity Lifecycle Matters

Entity lifecycle management is one of the most important Hibernate concepts because it directly affects:

- Transaction behavior
- Database synchronization
- Memory usage
- Persistence performance
- Application scalability

Many production Hibernate issues originate from misunderstanding entity state transitions.

## Entity States

Hibernate entity lifecycle contains four major states:

- Transient
- Persistent
- Detached
- Removed

## Lifecycle Overview

| State | Managed By Hibernate | Database Record Exists |
| ----- | -------------------- | ---------------------- |
| Transient | No | No |
| Persistent | Yes | Yes |
| Detached | No | Yes |
| Removed | Yes | Yes (until commit) |

## Transient State

Entity exists only in application memory.

Example:

```java
Employee employee = new Employee();
employee.setName("Alex");
```

Characteristics:

- Not associated with Session
- No database record exists
- Hibernate does not track changes

Common creation methods:

```java
Employee employee = new Employee();
```

Production engineering perspective:

- Object exists only in JVM memory
- No database interaction occurs
- Suitable for object initialization

## Persistent State

Entity becomes associated with Hibernate Session.

Example:

```java
session.persist(employee);
```

Characteristics:

- Managed by Hibernate
- Database synchronization enabled
- Dirty checking active
- Changes automatically tracked

Important behavior:

- Changes are tracked automatically
- Dirty checking is active
- Explicit update statements are usually unnecessary

Example:

```java
employee.setSalary(120000);
```

Hibernate automatically detects entity modifications.

Update query executes automatically during flush or transaction commit.

Production engineering perspective:

- Hibernate manages object lifecycle
- Reduces boilerplate update logic
- Simplifies transaction management

## Detached State

Entity leaves persistence context.

Example:

```java
session.evict(employee);
```

Characteristics:

- Database identity remains available
- Hibernate no longer tracks modifications
- Detached changes require merge() to synchronize changes using a managed entity instance

Common causes:

- Session closure
- Persistence Context cleanup
- Serialization workflows
- Long-running business processes

Reattach detached entity:

```java
session.merge(employee);
```

Other detach mechanisms:

```java
session.clear();

session.close();

entityManager.detach(employee);
```

Production engineering perspective:

- Useful for long-running workflows
- Prevents unnecessary persistence tracking
- Helps memory optimization

## Removed State

Entity scheduled for deletion.

Example:

```java
session.remove(employee);
```

Characteristics:

- Managed entity marked for removal
- Database deletion occurs during flush or commit
- Object eventually removed from persistence layer

Production engineering perspective:

- Deletion participates in transaction boundary
- Rollback support available

## State Transition Flow

```text
Transient
   ↓ persist()
Persistent
   ↓ evict() / clear() / close()
Detached
   ↓ merge()
Persistent
   ↓ remove()
Removed
```

## Common Lifecycle APIs

| Operation | State Transition |
| --------- | ---------------- |
| persist() | Transient → Persistent |
| merge() | Detached → Persistent |
| remove() | Persistent → Removed |
| evict() | Persistent → Detached |
| clear() | Persistent → Detached |
| detach() | Persistent → Detached |

## Dirty Checking

Hibernate automatically identifies modified entity fields.

Example:

```java
employee.setDepartment("Platform");
```

No explicit update query required.

Hibernate synchronizes automatically during flush or transaction commit.

Benefits:

- Reduced boilerplate code
- Better productivity
- Transaction consistency
- Simplified persistence handling

Production benefits:

- Reduced SQL boilerplate
- Automatic synchronization
- Cleaner business logic

Potential risks:

- Unexpected updates
- Large persistence contexts
- Performance overhead for excessive managed entities

## Persistence Context Relationship

Persistence Context manages entity state and lifecycle.

| State | Inside Persistence Context |
| ----- | -------------------------- |
| Transient | No |
| Persistent | Yes |
| Detached | No |
| Removed | Yes |

Understanding Persistence Context behavior is essential for Hibernate troubleshooting and performance tuning.

## Production Engineering Considerations

Lifecycle knowledge helps with:

- Transaction troubleshooting
- Persistence debugging
- Memory optimization
- LazyInitializationException analysis
- Detached entity troubleshooting
- ORM performance tuning
- Scalability engineering
- Production incident investigation

Engineers should understand both lifecycle behavior and generated SQL execution patterns.

## Interview Questions

1. What are Hibernate entity lifecycle states?
2. What is a Persistent entity?
3. What is a Detached entity?
4. What causes an entity to become Detached?
5. persist() vs merge()?
6. What is Dirty Checking?
7. Why are explicit update statements often unnecessary?
8. How does Persistence Context interact with entity lifecycle?
9. What causes LazyInitializationException?
10. How would you troubleshoot lifecycle-related issues in production?

## Quick Revision

- Transient entities are not managed.
- Persistent entities are managed by Hibernate.
- Detached entities exist outside Persistence Context.
- Removed entities are scheduled for deletion.
- Dirty Checking tracks changes automatically.
- persist() creates managed entities.
- merge() reattaches detached state.
- Persistence Context controls lifecycle management.