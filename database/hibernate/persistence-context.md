# Persistence Context

Persistence Context is a collection of managed entity objects maintained by Hibernate or JPA.

It tracks entity state changes and synchronizes them with the database.

Persistence Context acts as an in-memory representation of database entities.

## Entity Lifecycle States

Hibernate/JPA entity objects move through multiple states.

### Transient State

Entity object exists in memory but is NOT associated with persistence context.

Example:

```java
Employee emp = new Employee();
emp.setName("John");
# Persistence Context

Persistence Context is a collection of managed entity objects maintained by Hibernate or JPA.

It tracks entity state changes and synchronizes them with the database.

Persistence Context acts as an in-memory representation of database entities.

## Entity Lifecycle States

Hibernate/JPA entity objects move through multiple states.

### Transient State

Entity object exists in memory but is NOT associated with persistence context.

Example:

```java
Employee emp = new Employee();
emp.setName("John");
```

Characteristics:

- No database record exists
- No primary key assigned
- Not managed by Hibernate

### Persistent State

Entity becomes managed by persistence context.

Example:

```java
session.persist(employee);
```

Characteristics:

- Managed by Hibernate
- Changes automatically synchronized
- Dirty checking enabled

### Detached State

Entity was managed previously but no longer belongs to persistence context.

Example:

```java
session.evict(employee);
```

Characteristics:

- Entity has primary key
- Not managed by persistence context
- Changes are not automatically synchronized

Detached objects can be reattached using:

```java
session.merge(employee);
```

## Persistence Context Operations

Common operations:

- persist()
- merge()
- remove()
- detach()
- refresh()

## First Level Cache

First level cache exists inside Hibernate Session.

Characteristics:

- Enabled by default
- Session scoped
- Improves performance
- Prevents repeated database queries

Example:

```java
Employee e1 = session.get(Employee.class, 1);
Employee e2 = session.get(Employee.class, 1);
```

Second retrieval uses cache.

No additional database query executes.

## Persistence Context vs Database

Persistence Context:

- In-memory entity management
- Tracks modifications
- Supports dirty checking

Database:

- Permanent storage
- Actual persistence layer

## Detaching Entity Without Closing Session

Methods:

```java
session.evict(entity);

session.clear();

entityManager.detach(entity);
```

Use cases:

- Memory optimization
- Long running batch processing
- Prevent unwanted updates

## Backend Engineering Perspective

Persistence Context knowledge helps:

- Hibernate troubleshooting
- Performance optimization
- Transaction debugging
- Microservice persistence layer design
- Database interaction optimization