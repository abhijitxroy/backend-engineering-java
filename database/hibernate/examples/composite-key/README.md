# Composite Key Example

Composite key is used when a single column cannot uniquely identify a record.

Multiple columns together form a primary key.

## Why Composite Keys Matter

Composite keys are useful when business uniqueness depends on multiple columns instead of a single identifier.

Examples:

- Order item relationships
- Student enrollments
- User-role assignments
- Product inventory mappings

Composite keys help enforce business rules directly at the database level.

Hibernate supports composite keys using:

- @Embeddable + @EmbeddedId
- @IdClass

## @EmbeddedId Approach

Recommended for most enterprise applications.

Why it is commonly preferred:

- Better encapsulation
- Cleaner entity design
- Easier maintainability
- Stronger domain modeling

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
(1001, 2005)
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
| ------- | ----------- | -------- |
| Encapsulation | Better | Lower |
| Object Modeling | Better | Moderate |
| Code Maintainability | Better | Moderate |
| Legacy Migration | Moderate | Better |
| Domain Design | Better | Moderate |

General guidance:

- Prefer @EmbeddedId for new applications.
- Consider @IdClass when working with legacy schemas.

## Production Engineering Perspective

Composite key knowledge helps with:

- Enterprise data modeling
- Legacy database integration
- Multi-column uniqueness enforcement
- Relationship table design
- Production schema maintenance
- Database migration planning

Composite keys should be used when they accurately represent business uniqueness, not simply because multiple columns are available.

## Interview Questions

1. What is a composite key?
2. When should composite keys be used?
3. Difference between @EmbeddedId and @IdClass?
4. Why is @EmbeddedId usually preferred?
5. What are the drawbacks of composite keys?
6. How do composite keys affect entity relationships?
7. How would you model a many-to-many join table?
8. How do composite keys impact query design?
9. What challenges arise during schema migration?
10. When would a surrogate key be preferable?

## Quick Revision

- Composite keys use multiple columns for uniqueness.
- @EmbeddedId provides better encapsulation.
- @IdClass is common in legacy systems.
- Use composite keys only when business identity requires them.
- Composite keys frequently appear in relationship tables.
- Keep key design simple and maintainable.