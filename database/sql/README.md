# SQL

SQL concepts and relational database engineering discussions organized for scalable backend systems and production engineering scenarios.

## SQL Fundamentals

Coverage:

- SELECT
- INSERT
- UPDATE
- DELETE
- WHERE
- GROUP BY
- HAVING
- ORDER BY
- DISTINCT
- UNION
- Aggregate Functions
- CASE Statement
- JOIN Operations
- Window Functions

## DELETE vs TRUNCATE

DELETE:

- Removes selected rows
- Supports WHERE clause
- Can rollback transaction

TRUNCATE:

- Removes complete table data
- Faster operation
- Resets identity counter

## WHERE vs HAVING

WHERE:

- Filters rows before grouping

Example:

```sql
SELECT *
FROM employee
WHERE salary > 50000;
```

HAVING:

- Filters grouped data

Example:

```sql
SELECT department,
COUNT(*)
FROM employee
GROUP BY department
HAVING COUNT(*) > 5;
```

## GROUP BY vs DISTINCT

GROUP BY:

- Aggregates grouped records

DISTINCT:

- Removes duplicate values

## Aggregate Functions

Examples:

- COUNT()
- SUM()
- AVG()
- MAX()
- MIN()

COUNT():
- Counts records

SUM():
- Calculates total value

AVG():
- Calculates average

MAX():
- Returns highest value

MIN():
- Returns lowest value

## CASE Statement

Example:

```sql
SELECT employee_name,

CASE

WHEN salary > 100000
THEN 'HIGH'

WHEN salary > 50000
THEN 'MEDIUM'

ELSE 'LOW'

END

FROM employee;
```

## JOIN Types

Coverage:

- INNER JOIN
- LEFT JOIN
- RIGHT JOIN
- FULL JOIN
- SELF JOIN
- CROSS JOIN

INNER JOIN:
- Returns matching records from both tables

LEFT JOIN:
- Returns all left table records and matching right table records

RIGHT JOIN:
- Returns all right table records and matching left table records

FULL JOIN:
- Returns matching and non matching records from both tables

## UNION vs UNION ALL

UNION:

- Removes duplicate rows

UNION ALL:

- Keeps duplicates
- Better performance

UNION considerations:
- Column count should match
- Data types should be compatible
- Column order should align

## Window Functions

Examples:

- ROW_NUMBER()
- RANK()
- DENSE_RANK()
- LEAD()
- LAG()

Example:

```sql
SELECT

employee_name,

salary,

ROW_NUMBER()
OVER(
PARTITION BY department
ORDER BY salary DESC
)

FROM employee;
```

Can aggregate function be used as window function?

Yes.

Example:

```sql
SELECT
department,
SUM(salary)
OVER(
PARTITION BY department
)
FROM employee;
```

## Function vs Procedure

Function:

- Returns value
- Used inside query

Procedure:

- Performs business operation
- Can return multiple outputs

## Stored Procedure

Stored procedure is reusable SQL logic stored inside database.

Benefits:

- Code reuse
- Better maintainability
- Reduced application logic
- Performance optimization

Why Stored Procedure:

- Centralized business logic
- Reduced network calls
- Better security

## View vs Materialized View

View:

- Stores query definition

Materialized View:

- Stores actual computed data

## View vs Synonym

View:

- Virtual table
- Stores query definition

Synonym:

- Alias for database object
- Improves abstraction

## Trigger

Trigger executes automatically during database events.

Examples:

- INSERT trigger
- UPDATE trigger
- DELETE trigger

## Primary Key vs Unique Key vs Foreign Key

Primary Key:

- Unique identifier
- Cannot contain NULL

Unique Key:

- Unique values
- NULL allowed depending on database

Foreign Key:

- Maintains relationship between tables

## PK vs FK

Primary Key:

Parent table identifier.

Foreign Key:

Reference to parent table.

## MERGE Statement

MERGE combines:

- INSERT
- UPDATE
- DELETE

Example:

```sql
MERGE employee_target target

USING employee_source source

ON (
target.id = source.id
)

WHEN MATCHED THEN

UPDATE

SET

target.salary =
source.salary

WHEN NOT MATCHED THEN

INSERT VALUES(
source.id,
source.salary
);
```

## Database Backup Discussions

Coverage:

- Full Backup
- Incremental Backup
- Differential Backup
- Recovery Strategy

Database Backup Examples:

- Export Import
- Dump Restore
- One Database To Another Database Backup

## Text To Date Conversion

MySQL:

```sql
SELECT DATE_FORMAT(
'31-01-2021',
'%d-%m-%Y'
) AS date_value;
```

## Yesterday Date Example

MySQL:

```sql
SELECT DATE_SUB(
SYSDATE(),
INTERVAL 1 DAY
) AS previous_day;
```

## Function Restriction Discussion

Function may not be usable from SELECT when operation performs transactional modification depending on database implementation.

## SQL Query Optimization Steps

Approaches:

- Use indexes properly
- Avoid SELECT *
- Validate execution plan
- Optimize JOIN operations
- Reduce unnecessary scans

## SQL Performance Discussions

Examples:

- Query optimization
- Execution plan analysis
- Index optimization
- Efficient filtering
- Join optimization

## Query Validation

Validation approaches:

- EXPLAIN
- EXPLAIN ANALYZE
- Query execution plan
- Index validation

## Production Engineering Discussions

Examples:

- Query tuning
- Database scalability
- Large table optimization
- Performance troubleshooting
- Backend persistence optimization

## Notes

SQL remains foundational for backend engineering systems requiring strong consistency and relational modeling.