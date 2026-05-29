

# Comparable vs Comparator

## What Are They?

Both Comparable and Comparator are used for sorting objects in Java.

They define how objects should be ordered.

Examples:

- Employee Sorting
- Product Sorting
- Ranking Systems
- Report Generation

## Why Backend Engineers Must Know This

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | Data Sorting |
| ⭐⭐⭐⭐⭐ | API Responses |
| ⭐⭐⭐⭐⭐ | Reporting Systems |
| ⭐⭐⭐⭐ | Ranking Systems |
| ⭐⭐⭐⭐ | Collection Processing |

## Why They Exist

Java does not know how custom objects should be sorted.

Example:

```java
class Employee {
    private int id;
    private String name;
    private double salary;
}
```

Should sorting happen by:

- ID?
- Name?
- Salary?

Comparable and Comparator solve this problem.

## Comparable

Comparable defines the default or natural ordering of objects.

Implemented inside the class.

```java
class Employee implements Comparable<Employee> {

    private int id;

    @Override
    public int compareTo(Employee other) {
        return this.id - other.id;
    }
}
```

Usage:

```java
Collections.sort(employeeList);
```

## Comparator

Comparator defines custom sorting logic.

Implemented outside the class.

```java
Comparator<Employee> salaryComparator =
        (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());
```

Usage:

```java
employeeList.sort(salaryComparator);
```

## Comparison

| Comparable | Comparator |
| ---------- | ---------- |
| Package: java.lang | Package: java.util |
| Natural Ordering | Custom Ordering |
| Implemented Inside Class | Implemented Outside Class |
| Single Sorting Logic | Multiple Sorting Logic |
| compareTo() | compare() |

## Real-World Usage

### Comparable

Used when a natural order exists.

Examples:

- Employee ID
- Product ID
- Customer ID

### Comparator

Used when multiple sorting options are required.

Examples:

- Salary
- Name
- Date
- Priority
- Rating

## Java 8 Comparator Example

```java
employees.sort(
        Comparator.comparing(Employee::getSalary));
```

Descending Order:

```java
employees.sort(
        Comparator.comparing(Employee::getSalary)
                  .reversed());
```

Multiple Fields:

```java
employees.sort(
        Comparator.comparing(Employee::getDepartment)
                  .thenComparing(Employee::getSalary));
```

## When To Use Comparable

Use Comparable when:

- Only one natural ordering exists.
- Sorting logic belongs to the class.

## When To Use Comparator

Use Comparator when:

- Multiple sorting options exist.
- Sorting logic should remain outside the class.
- Runtime sorting flexibility is needed.

## Production Engineering Perspective

In modern backend systems:

- Comparator is used far more frequently.
- APIs often support multiple sorting options.
- Reporting systems require dynamic sorting.
- Java 8 Comparator APIs make sorting cleaner and more maintainable.

## Common Interview Questions

1. Comparable vs Comparator?
2. compareTo() vs compare()?
3. Why is Comparator more flexible?
4. When should Comparable be used?
5. When should Comparator be used?
6. How do you sort by multiple fields?
7. How do you sort in descending order?
8. Which is used more in production?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Comparable = Natural Ordering.
- Comparator = Custom Ordering.
- Comparable uses compareTo().
- Comparator uses compare().
- Comparable supports one sorting strategy.
- Comparator supports multiple sorting strategies.
- Comparator is more common in modern backend applications.