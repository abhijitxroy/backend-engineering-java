

# MongoDB

MongoDB concepts and NoSQL backend engineering discussions organized for scalable distributed systems and production engineering scenarios.

## Why MongoDB Matters

MongoDB is one of the most widely used NoSQL databases for modern backend systems.

It is commonly selected for:

- Flexible schema requirements
- Rapid application development
- Large-scale distributed systems
- High write throughput workloads
- Global scalability requirements

MongoDB provides document-oriented storage while supporting replication, sharding, and distributed architectures.

## MongoDB Engineering Areas

Coverage:

- Collection
- Document
- BSON
- Embedded Documents
- Schema Design
- CRUD Operations
- Aggregation Pipeline
- Lookup
- Match
- Composite Index
- Replication
- Sharding
- Connection Types

## Core MongoDB Concepts

| Concept | Description |
| -------- | ----------- |
| Database | Logical container for collections |
| Collection | Group of documents |
| Document | BSON record |
| BSON | Binary JSON representation |
| Replica Set | High availability deployment |
| Shard | Horizontal partition of data |

## NoSQL Database Types

Examples:

- Key Value Database
- Document Database
- Column Database
- Graph Database

Examples Technologies:

- MongoDB
- Redis
- Cassandra
- Neo4j

When MongoDB is a good choice:

- Semi-structured data
- Rapidly evolving schemas
- Content management systems
- Product catalogs
- Event-driven systems

When relational databases may be better:

- Complex joins
- Strong transactional requirements
- Highly relational data models

## Lookup and Match

Lookup:

Used for join style operations across collections.

Match:

Used for filtering pipeline data.

Example:

```javascript
{
 $match: {
   status: "ACTIVE"
 }
}
```

## Embedding vs Referencing

### Embedding

Benefits:

- Faster reads
- Fewer joins
- Simpler queries

### Referencing

Benefits:

- Reduced duplication
- Better normalization
- Easier relationship management

Schema design should be driven by query patterns.

## MongoDB Join Performance

Considerations:

- Reduce large lookup operations
- Use indexing strategy
- Prefer embedding where appropriate
- Optimize aggregation pipeline

General guidance:

- Prefer embedding when relationships are frequently accessed together.
- Use $lookup carefully on large collections.
- Always validate aggregation performance using explain plans.

## Composite Index

Composite index improves query performance when multiple fields participate in filtering.

Example:

```javascript
db.employee.createIndex(
 {
   department:1,
   employeeId:1
 }
)
```

## Indexing Strategy

Common index types:

- Single Field Index
- Compound Index
- Text Index
- TTL Index
- Geospatial Index

Indexes improve query performance but increase write overhead and storage usage.

## MongoDB vs DynamoDB

| Feature | MongoDB | DynamoDB |
| ------- | -------- | -------- |
| Database Type | Document Database | Key Value Database |
| Query Flexibility | High | Moderate |
| Join Capability | Limited | Limited |
| Scaling Model | Sharding | Managed Scaling |
| Operations | Self Managed or Managed | Fully Managed |
| Use Cases | General Purpose | High Scale Managed Workloads |

## Collection Operations

Create Collection:

```javascript
db.createCollection("employee")
```

Drop Collection:

```javascript
db.employee.drop()
```

## Connection Types

Examples:

- Standalone
- Replica Set
- Sharded Cluster

Mongo communication approaches:

- MongoClient connection
- Replica Set connection
- SRV connection string

Examples:

Standalone:

mongodb://localhost:27017

Replica Set:

mongodb://node1:27017,node2:27017,node3:27017/?replicaSet=rs0

SRV:

mongodb+srv://cluster.mongodb.net

Production considerations:

- Connection pooling
- Replica awareness
- Retry handling
- Read preference optimization

## Replication

Replication creates multiple copies of data.

Benefits:

- Fault tolerance
- High availability
- Disaster recovery

Replica Set roles:

- Primary Node
- Secondary Node
- Arbiter (optional)

Replication improves availability but introduces replication lag considerations.

## Sharding

Sharding distributes data across multiple nodes.

Benefits:

- Horizontal scaling
- High throughput
- Large dataset support

## Shard Key Selection

A shard key determines data distribution.

Good shard keys:

- Distribute traffic evenly
- Avoid hotspots
- Support common query patterns

Poor shard key selection can create scalability bottlenecks.

## Production MongoDB Engineering

Production systems commonly require:

- Query optimization
- Index tuning
- Aggregation optimization
- Shard key analysis
- Replica lag monitoring
- Capacity planning
- Database observability
- Scalability engineering
- Disaster recovery planning
- Operational debugging

## Interview Questions

1. What is MongoDB?
2. MongoDB vs relational databases?
3. What is BSON?
4. Embedding vs Referencing?
5. What is a Replica Set?
6. What is Sharding?
7. How do you choose a shard key?
8. What is replication lag?
9. What index types are available in MongoDB?
10. How would you troubleshoot slow MongoDB queries?

## Quick Revision

- MongoDB is a document database.
- BSON is the underlying storage format.
- Embedding improves read performance.
- Referencing reduces duplication.
- Replica Sets provide high availability.
- Sharding provides horizontal scaling.
- Indexes improve query performance.
- Shard key selection is critical for scalability.