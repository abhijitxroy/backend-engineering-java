# Kafka

Kafka is a distributed event streaming platform designed for high throughput, fault tolerance and scalable event driven systems.

## Kafka Fundamentals

Coverage:

- Producer
- Consumer
- Broker
- Topic
- Partition
- Consumer Group
- Offset Management
- Replication Factor
- Fault Tolerance
- ACK
- ISR
- Retry Handling
- Dead Letter Queue
- Event Driven Architecture

## Consumer Group

Consumer group enables workload distribution across consumers.

Behavior:

Same Consumer Group:

```text
Partition 0
   ↓

Consumer A
```

Message processed once within group.

Different Consumer Groups:

```text
Consumer Group A
       ↓
     Message

Consumer Group B
       ↓
     Message
```

Message consumed independently.

## Duplicate Message Handling

Strategies:

- Consumer Group
- Idempotent Message Handler
- Offset Management
- Transaction Support

Examples:

- Store processed message IDs
- Ignore duplicate processing
- Database unique constraints

## Idempotent Message Handler

Goal:

Prevent duplicate processing.

Approaches:

- Message key tracking
- Database deduplication
- Redis deduplication cache
- Unique business transaction ID

## Message Ordering

Kafka guarantees ordering within partition.

Strategies:

- Same key → same partition
- Partition selection strategy
- Retry tuning

Configuration considerations:

```properties
max.in.flight.requests.per.connection=1
enable.idempotence=true
acks=all
retries=Integer.MAX_VALUE
```

Retry ordering considerations:

- enable.idempotence=true
- max.in.flight.requests.per.connection=1
- retries=Integer.MAX_VALUE

Purpose:

- Preserve ordering
- Reduce duplicate processing

## Producer Tuning

Examples:

```properties
linger.ms
batch.size
compression.type
acks
retries
enable.idempotence
```

## Consumer Tuning

Examples:

```properties
fetch.min.bytes
fetch.max.bytes
max.poll.records
session.timeout.ms
heartbeat.interval.ms
```

## Assign and Seek

Assign:

Manual partition assignment.

Seek:

Move consumer offset manually.

Examples:

- Replay messages
- Debugging
- Recovery flow

Backend engineering usage:

- Reprocessing failed events
- Controlled offset recovery
- Consumer troubleshooting

## Kafka Message Size

Default:

```text
1 MB
```

Large Message Handling:

15 MB example:

Producer:

```properties
max.request.size
```

Broker:

```properties
message.max.bytes
replica.fetch.max.bytes
```

Consumer:

```properties
fetch.max.bytes
max.partition.fetch.bytes
```

Above 50 MB considerations:

- External storage strategy
- Object storage reference pattern
- Chunking strategy

## Replication Factor

Definition:

Number of copies maintained across brokers.

Benefits:

- Fault tolerance
- High availability
- Data durability

Example:

Replication Factor = 3

```text
Broker 1 → Leader

Broker 2 → Replica

Broker 3 → Replica
```

## ACK and ISR

ACK:

Producer acknowledgement strategy.

Examples:

```text
acks=0
acks=1
acks=all
```

ISR:

In Sync Replica.

Purpose:

Maintain reliability and fault tolerance.

## Dead Letter Queue

Dead Letter Queue receives messages consumer failed to process.

Benefits:

- Retry isolation
- Failure debugging
- Prevent consumer blockage

## Kafka Connect

Kafka Connect enables external system integration.

Examples:

- Elasticsearch
- JDBC
- S3
- MongoDB

Kafka vs Kafka Connect:

| Feature | Kafka | Kafka Connect |
|----------|--------|----------------|
| Purpose | Messaging Platform | Integration Framework |
| Data Movement | Producer Consumer | Connector Based |
| Usage | Event Streaming | System Integration |

Connector examples used in backend systems:

- Elasticsearch Sink Connector
- JDBC Source Connector
- JDBC Sink Connector
- S3 Sink Connector

## Kafka ELK Integration

Flow:

Application
↓
Kafka
↓
Kafka Connect
↓
Elasticsearch
↓
Kibana

Benefits:

- Observability
- Analytics
- Search capability

## Event Driven Architecture

Pattern:

```text
Producer

↓

Kafka Topic

↓

Consumer
```

Benefits:

- Loose coupling
- Scalability
- Fault tolerance
- Async communication

## Kafka vs Traditional MQ

Kafka Advantages:

- High throughput
- Event replay capability
- Horizontal scalability
- Consumer independence

Limitations:

- Operational complexity
- Ordering guarantee only within partition
- Large payload handling limitations

## Production Engineering Discussions

Examples:

- Duplicate prevention
- Consumer lag troubleshooting
- Offset troubleshooting
- Partition strategy
- Throughput optimization
- Reliability engineering
- Message acknowledgement validation
- Delivery confirmation strategy

## Message Delivery Confirmation

Microservice communication confirmation approaches:

- Consumer offset commit
- ACK validation
- Retry verification
- Dead Letter Queue monitoring

Can Kafka message be consumed twice?

Yes.

Scenarios:

- Consumer rebalance
- Retry processing
- Offset replay

Prevention:

- Idempotent consumer
- Offset management
- Deduplication strategy

## Notes

Kafka enables scalable event driven backend architecture with high throughput and fault tolerance.