# Messaging Engineering

Messaging engineering focuses on asynchronous communication, event-driven architectures, distributed coordination, scalability, and reliability within backend systems.

Production messaging systems become significantly more complex when moving from local development environments into distributed production ecosystems.

Messaging engineering does not operate independently from:

- backend services
- APIs
- databases
- caching systems
- observability platforms
- deployment workflows
- reliability engineering practices
- operational debugging workflows

Kafka is one of the most widely adopted distributed event streaming platforms used for production messaging systems.

## Messaging Engineering Areas

Coverage includes:

- Event-driven architectures
- Message brokers
- Publish-subscribe systems
- Event streaming platforms
- Consumer coordination
- Message reliability
- Delivery guarantees
- Ordering strategies
- Retry workflows
- Dead letter queues
- Distributed communication patterns
- Operational messaging workflows

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

## Production Messaging Engineering

Production messaging systems commonly require:

- Duplicate message prevention
- Consumer lag troubleshooting
- Offset troubleshooting
- Partition strategy design
- Throughput optimization
- Reliability engineering
- Capacity planning
- Failure recovery workflows
- Distributed observability
- Message traceability
- Scalability engineering

## Ecosystem Alignment

This section focuses on messaging engineering ownership.

Related engineering concerns are intentionally covered in other repositories:

- infrastructure platforms
- deployment engineering
- platform engineering
- release engineering
- large-scale architecture design

This repository focuses on practical messaging implementation, event-driven communication patterns, operational behavior, and production engineering considerations.

## Structure

examples/
- ProducerExample.java
- ConsumerExample.java
- DeadLetterQueueExample.java
- ConsumerGroupExample.java
- OffsetManagementExample.java
- IdempotentConsumerExample.java

## Operational Engineering Perspective

Messaging systems become critical as backend platforms scale beyond synchronous communication models.

Production engineers should understand:

- delivery guarantees
- ordering trade-offs
- consumer coordination
- reliability patterns
- failure recovery
- scalability constraints
- operational troubleshooting
- observability workflows

Messaging engineering is a core capability for building scalable and reliable distributed backend systems.