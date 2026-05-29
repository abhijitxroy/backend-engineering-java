# Distributed Database

Distributed database concepts and backend engineering discussions organized for scalable backend systems and production engineering scenarios.

## Why Distributed Databases Matter

As applications grow, a single database instance eventually becomes a scalability and availability bottleneck.

Distributed databases help address:

- Large data volumes
- High request throughput
- Global user distribution
- High availability requirements
- Disaster recovery requirements

Distributed databases trade simplicity for scalability, availability, and operational flexibility.

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

### Common Use Cases

- Large-scale e-commerce platforms
- Social media systems
- Financial transaction platforms
- SaaS applications
- Global multi-region services

## Why Distributed Database

Distributed database architecture improves scalability and availability.

Benefits:

- Horizontal scaling
- Fault tolerance
- Higher throughput
- Better availability

## CAP Theorem

Distributed systems must balance:

- Consistency
- Availability
- Partition Tolerance

During a network partition, a system typically chooses between:

- Consistency first
- Availability first

CAP theorem is a foundational concept for distributed database design.

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

## Replication Models

### Leader-Follower Replication

- Single write node
- Multiple read replicas
- Simple operational model

### Multi-Leader Replication

- Multiple write nodes
- Better regional availability
- Conflict resolution challenges

### Leaderless Replication

- Distributed write handling
- Higher availability
- More complex consistency management

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

## Rebalancing Challenges

As clusters grow, data redistribution becomes necessary.

Common challenges:

- Data movement cost
- Temporary performance degradation
- Replica synchronization
- Hot partition creation
- Operational complexity

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

Consistency trade-offs:

| Consistency Model    | Characteristics           |
| -------------------- | ------------------------- |
| Strong Consistency   | Latest data guaranteed    |
| Eventual Consistency | Temporary divergence allowed |
| Causal Consistency   | Preserves causal ordering |
| Session Consistency  | Consistent user session view |

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

## Hot Partition Problem

Poor shard key selection can create hotspots where a small number of partitions receive most traffic.

Symptoms:

- Uneven load distribution
- Increased latency
- Reduced throughput
- Resource exhaustion

Mitigation:

- Better shard key design
- Adaptive partitioning
- Traffic distribution strategies

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

## Multi-Region Considerations

Global database deployments commonly require:

- Geo-replication
- Regional failover
- Cross-region latency management
- Data residency compliance
- Disaster recovery planning

## Production Distributed Database Engineering

Production systems commonly require:

- Shard balancing
- Replica lag troubleshooting
- Distributed consistency validation
- Capacity planning
- Cluster scaling
- Multi-region architecture
- Fault recovery workflows
- Disaster recovery testing
- Database observability
- Operational troubleshooting

## Interview Questions

1. What is the difference between sharding and replication?
2. What is CAP theorem?
3. How do you select a shard key?
4. What causes hot partitions?
5. Strong consistency vs eventual consistency?
6. Leader-follower vs multi-leader replication?
7. What is replica lag?
8. How do distributed databases achieve scalability?
9. What challenges occur during rebalancing?
10. How would you design a globally distributed database?

## Quick Revision

- Sharding improves scalability.
- Replication improves availability.
- CAP theorem drives distributed database trade-offs.
- Strong consistency improves correctness.
- Eventual consistency improves availability.
- Shard key selection is critical.
- Monitor replica lag and partition health.
- Design for scalability, reliability, and recovery.