

# Query Techniques

Hibernate provides multiple approaches to query and retrieve data efficiently.

Choosing the proper query strategy improves performance, maintainability, and scalability.

## Hibernate Query Language (HQL)

HQL (Hibernate Query Language) is an object-oriented query language.

HQL operates on entity objects instead of database tables.

Example:

```java
String hql = "FROM Employee WHERE salary > :salary";

Query<Employee> query = session.createQuery(hql, Employee.class);
query.setParameter("salary", 100000);
```

Advantages:

- Database independent
- Object oriented querying
- Supports joins and aggregation
- Reduces SQL boilerplate

Backend engineering usage:

- Enterprise applications
- Dynamic filtering
- Reporting systems

## Criteria API

Criteria API provides type-safe dynamic query generation.

Example:

```java
CriteriaBuilder cb = entityManager.getCriteriaBuilder();
CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
Root<Employee> root = cq.from(Employee.class);

cq.select(root)
  .where(cb.gt(root.get("salary"), 100000));
```

Advantages:

- Dynamic query generation
- Compile-time safety
- Better refactoring support

Backend engineering usage:

- Search APIs
- Dynamic filtering systems
- Complex enterprise queries

## Restrictions

Restrictions are used to limit retrieved data.

Examples:

```java
salary > 100000
```

```java
department = 'Platform'
```

Common restriction scenarios:

- Filtering
- Search operations
- Conditional retrieval

## Criteria vs DetachedCriteria

Criteria:

- Requires Session
- Online query construction
- Executes immediately

DetachedCriteria:

- Independent of Session
- Query can be built offline
- Session required only during execution

Backend engineering usage:

- Multi-layer enterprise architecture
- Delayed query execution

## Named Queries

Named queries are predefined reusable queries.

Example:

```java
@NamedQuery(
name = "Employee.findActive",
query = "FROM Employee WHERE active=true"
)
```

Advantages:

- Query reuse
- Better maintainability
- Faster startup validation

## Pagination

Pagination prevents loading large datasets.

Example:

```java
query.setFirstResult(0);
query.setMaxResults(20);
```

Backend engineering perspective:

- Reduces memory usage
- Improves API performance
- Supports scalable backend systems

## Projection

Projection retrieves selected columns instead of entire entities.

Example:

```java
SELECT name, salary FROM Employee
```

Benefits:

- Reduced memory usage
- Better performance
- Lower database overhead

## get() vs load()

get():

- Immediately hits database
- Returns null if object not found

Example:

```java
Employee employee = session.get(Employee.class, 1);
```

load():

- Returns proxy object
- Database query executes when needed
- Throws exception if object missing

Example:

```java
Employee employee = session.load(Employee.class, 1);
```

Backend engineering usage:

- get() for validation workflows
- load() for lazy access optimization

## Filtering Strategies

Common filtering approaches:

- HQL filtering
- Criteria filtering
- Named parameter filtering

Example:

```java
query.setParameter("department", "Platform");
```

## Backend Engineering Perspective

Query optimization knowledge helps:

- Production troubleshooting
- Database optimization
- API optimization
- Large dataset handling
- Query performance tuning

## Interview Focus Areas

Common discussions:

- HQL
- Criteria API
- Restrictions
- Pagination
- Named Queries
- get() vs load()
- Projection
- Query optimization