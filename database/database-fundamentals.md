# Database Fundamentals

Database systems provide structured storage, retrieval and management of application data.

Database knowledge is fundamental for backend engineering, distributed systems and application performance optimization.

## Why Database Fundamentals Matter

Databases are the foundation of most backend systems.

Database design directly affects:

- Application performance
- Scalability
- Reliability
- Data consistency
- Disaster recovery
- Operational complexity

Strong database fundamentals are required for backend engineering, system design, and production troubleshooting.

## Database Engineering Areas

Coverage:

- Data Models
- Transactions
- ACID Properties
- Indexing
- Query Optimization
- Locking
- Replication
- Sharding
- CAP Theorem
- Distributed Data Management

## Data Models

Common database models:

- Relational Database
- Key Value Database
- Document Database
- Column Family Database
- Graph Database

Examples:

- MySQL
- PostgreSQL
- MongoDB
- Redis
- Cassandra

## Database Model Comparison

| Database Type | Best For |
| ------------- | -------- |
| Relational | Strong consistency and structured data |
| Key Value | High-speed lookups |
| Document | Flexible schemas |
| Column Family | Large-scale analytics workloads |
| Graph | Relationship-heavy datasets |

## ACID Properties

### Atomicity

A transaction fully succeeds or fully fails.

### Consistency

Database moves from one valid state to another valid state.

### Isolation

Concurrent transactions should not interfere incorrectly.

### Durability

Committed data persists even after failures.

## ACID Summary

| Property | Purpose |
| -------- | ------- |
| Atomicity | All or nothing execution |
| Consistency | Valid state transitions |
| Isolation | Safe concurrent execution |
| Durability | Permanent committed changes |

## Transactions

Common transaction operations:

- BEGIN
- COMMIT
- ROLLBACK

Isolation Levels:

- Read Uncommitted
- Read Committed
- Repeatable Read
- Serializable

## Isolation Level Comparison

| Isolation Level | Dirty Read | Non Repeatable Read | Phantom Read |
| --------------- | ---------- | ------------------- | ------------ |
| Read Uncommitted | Possible | Possible | Possible |
| Read Committed | Prevented | Possible | Possible |
| Repeatable Read | Prevented | Prevented | Possible |
| Serializable | Prevented | Prevented | Prevented |

## Indexing

Indexes improve query performance.

Common index types:

- Primary Index
- Clustered Index
- Non Clustered Index
- Composite Index
- Unique Index

Tradeoff:

More indexes improve read performance but increase write cost.

Production impact:

- Faster queries
- Lower latency
- Better scalability
- Reduced database load

Poor indexing is one of the most common causes of database performance issues.

## Normalization

Common forms:

- 1NF
- 2NF
- 3NF
- BCNF

## Query Optimization

Optimization areas:

- Index tuning
- Query execution plans
- Connection pooling
- Partitioning
- Caching

Common performance issues:

- Missing indexes
- Full table scans
- Large result sets
- Excessive joins
- Inefficient sorting
- Poor filtering conditions

## CAP Theorem

Distributed systems tradeoffs:

- Consistency
- Availability
- Partition Tolerance

## CAP Summary

| Property | Description |
| -------- | ----------- |
| Consistency | Same data view across nodes |
| Availability | Requests receive responses |
| Partition Tolerance | System survives network partitions |

## Locking

Concurrency control approaches:

- Shared Lock
- Exclusive Lock
- Optimistic Lock
- Pessimistic Lock

## MVCC

Multi Version Concurrency Control improves concurrent transaction handling.

Examples:

- PostgreSQL
- MySQL InnoDB

## Deadlock

Deadlock prevention approaches:

- Consistent lock ordering
- Small transactions
- Timeout handling

## Replication Strategies

- Primary Replica
- Multi Primary
- Synchronous Replication
- Asynchronous Replication

Replication benefits:

- High availability
- Disaster recovery
- Read scalability
- Fault tolerance

## Partitioning vs Sharding

Partitioning splits large datasets logically.

Sharding distributes data across multiple database instances.

Quick comparison:

| Technique | Scope |
| ---------- | ----- |
| Partitioning | Within a database |
| Sharding | Across multiple databases |

## Production Database Engineering

Production systems commonly require:

- Query optimization
- Index tuning
- Replication management
- High availability architecture
- Capacity planning
- Backup and recovery
- Scalability engineering
- Database observability
- Reliability engineering
- Operational debugging

## Distributed Database Concepts

Important topics:

- Eventual Consistency
- Distributed Transactions
- Saga Pattern
- Outbox Pattern
- Replication
- Sharding
- CAP Theorem

## Interview Questions

1. What are ACID properties?
2. What is database normalization?
3. What is indexing?
4. Clustered vs Non-Clustered Index?
5. What is MVCC?
6. CAP Theorem explained?
7. Partitioning vs Sharding?
8. What causes deadlocks?
9. How does replication improve availability?
10. How would you troubleshoot a slow database?

## Quick Revision

- Databases store and manage application data.
- ACID ensures consistency and reliability.
- Indexes improve query performance.
- MVCC improves concurrency.
- Replication improves availability.
- Sharding improves scalability.
- CAP defines distributed system tradeoffs.
- Query optimization should be driven by execution plans.