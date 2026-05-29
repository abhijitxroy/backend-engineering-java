# Flyweight Pattern

## What Is Flyweight Pattern?

Flyweight is a structural design pattern that reduces memory usage by sharing common object state across multiple objects.

Instead of creating duplicate objects repeatedly, shared data is stored in a single reusable object.

## Why It Exists

Applications sometimes create thousands or millions of similar objects.

Without Flyweight:

```text
1,000,000 User Objects
      ↓
1,000,000 Copies Of Common Data
```

This wastes memory and increases object creation overhead.

Flyweight stores shared state once and reuses it across multiple objects.

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐ | Caching Systems |
| ⭐⭐⭐ | String Pool |
| ⭐⭐⭐ | Shared Metadata |
| ⭐⭐⭐ | Configuration Reuse |
| ⭐⭐⭐ | High-Volume Systems |

## Real-World Usage

### String Pool

```text
"Java"
   ↓
Single Shared Object
```

One of the most common Flyweight examples in Java.

### User Permissions

```text
Users
   ↓
Shared Role Objects
```

Instead of duplicating role information for every user.

### Product Metadata

```text
Products
    ↓
Shared Category Metadata
```

### Word Processor

```text
Characters
      ↓
Shared Font Objects
```

Millions of characters can share the same font metadata.

### Game Engines

```text
Game Objects
      ↓
Shared Texture Objects
```

Thousands of objects can reuse the same texture.

### Caching Systems

```text
Application
     ↓
Shared Cached Objects
```

## Core Components

### Flyweight

Contains shared state.

### Flyweight Factory

Creates and reuses Flyweight objects.

### Client

Uses Flyweight objects instead of creating duplicates.

## Intrinsic State vs Extrinsic State

Flyweight works by separating shared data from object-specific data.

### Intrinsic State

Shared across multiple objects.

Examples:

- Role Name
- Product Category
- Country Information
- Font Metadata

Stored inside the Flyweight object.

### Extrinsic State

Unique to each object.

Examples:

- User ID
- Product ID
- Order ID
- Screen Position

Provided by the client when needed.

### Example

```text
Role
 ├── Role Name = Admin     (Intrinsic)
 └── User Id = 101         (Extrinsic)

Role
 ├── Role Name = Admin     (Intrinsic)
 └── User Id = 102         (Extrinsic)
```

Many users can share a single Role object.

## When To Use Flyweight

Use Flyweight when:

- Large numbers of similar objects exist
- Memory consumption becomes significant
- Shared state can be extracted
- Object creation is expensive

Common examples:

- Caching Systems
- String Pool
- Shared Metadata
- Large-Scale Applications

## When Not To Use Flyweight

Avoid Flyweight when:

- Few objects exist
- Memory usage is not a concern
- Shared state is minimal
- Additional complexity outweighs benefits

## Flyweight vs Singleton

| Flyweight | Singleton |
| ---------- | ---------- |
| Many shared objects | One shared object |
| Memory optimization | Instance control |
| Object reuse | Single instance |

## Flyweight vs Prototype

| Flyweight | Prototype |
| ---------- | --------- |
| Shares objects | Clones objects |
| Memory optimization | Object duplication |
| Reuse existing state | Copy existing state |

## Spring Framework Mapping

| Pattern Usage | Example |
| ------------- | ------- |
| Cache Reuse | Spring Cache |
| Shared Configuration | Shared Bean Metadata |
| Resource Optimization | Object Reuse |

## Common Interview Questions

1. What is Flyweight Pattern?
2. What problem does it solve?
3. Flyweight vs Singleton?
4. Flyweight vs Prototype?
5. What is intrinsic state?
6. What is extrinsic state?
7. How does Flyweight reduce memory usage?
8. What are common backend use cases?
9. When should Flyweight be used?
10. When should it be avoided?

## Quick Revision

### Priority

⭐⭐⭐ Medium Priority

### Remember

- Optimizes memory usage.
- Shares common object state.
- String Pool is a classic Java example.
- Useful in caching and high-volume systems.
- Flyweight Factory manages object reuse.
- Think: Many Objects → Shared State → Less Memory.
- Intrinsic state is shared.
- Extrinsic state is unique.
- String Pool is the most common Java Flyweight example.