# Composite Pattern

## What Is Composite Pattern?

Composite is a structural design pattern that allows individual objects and groups of objects to be treated uniformly.

It organizes objects into a tree structure where both single objects and collections of objects implement the same interface.

This simplifies working with hierarchical data.

## Why It Exists

Composite becomes useful when data naturally forms a hierarchy.

Common examples:

- Organization structures
- Product categories
- File systems
- Permission hierarchies

Without Composite, applications often require separate logic for processing individual objects and groups of objects.

Composite allows both to be treated through the same interface.

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐ | Organization Hierarchies |
| ⭐⭐⭐⭐ | Category Trees |
| ⭐⭐⭐⭐ | Menu Structures |
| ⭐⭐⭐ | File Systems |
| ⭐⭐⭐ | Permission Trees |

## Problem Without Composite

Without Composite:

```text
Department
 ├── Team
 │    ├── Employee
 │    └── Employee
 └── Team
```

Applications often need separate logic for handling groups and individual objects.

## Solution Using Composite

```text
Component
   ├── Leaf
   └── Composite
          ├── Leaf
          └── Leaf
```

Both leaf and composite objects implement the same interface.

## Core Components

### Component

```java
public interface Employee {
    void showDetails();
}
```

### Leaf

```java
public class Developer
        implements Employee {
}
```

### Composite

```java
public class Team
        implements Employee {
}
```

## Real Backend Examples

### Organization Structure

```text
Company
 ├── Engineering
 │    ├── Developer
 │    └── Developer
 └── QA
```

### Product Categories

```text
Electronics
 ├── Mobile
 ├── Laptop
 └── Tablet
```

### Permission Trees

```text
Admin
 ├── User Management
 ├── Billing
 └── Reporting
```

### File Systems

```text
Directory
 ├── File
 ├── File
 └── Directory
```

## When To Use Composite

Use Composite when:

- Data forms a tree structure
- Parent and child objects should be processed similarly
- Hierarchical traversal logic appears repeatedly
- Individual objects and groups should share the same interface

Common examples:

- Product category trees
- Organization hierarchies
- Permission structures
- Folder systems

## When Not To Use Composite

Avoid Composite when:

- Data is flat and has no hierarchy
- Parent-child relationships do not exist
- A simple collection is sufficient
- Additional abstraction adds unnecessary complexity

## Composite vs Decorator

| Composite | Decorator |
| ---------- | --------- |
| Tree Structure | Adds Behavior |
| Parent-Child Relationship | Wrapper Relationship |
| Hierarchical Data | Dynamic Functionality |

## Composite vs Adapter

| Composite | Adapter |
| ---------- | ------- |
| Organizes Objects | Integrates Objects |
| Hierarchical Structure | Compatibility Layer |
| Same Interface | Interface Conversion |


## Spring Framework Mapping

| Pattern Usage | Spring Example |
| ------------- | -------------- |
| Bean Hierarchies | Application Context Trees |
| Security Models | Permission Hierarchies |
| Configuration Trees | Nested Configuration Structures |

## Production Engineering Perspective

Composite is commonly used in:

- Organization Management Systems
- E-Commerce Category Trees
- Access Control Systems
- File Management Systems
- Workflow Hierarchies

It becomes valuable whenever parent-child relationships must be processed uniformly.

## Interview Questions

1. What is Composite Pattern?
2. What problem does it solve?
3. Composite vs Decorator?
4. Composite vs Adapter?
5. What are common backend use cases?
6. What are the core components?
7. What are the advantages and disadvantages?
8. How does Composite simplify tree processing?
9. When should Composite be used?
10. When should it be avoided?

## Quick Revision

### Priority

⭐⭐⭐⭐ Medium Priority

### Remember
- Represents hierarchical tree structures.
- Uses Component, Leaf, and Composite.
- Treats groups and individual objects uniformly.
- Common in category trees and organization structures.
- Useful when parent and child objects share behavior.
- Think: Company → Department → Team → Employee.
