# Distributed Database

Distributed database concepts and backend engineering discussions organized for scalable backend systems and production engineering scenarios.

## Distributed Database Fundamentals

Coverage:

- Sharding
- Replication
- Partitioning
- Fault Tolerance
- Distributed Consistency
- Horizontal Scaling
- Shard Key
- Data Distribution
- Orchestration
- Choreography

## Why Distributed Database

Distributed database architecture improves scalability and availability.

Benefits:

- Horizontal scaling
- Fault tolerance
- Higher throughput
- Better availability

## Sharding

Sharding distributes data across multiple database nodes.

Benefits:

- Scalability
- Reduced database bottleneck
- Large dataset handling

Challenges:

- Rebalancing
- Cross shard query complexity

## Replication

Replication creates multiple copies of database data.

Benefits:

- High availability
- Disaster recovery
- Read scaling

## Replication vs Sharding

Replication:

- Same data copied across nodes
- Improves fault tolerance
- Improves read scalability

Sharding:

- Data distributed across nodes
- Improves write scalability
- Reduces storage bottleneck

Replication focuses on availability.

Sharding focuses on scalability.

## Partitioning

Partitioning divides large table data.

Examples:

- Range Partition
- Hash Partition
- List Partition

Benefits:

- Faster query execution
- Better maintainability

## Partition vs Group

Partition:

- Data distribution strategy
- Database scaling technique

Group:

- Logical data grouping
- Operational organization

Partition benefits:

- Scalability
- Query optimization

Grouping benefits:

- Data organization
- Better maintainability

## Partition vs Sharding

Partition:

- Logical division
- Usually within database system

Sharding:

- Physical distribution across systems

## Fault Tolerance

Approaches:

- Replication
- Retry strategy
- Backup recovery

## Distributed Consistency

Examples:

- Strong Consistency
- Eventual Consistency

Microservice consistency approaches:

- Saga Pattern
- Event Driven Consistency
- Retry Strategy
- Idempotency
- Outbox Pattern

## Shard Key Selection

Good shard key characteristics:

- High cardinality
- Balanced distribution
- Reduced hotspot issue

Good shard key examples:

- Customer ID
- User ID
- Order ID

Bad shard key examples:

- Country
- Boolean field
- Low cardinality column

Problems:

- Data hotspot
- Uneven distribution
- Query bottleneck

## Data Consistency Between Microservices

Approaches:

- Choreography
- Orchestration
- Event Driven Architecture
- Distributed Transaction Strategy

Production considerations:

- Retry handling
- Duplicate prevention
- Idempotency
- Failure recovery

## Orchestration vs Choreography

Orchestration:

Central coordinator manages flow.

Choreography:

Services coordinate using events.

## Production Engineering Discussions

Examples:

- Shard balancing
- Replica lag troubleshooting
- Distributed consistency handling
- Microservice consistency validation
- Database scalability optimization
- Fault recovery strategy

## Notes

Distributed database design directly impacts scalability, availability and backend reliability.