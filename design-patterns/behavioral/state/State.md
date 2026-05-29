

# State Pattern

## What Is State Pattern?

State Pattern is a behavioral design pattern that allows an object to change its behavior when its internal state changes.

The object appears to change its class behavior without modifying client code.

State Pattern encapsulates state-specific behavior into separate state objects.

## Why State Pattern Matters

State Pattern helps:

- Eliminate complex conditional logic
- Improve maintainability
- Support state-driven workflows
- Simplify business rule management
- Reduce coupling between states

It is commonly used in workflow systems, order processing, approval engines, and enterprise applications.

## Problem Without State Pattern

Without State Pattern:

```text
if (status == CREATED)
else if (status == APPROVED)
else if (status == SHIPPED)
else if (status == DELIVERED)
```

As states increase, conditional logic becomes difficult to maintain.

## Solution Using State Pattern

```text
Context
   ↓
Current State
   ↓
State Specific Behavior
```

Each state manages its own behavior and transitions.

## Core Components

### State

Defines state-specific behavior.

```java
public interface OrderState {
    void process(OrderContext context);
}
```

### Concrete State

```java
public class CreatedState implements OrderState {

    @Override
    public void process(OrderContext context) {
        System.out.println("Order Approved");
        context.setState(new ApprovedState());
    }
}
```

### Context

Maintains the current state.

```java
public class OrderContext {

    private OrderState state;

    public OrderContext(OrderState state) {
        this.state = state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void process() {
        state.process(this);
    }
}
```

### Client

```java
OrderContext order = new OrderContext(new CreatedState());

order.process();
```

## Real Backend Examples

### Order Lifecycle

```text
Created
   ↓
Approved
   ↓
Shipped
   ↓
Delivered
```

Each stage contains different business rules.

### Loan Approval Workflow

```text
Submitted
    ↓
Under Review
    ↓
Approved / Rejected
```

### User Account Management

```text
Pending
   ↓
Active
   ↓
Suspended
   ↓
Disabled
```

### CI/CD Pipeline

```text
Pending
   ↓
Running
   ↓
Success / Failed
```

## State Pattern vs Strategy Pattern

| Feature | State | Strategy |
| -------- | ----- | -------- |
| Purpose | Manage State Transitions | Select Algorithm |
| Behavior Changes | Automatic | Client Driven |
| Workflow Support | Strong | Limited |
| Object State Awareness | Yes | No |

## State Pattern vs Finite State Machine

| Feature | State Pattern | Finite State Machine |
| -------- | ------------ | -------------------- |
| Scope | Design Pattern | Modeling Technique |
| Complexity | Lower | Higher |
| State Management | Object Oriented | Formal Transition Model |
| Enterprise Usage | Common | Common |

## Advantages

- Cleaner code
- Better extensibility
- Reduced conditional logic
- Easier workflow implementation
- Improved maintainability

## Disadvantages

- Additional classes
- More abstraction
- Can become complex with many states

## Production Engineering Perspective

State Pattern is useful for:

- Workflow engines
- Order management systems
- Approval systems
- Business process automation
- CI/CD orchestration
- Ticketing systems
- Enterprise state machines
- Backend business workflows

It is particularly valuable when business behavior changes according to lifecycle stages.

## Interview Questions

1. What is State Pattern?
2. What problem does State Pattern solve?
3. State Pattern vs Strategy Pattern?
4. What are the core components of State Pattern?
5. How does State Pattern reduce conditional logic?
6. When should State Pattern be used?
7. What are common backend use cases?
8. How does State Pattern support workflows?
9. What are the disadvantages of State Pattern?
10. When should State Pattern be avoided?

## Quick Revision

- State Pattern changes behavior based on state.
- State-specific logic is encapsulated.
- Reduces large if-else chains.
- Supports workflow-driven systems.
- Context maintains current state.
- States manage transitions.
- Common in enterprise applications.
- Frequently asked in design pattern interviews.