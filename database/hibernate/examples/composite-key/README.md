# Composite Key Example

Composite key is used when a single column cannot uniquely identify a record.

Multiple columns together form a primary key.

Hibernate supports composite keys using:

- @Embeddable + @EmbeddedId
- @IdClass

## @EmbeddedId Approach

Recommended for most enterprise applications.

Components:

- @Embeddable
- @EmbeddedId

Example structure:

```text
OrderItemId
 ├── orderId
 └── productId

OrderItem
 └── @EmbeddedId OrderItemId
```

Advantages:

- Better object modeling
- Cleaner code organization
- Composite key encapsulation

Backend engineering usage:

- Order item mapping
- User permission mapping
- Student enrollment mapping
- Multi-column business identifiers

Example:

Order:

```text
order_id = 1001
product_id = 2005
```

Together:

```text
(1001,2005)
```

Unique business identifier.

## @IdClass Approach

Alternative composite key strategy.

Example structure:

```text
StudentCourseId
 ├── studentId
 └── courseId

StudentCourse
 ├── @Id studentId
 └── @Id courseId
```

Advantages:

- Simpler migration from legacy systems
- Familiar relational modeling

Tradeoff:

- Key fields duplicated

## @EmbeddedId vs @IdClass

| Feature | @EmbeddedId | @IdClass |
|----------|-------------|-----------|
| Encapsulation | Better | Lower |
| Object modeling | Better | Moderate |
| Legacy migration | Moderate | Better |
| Maintainability | Better | Moderate |

## Backend Engineering Perspective

Composite key knowledge helps:

- Enterprise data modeling
- Legacy database integration
- Multi-column uniqueness handling
- Production database design

## Interview Focus Areas

Common discussions:

- @EmbeddedId vs @IdClass
- Composite key use cases
- Legacy schema integration
- Entity relationship mapping