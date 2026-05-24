# Kafka

Kafka is a distributed event streaming platform designed for scalable backend systems, fault tolerance and event driven architectures.

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

One message is processed once within same consumer group.

Different Consumer Groups:

Message can be consumed independently by multiple consumer groups.

## Duplicate Message Handling

Strategies:

- Consumer Group
- Idempotent Message Handler
- Offset Management
- Database Deduplication

Examples:

- Store processed message IDs
- Ignore duplicate processing
- Unique business transaction ID

## Message Ordering

Kafka guarantees ordering within partition.

Strategies:

- Same key same partition
- Retry tuning
- Partition selection strategy

## Producer Tuning

Examples:

- linger.ms
- batch.size
- compression.type
- retries
- enable.idempotence
- acks

## Consumer Tuning

Examples:

- fetch.min.bytes
- fetch.max.bytes
- max.poll.records
- session.timeout.ms
- heartbeat.interval.ms

## Kafka Message Size

Default Kafka message size:

- 1 MB

15 MB handling considerations:

Producer:

- max.request.size

Broker:

- message.max.bytes
- replica.fetch.max.bytes

Consumer:

- fetch.max.bytes
- max.partition.fetch.bytes

Large payload strategy above 50 MB:

- Object storage reference pattern
- Chunking strategy
- External storage approach

## Replication Factor

Replication factor represents number of copies across brokers.

Benefits:

- Fault tolerance
- High availability
- Data durability

## ACK and ISR

ACK:

Producer acknowledgement mechanism.

Examples:

- acks=0
- acks=1
- acks=all

ISR:

In Sync Replica.

Purpose:

- Reliability
- Data consistency
- Fault tolerance

## Dead Letter Queue

Dead Letter Queue receives failed messages consumer could not process.

Benefits:

- Retry isolation
- Failure debugging
- Consumer stability

## Kafka Connect

Kafka Connect integrates Kafka with external systems.

Examples:

- Elasticsearch
- JDBC
- S3
- MongoDB

Kafka vs Kafka Connect:

- Kafka → event streaming platform
- Kafka Connect → integration framework

## Event Driven Architecture

Flow:

Producer
↓
Kafka Topic
↓
Consumer

Benefits:

- Loose coupling
- Scalability
- Fault tolerance
- Async communication

## Production Engineering Discussions

Examples:

- Duplicate prevention
- Consumer lag troubleshooting
- Offset troubleshooting
- Partition strategy
- Throughput optimization
- Reliability engineering

## Structure

examples/
- ProducerExample.java
- ConsumerExample.java
- DeadLetterQueueExample.java
- ConsumerGroupExample.java
- OffsetManagementExample.java
- IdempotentConsumerExample.java

## Notes

Kafka enables scalable backend event streaming with reliability, ordering guarantees and fault tolerance.