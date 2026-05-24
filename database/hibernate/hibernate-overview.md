

# Hibernate and JPA Overview

Hibernate is an Object Relational Mapping (ORM) framework used to simplify database interaction in Java applications.

JPA (Java Persistence API) is a specification for object relational persistence. Hibernate is one of the most widely used JPA implementations.

## What JPA Gives Us

JPA provides:

- ORM abstraction
- Reduced JDBC boilerplate code
- Entity lifecycle management
- Transaction integration
- Caching support
- Query abstraction
- Database portability

## Hibernate vs JDBC

| Feature | Hibernate | JDBC |
|----------|------------|------|
| Abstraction | ORM framework | Low level API |
| SQL Generation | Automatic | Manual |
| Boilerplate Code | Reduced | More |
| Caching | Supported | Manual |
| Database Portability | Better | Lower |
| Object Mapping | Built in | Manual |

Backend engineering perspective:

- JDBC gives more control
- Hibernate improves productivity
- Hibernate is preferred for enterprise applications
- JDBC is useful for high performance custom queries

## Session vs SessionFactory

Session:

- Lightweight object
- Represents a single unit of work
- Not thread safe
- Used for CRUD operations

SessionFactory:

- Heavyweight object
- Created once during application startup
- Thread safe
- Maintains Hibernate metadata
- Usually singleton scoped

## Can Multiple SessionFactory Objects Exist

Yes.

Multiple SessionFactory objects are possible when applications interact with multiple databases.

Backend engineering usage:

- Multi database applications
- Data segregation
- Legacy integration scenarios

However SessionFactory creation is expensive and should be minimized.

## JPA Equivalent of Session

Hibernate Session equivalent in JPA:

EntityManager

SessionFactory equivalent:

EntityManagerFactory

## Session Thread Safety

Session is NOT thread safe.

Use one session per request or transaction boundary.

## SessionFactory Thread Safety

SessionFactory IS thread safe.

Single shared instance is recommended.

## getCurrentSession() vs openSession()

getCurrentSession():

- Managed by framework transaction context
- Automatically closed
- Recommended in Spring applications

openSession():

- Creates new session manually
- Manual lifecycle management required
- Useful for standalone scenarios

## Hibernate Entity Requirements

A Java object becomes Hibernate entity when:

- Class marked with @Entity
- Primary key exists using @Id
- Default constructor available
- Serializable preferred for distributed systems

## HQL (Hibernate Query Language)

HQL is an object oriented query language.

Example:

select e from Employee e where e.salary > 100000

Features:

- Database independent
- Entity oriented querying
- Supports joins and aggregations

## Backend Engineering Perspective

Hibernate knowledge is important for:

- Spring Boot applications
- Enterprise backend systems
- Microservices persistence layer design
- Database optimization
- Production troubleshooting