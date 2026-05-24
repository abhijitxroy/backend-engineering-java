# Entity Lifecycle

Hibernate entities move through different lifecycle states during application execution.

Understanding entity lifecycle is important for transaction handling, persistence management, and backend optimization.

## Entity States

Hibernate entity lifecycle contains four major states:

- Transient
- Persistent
- Detached
- Removed

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

Backend engineering perspective:

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

Example:

```java
employee.setSalary(120000);
```

Hibernate automatically detects entity modifications.

Update query executes automatically during flush or transaction commit.

Backend engineering perspective:

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

Backend engineering perspective:

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

Backend engineering perspective:

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

## Persistence Context Relationship

Persistent entities remain managed by Persistence Context.

Detached entities remain outside Persistence Context.

Transient entities never enter Persistence Context until persisted.

Removed entities remain managed until transaction completion.

## Backend Engineering Production Considerations

Lifecycle understanding helps:

- Transaction troubleshooting
- Performance optimization
- Memory management
- Persistence debugging
- Production issue analysis
- Persistence layer optimization
- LazyInitializationException troubleshooting
- Detached entity debugging
- Transaction boundary issue analysis

## Interview Focus Areas

Common interview discussions:

- Transient vs Persistent vs Detached vs Removed
- Dirty Checking
- merge() vs persist()
- Entity lifecycle transitions
- Persistence Context interaction
- Session management