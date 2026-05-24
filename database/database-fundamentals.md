# Backend Engineering Java

Resources and notes related to backend engineering in Java.

## Fundamentals

Database foundation topics are maintained inside:

- database-fundamentals.md

Coverage includes:

- Data Models
- ACID Properties
- Transactions
- Isolation Levels
- Indexing
- Normalization
- Query Optimization

## Backend Engineering Perspective

Database engineering discussions for scalable backend systems and production architecture considerations.
# Database Fundamentals

Database systems provide structured storage, retrieval and management of application data.

Database knowledge is fundamental for backend engineering, distributed systems and application performance optimization.

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

## ACID Properties

### Atomicity

A transaction fully succeeds or fully fails.

### Consistency

Database moves from one valid state to another valid state.

### Isolation

Concurrent transactions should not interfere incorrectly.

### Durability

Committed data persists even after failures.

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

## CAP Theorem

Distributed systems tradeoffs:

- Consistency
- Availability
- Partition Tolerance

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

## Partitioning vs Sharding

Partitioning splits large datasets logically.

Sharding distributes data across multiple database instances.

## Backend Engineering Perspective

Production discussions:

- Database Scalability
- Replication
- High Availability
- Read Replicas
- Sharding
- Backup Strategy
- Disaster Recovery
- HikariCP
- Slow Query Analysis
- Explain Plan
- N+1 Query Problem

## Distributed Systems Discussions

- Eventual Consistency
- Distributed Transactions
- Saga Pattern
- Outbox Pattern

## Notes

Database fundamentals directly influence backend system scalability, latency, throughput and reliability.