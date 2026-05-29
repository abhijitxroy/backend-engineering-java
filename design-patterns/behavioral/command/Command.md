

# Command Pattern

## What Is Command Pattern?

Command Pattern is a behavioral design pattern that converts a request into an object.

The request object contains:

- Operation to execute
- Receiver information
- Required parameters

This allows requests to be queued, logged, retried, stored, scheduled, or executed later.

## Why Command Pattern Matters

The pattern helps:

- Decouple request sender from receiver
- Support undo and redo operations
- Implement task scheduling
- Enable asynchronous processing
- Simplify workflow orchestration

Command Pattern is commonly used in enterprise applications, workflow engines, event-driven systems, and backend platforms.

## Problem Without Command Pattern

```text
Client
   ↓
Service A
   ↓
Service B
   ↓
Database
```

The caller becomes tightly coupled to implementation details.

Changes in execution logic often require caller modifications.

## Solution Using Command Pattern

```text
Client
   ↓
Command
   ↓
Invoker
   ↓
Receiver
```

The client creates a command object while the invoker executes it.

## Core Components

### Command

Defines the execution contract.

```java
public interface Command {
    void execute();
}
```

### Concrete Command

Implements business logic and calls the receiver.

```java
public class CreateOrderCommand implements Command {

    private final OrderService orderService;

    public CreateOrderCommand(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void execute() {
        orderService.createOrder();
    }
}
```

### Receiver

Contains actual business logic.

```java
public class OrderService {

    public void createOrder() {
        System.out.println("Order created");
    }
}
```

### Invoker

Executes commands.

```java
public class CommandInvoker {

    public void execute(Command command) {
        command.execute();
    }
}
```

### Client

Creates and wires objects.

```java
OrderService service = new OrderService();
Command command = new CreateOrderCommand(service);

CommandInvoker invoker = new CommandInvoker();
invoker.execute(command);
```

## Real Backend Examples

### Job Scheduling

```text
Schedule Report Job
        ↓
ReportCommand
        ↓
Scheduler
        ↓
Report Service
```

### Message Processing

```text
Kafka Message
       ↓
ProcessOrderCommand
       ↓
Consumer Worker
       ↓
Order Service
```

### Workflow Engine

```text
Approve Request Command
Reject Request Command
Escalate Request Command
```

Each workflow action becomes an executable command.

## Command Pattern vs Strategy Pattern

| Feature | Command | Strategy |
| -------- | -------- | -------- |
| Purpose | Encapsulate request | Encapsulate algorithm |
| Focus | Action execution | Behavior selection |
| Supports Queueing | Yes | No |
| Supports Undo | Yes | No |
| Workflow Friendly | Yes | Limited |

## Advantages

- Loose coupling
- Better extensibility
- Supports scheduling
- Supports retries
- Supports asynchronous execution
- Easier auditing
- Easier workflow implementation

## Disadvantages

- Additional classes
- More abstraction layers
- Slightly higher complexity for small applications

## Production Engineering Perspective

Command Pattern is useful for:

- Workflow engines
- Job schedulers
- Event-driven systems
- Kafka consumers
- CQRS architectures
- Audit logging
- Retry mechanisms
- Distributed processing systems

It is frequently used when requests must be executed independently of the caller.

## Interview Questions

1. What is Command Pattern?
2. Why is Command Pattern used?
3. Command Pattern vs Strategy Pattern?
4. What are the main components of Command Pattern?
5. How does Command Pattern reduce coupling?
6. How does Command Pattern support undo operations?
7. Where is Command Pattern used in backend systems?
8. How does Command Pattern help workflow engines?
9. How can Command Pattern support asynchronous processing?
10. When should Command Pattern be avoided?

## Quick Revision

- Command Pattern encapsulates requests as objects.
- Sender and receiver remain loosely coupled.
- Supports scheduling and retries.
- Supports asynchronous execution.
- Common in workflow systems and job processing.
- Invoker executes commands.
- Receiver contains business logic.
- Frequently used in enterprise backend applications.