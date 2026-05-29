# Database Indexing

Database indexing concepts and query optimization discussions organized for scalable backend systems and production engineering scenarios.

## Why Indexing Matters

Indexing is one of the most important database performance optimization techniques.

Proper indexing directly impacts:

- Query latency
- Database scalability
- Application throughput
- Resource utilization
- Infrastructure costs

Many production database incidents are caused by missing, inefficient, or poorly designed indexes.

## Index Engineering Areas

Coverage:

- Clustered Index
- Non Clustered Index
- Composite Index
- Unique Index
- Primary Key Index
- Covering Index
- Query Optimization
- Execution Plan Analysis

## How Indexes Work

Indexes are specialized data structures that help databases locate rows efficiently without scanning entire tables.

Typical flow:

```text
Query
  ↓
Index Lookup
  ↓
Matching Rows
  ↓
Result Set
```

The objective is to reduce expensive full table scans.

## Why Indexing

Index improves database query performance by reducing full table scans.

Benefits:

- Faster lookup
- Reduced IO operations
- Better query performance
- Improved backend scalability

Common use cases:

- Primary key lookups
- Search APIs
- Reporting systems
- Analytics queries
- High-traffic transactional systems

## Clustered Index

Clustered index stores table data physically in indexed order.

Characteristics:

- One clustered index per table
- Faster range queries
- Physical ordering

Example:

```sql
CREATE CLUSTERED INDEX idx_employee_id
ON employee(id);
```

## Non Clustered Index

Non clustered index stores index structure separately from table data.

Characteristics:

- Multiple indexes supported
- Additional storage required
- Pointer based lookup

Example:

```sql
CREATE INDEX idx_employee_name
ON employee(employee_name);
```

## Composite Index

Composite index improves filtering across multiple columns.

Example:

```sql
CREATE INDEX idx_department_salary
ON employee(
 department,
 salary
);
```

Considerations:

- Column order matters
- Query pattern driven design

Composite indexes follow the leftmost-prefix principle.

Example:

```sql
(department, salary)
```

Supports:

- department
- department + salary

Does not efficiently support:

- salary alone

## Covering Index

Covering index contains all required query columns.

Benefits:

- Reduced table access
- Faster query execution

Example:

```sql
CREATE INDEX idx_employee_covering
ON employee(department, salary, employee_name);
```

Covering indexes can eliminate additional table lookups.

## Query Optimization

Examples:

- Reduce SELECT * usage
- Proper filtering
- Efficient JOIN strategy
- Index tuning
- Query plan validation

## Common Indexing Mistakes

Common problems:

- Too many indexes
- Missing indexes
- Unused indexes
- Incorrect column order
- Indexing low-selectivity columns
- Ignoring query patterns

Poor indexing can negatively impact both reads and writes.

## Execution Plan Analysis

Execution plan helps identify:

- Full table scan
- Index scan
- Costly operation
- Join bottleneck

Examples:

- EXPLAIN
- EXPLAIN ANALYZE

Important execution plan indicators:

- Index Seek
- Index Scan
- Table Scan
- Nested Loop Join
- Hash Join
- Sort Operations

## Clustered vs Non Clustered Index

| Feature | Clustered | Non Clustered |
| ------- | --------- | ------------- |
| Data Storage | Physical Ordering | Separate Structure |
| Count Per Table | One | Multiple |
| Range Query Performance | Better | Moderate |
| Storage Overhead | Lower | Higher |
| Lookup Flexibility | Lower | Higher |

## Production Index Engineering

Production systems commonly require:

- Slow query troubleshooting
- Index tuning
- Execution plan analysis
- Query latency optimization
- Capacity planning
- Large table optimization
- Write-performance balancing
- Database observability
- Scalability engineering
- Operational debugging

## Interview Questions

1. What is a database index?
2. Why do indexes improve performance?
3. Clustered vs Non Clustered Index?
4. What is a Composite Index?
5. What is a Covering Index?
6. What is the leftmost-prefix rule?
7. Why can too many indexes be harmful?
8. What is an Index Seek vs Table Scan?
9. How do you analyze an execution plan?
10. How would you troubleshoot a slow query in production?

## Quick Revision

- Indexes reduce full table scans.
- Clustered indexes determine physical row order.
- Non-clustered indexes use separate structures.
- Composite index column order matters.
- Covering indexes reduce table access.
- Too many indexes hurt write performance.
- Always analyze execution plans.
- Indexing is critical for scalability.