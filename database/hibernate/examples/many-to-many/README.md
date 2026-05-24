

# Many-To-Many Mapping Example

Many-To-Many relationship is used when multiple records from one entity are associated with multiple records from another entity.

Hibernate supports Many-To-Many mapping using:

- @ManyToMany
- @JoinTable
- @JoinColumn

## Relationship Overview

Example:

```text
Student
  ↕
Course
```

Business meaning:

- One student can enroll in multiple courses
- One course can have multiple students

Database representation:

```text
students

courses

student_course
```

Join table:

```text
student_course

student_id
course_id
```

## Hibernate Mapping

Example:

```java
@ManyToMany
@JoinTable(
 name = "student_course",
 joinColumns = @JoinColumn(name = "student_id"),
 inverseJoinColumns = @JoinColumn(name = "course_id")
)
private Set<Course> courses;
```

@JoinTable manages relationship mapping.

Join table stores association information.

## Fetch Strategy Considerations

Prefer:

```java
@ManyToMany(fetch = FetchType.LAZY)
```

Reason:

- Better memory utilization
- Lower database overhead
- Improved API response time

Avoid unnecessary EAGER loading.

## Cascade Considerations

Common options:

- CascadeType.PERSIST
- CascadeType.MERGE

Use REMOVE carefully.

Reason:

Many-To-Many delete operations can remove unexpected relationships.

## Backend Engineering Usage

Common enterprise scenarios:

- User ↔ Role
- Student ↔ Course
- Product ↔ Category
- User ↔ Permission
- Employee ↔ Skill

## Performance Considerations

Monitor:

- N+1 SELECT problem
- Large collection loading
- Join complexity

Optimization techniques:

- JOIN FETCH
- EntityGraph
- Batch fetching
- Pagination

## Backend Engineering Perspective

Many-To-Many knowledge helps:

- Enterprise data modeling
- Authorization system design
- Performance optimization
- Relationship mapping troubleshooting

## Interview Focus Areas

Common discussions:

- @ManyToMany
- @JoinTable
- LAZY vs EAGER
- Cascade behavior
- N+1 problem
- Join table design