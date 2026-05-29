# SQL

SQL concepts and relational database engineering discussions organized for scalable backend systems and production engineering scenarios.

## Why SQL Matters

SQL remains the foundation of most enterprise backend systems.

SQL knowledge directly impacts:

- Query performance
- Database scalability
- Application reliability
- Reporting systems
- Data consistency
- Production troubleshooting

Strong SQL skills are essential for backend engineering, database optimization, and system design.

## SQL Engineering Areas

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

## SQL Execution Flow

Typical execution order:

```text
FROM
 ↓
WHERE
 ↓
GROUP BY
 ↓
HAVING
 ↓
SELECT
 ↓
ORDER BY
```

Understanding execution flow helps explain query behavior and performance characteristics.

## DELETE vs TRUNCATE

DELETE:

- Removes selected rows
- Supports WHERE clause
- Can rollback transaction

TRUNCATE:

- Removes complete table data
- Faster operation
- Resets identity counter

## DELETE vs TRUNCATE Comparison

| Feature | DELETE | TRUNCATE |
| ------- | ------ | -------- |
| WHERE Support | Yes | No |
| Row Removal | Selected Rows | Entire Table |
| Logging | More | Less |
| Speed | Slower | Faster |
| Identity Reset | Usually No | Usually Yes |

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

COUNT():

- Counts records

- SUM()

SUM():

- Calculates total value

- AVG()

AVG():

- Calculates average

- MAX()

MAX():

- Returns highest value

- MIN()

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

## Join Selection Guide

| Join Type | Typical Usage |
| --------- | ------------- |
| INNER JOIN | Matching records only |
| LEFT JOIN | Optional relationships |
| RIGHT JOIN | Less common reporting queries |
| FULL JOIN | Data reconciliation |
| SELF JOIN | Hierarchical data |
| CROSS JOIN | Combinational datasets |

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

Production use cases:

- Ranking systems
- Leaderboards
- Analytics dashboards
- Running totals
- Trend analysis

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

General guidance:

- Views prioritize simplicity and consistency.
- Materialized Views prioritize performance.
- Materialized Views require refresh management.

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

## Database Relationships

Common relationship types:

- One-to-One
- One-to-Many
- Many-to-One
- Many-to-Many

Relationship design directly impacts normalization, query complexity, and scalability.

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

## Common SQL Performance Problems

Common issues:

- Missing indexes
- Full table scans
- Excessive joins
- Large result sets
- N+1 query patterns
- Poor filtering conditions
- Inefficient sorting

Performance tuning should always be driven by execution plan analysis.

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

## Production SQL Engineering

Production systems commonly require:

- Query tuning
- Execution plan analysis
- Database optimization
- Large table management
- Reporting optimization
- Capacity planning
- Database observability
- Scalability engineering
- Reliability engineering
- Operational debugging

## Interview Questions

1. DELETE vs TRUNCATE?
2. WHERE vs HAVING?
3. GROUP BY vs DISTINCT?
4. INNER JOIN vs LEFT JOIN?
5. UNION vs UNION ALL?
6. What are Window Functions?
7. View vs Materialized View?
8. Primary Key vs Unique Key?
9. How do you optimize slow SQL queries?
10. How do you analyze execution plans?

## Quick Revision

- SQL is foundational for relational databases.
- WHERE filters rows before grouping.
- HAVING filters grouped results.
- UNION removes duplicates.
- UNION ALL is faster.
- Window Functions perform calculations across result sets.
- Materialized Views store computed data.
- Always validate performance using execution plans.