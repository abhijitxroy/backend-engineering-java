

# Chain of Responsibility Pattern

## What Is Chain of Responsibility Pattern?

Chain of Responsibility is a behavioral design pattern that passes a request through a chain of handlers.

Each handler can:

- Process the request
- Partially process the request
- Pass the request to the next handler
- Stop further processing

This pattern allows request-processing logic to be decoupled from the client.

## Why Chain of Responsibility Matters

Chain of Responsibility helps:

- Build middleware pipelines
- Reduce coupling
- Improve extensibility
- Simplify request processing
- Support framework development

It is one of the most commonly used design patterns in backend systems.

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Spring Security Filter Chain |
| ⭐⭐⭐⭐⭐ | API Gateway Filters |
| ⭐⭐⭐⭐⭐ | Request Validation Pipelines |
| ⭐⭐⭐⭐⭐ | Servlet Filters |
| ⭐⭐⭐⭐ | Logging Pipelines |
| ⭐⭐⭐⭐ | Authorization Checks |

## Problem Without Chain of Responsibility

Without the pattern:

```text
Client
   ↓
Validation
   ↓
Authentication
   ↓
Authorization
   ↓
Logging
   ↓
Business Logic
```

The client becomes tightly coupled to the entire workflow.

Adding new processing steps often requires modifying existing code.

## Solution Using Chain of Responsibility

```text
Client
   ↓
Handler 1
   ↓
Handler 2
   ↓
Handler 3
   ↓
Handler N
```

Each handler focuses on a single responsibility.

## Core Components

### Handler

Defines the processing contract.

```java
public interface Handler {
    void setNext(Handler next);
    void handle(Request request);
}
```

### Abstract Handler

```java
public abstract class AbstractHandler implements Handler {

    protected Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    protected void next(Request request) {
        if (next != null) {
            next.handle(request);
        }
    }
}
```

### Concrete Handler

```java
public class AuthenticationHandler extends AbstractHandler {

    @Override
    public void handle(Request request) {
        System.out.println("Authentication Completed");
        next(request);
    }
}
```

### Client

```java
Handler auth = new AuthenticationHandler();
Handler logging = new LoggingHandler();

auth.setNext(logging);
auth.handle(request);
```

## Real Backend Examples

### Spring Security

```text
Request
   ↓
Authentication Filter
   ↓
Authorization Filter
   ↓
Security Context Filter
   ↓
Controller
```

This is one of the best real-world examples of Chain of Responsibility.

### API Gateway

```text
Request
   ↓
Rate Limiting
   ↓
Authentication
   ↓
Authorization
   ↓
Routing
```

### Request Validation

```text
Input Validation
        ↓
Business Validation
        ↓
Security Validation
```

### Logging Pipeline

```text
Request Logger
      ↓
Performance Logger
      ↓
Audit Logger
```

## Chain of Responsibility vs Observer

| Feature | Chain of Responsibility | Observer |
| -------- | ---------------------- | -------- |
| Purpose | Process Request | Notify Subscribers |
| Flow | Sequential | Broadcast |
| Execution | Handler Chain | Multiple Observers |
| Common Usage | Middleware | Event Systems |

## Chain of Responsibility vs Command

| Feature | Chain of Responsibility | Command |
| -------- | ---------------------- | ------- |
| Purpose | Request Pipeline | Request Object |
| Focus | Processing Flow | Action Encapsulation |
| Workflow Support | Strong | Strong |
| Queue Support | Limited | Native Fit |

## Advantages

- Loose coupling
- Easy extensibility
- Cleaner request pipelines
- Better separation of concerns
- Supports framework development

## Disadvantages

- Request flow can become difficult to debug
- Processing order matters
- Long chains can affect performance

## Spring Framework Mapping

| Pattern Usage | Spring Example |
| ------------- | -------------- |
| Security Processing | Security Filter Chain |
| Request Processing | Servlet Filters |
| Interception | HandlerInterceptor |
| API Middleware | Gateway Filters |

## Production Engineering Perspective

Chain of Responsibility is heavily used in:

- Spring Security
- API Gateways
- Middleware Pipelines
- Request Processing Engines
- Validation Frameworks
- Observability Platforms
- Logging Systems
- Enterprise Applications

If a backend engineer understands Spring Security internals, they already understand Chain of Responsibility.

## Interview Questions

1. What is Chain of Responsibility Pattern?
2. What problem does it solve?
3. How does it reduce coupling?
4. Chain of Responsibility vs Observer?
5. Chain of Responsibility vs Command?
6. What are the core components?
7. How is Spring Security related to this pattern?
8. Where is it used in API Gateways?
9. What are the advantages and disadvantages?
10. When should this pattern be used?

## Quick Revision

- Request passes through multiple handlers.
- Each handler has a single responsibility.
- Handlers can stop or continue processing.
- Common in middleware and filter chains.
- Spring Security is the most famous example.
- Reduces coupling.
- Improves extensibility.
- Must-know pattern for backend engineers.