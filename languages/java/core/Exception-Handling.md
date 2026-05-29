

# Exception Handling

## What Is Exception Handling?

Exception Handling is a mechanism that allows applications to handle runtime errors gracefully without crashing.

It helps applications:

- Recover From Errors
- Maintain Stability
- Improve Reliability
- Provide Meaningful Error Messages

## Why Backend Engineers Must Know It

| Importance | Real Usage |
| ---------- | ---------- |
| ⭐⭐⭐⭐⭐ | API Error Handling |
| ⭐⭐⭐⭐⭐ | Database Operations |
| ⭐⭐⭐⭐⭐ | Microservices |
| ⭐⭐⭐⭐⭐ | Production Systems |
| ⭐⭐⭐⭐ | Debugging |

## Why It Exists

Without exception handling:

```java
int result = 10 / 0;
```

Application:

```text
Throws Exception
        ↓
Application Failure
```

Exception handling allows applications to manage failures safely.

## Exception Hierarchy

```text
Throwable
├── Error
└── Exception
     ├── Checked Exception
     └── RuntimeException
```

## Checked Exceptions

Checked exceptions are verified at compile time.

Examples:

```java
IOException
SQLException
ClassNotFoundException
```

Handling is mandatory.

```java
try {
} catch (IOException e) {
}
```

## Unchecked Exceptions

Unchecked exceptions occur at runtime.

Examples:

```java
NullPointerException
ArithmeticException
ArrayIndexOutOfBoundsException
IllegalArgumentException
```

Handling is optional.

## try-catch

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println(e.getMessage());
}
```

## try-catch-finally

```java
try {
    // Business Logic
} catch (Exception e) {
    // Error Handling
} finally {
    // Cleanup
}
```

finally executes whether an exception occurs or not.

## throw vs throws

| throw | throws |
| ----- | ------ |
| Throws Exception Object | Declares Possible Exceptions |
| Used Inside Method | Used In Method Signature |

### throw

```java
throw new IllegalArgumentException(
        "Invalid Input"
);
```

### throws

```java
public void process()
        throws IOException {
}
```

## Custom Exception

```java
public class InvalidUserException
        extends RuntimeException {

    public InvalidUserException(String message) {
        super(message);
    }
}
```

## try-with-resources

Automatically closes resources.

```java
try (BufferedReader reader =
             new BufferedReader(...)) {

}
```

Benefits:

- Cleaner Code
- Automatic Cleanup
- Prevents Resource Leaks

## Checked vs Unchecked Exception

| Checked Exception | Unchecked Exception |
| ----------------- | ------------------- |
| Compile-Time Check | Runtime Check |
| Must Handle | Optional Handling |
| Recoverable Problems | Programming Errors |
| IOException | NullPointerException |

## Real-World Usage

Commonly used in:

- API Error Handling
- Database Access
- File Processing
- External Service Calls
- Validation Logic

## Spring Framework Mapping

Examples:

```text
@ResponseStatus
@ControllerAdvice
@ExceptionHandler
```

Global exception handling is commonly implemented using:

```java
@RestControllerAdvice
```

## Production Engineering Perspective

Good exception handling should:

- Log Errors
- Preserve Context
- Return Meaningful Messages
- Avoid Swallowing Exceptions

Bad Example:

```java
catch (Exception e) {
}
```

This hides production issues.

## Common Interview Questions

1. What is Exception Handling?
2. Checked vs Unchecked Exception?
3. throw vs throws?
4. What is finally?
5. What is try-with-resources?
6. Why create custom exceptions?
7. Error vs Exception?
8. How is exception handling done in Spring Boot?

## Quick Decision Guide

| Scenario | Recommendation |
| -------- | -------------- |
| Invalid Input | IllegalArgumentException |
| Business Validation Failure | Custom Exception |
| Resource Cleanup | try-with-resources |
| Global API Error Handling | @RestControllerAdvice |
| Database Failure | Handle And Log |

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- Exception Handling prevents application crashes.
- Checked exceptions are validated at compile time.
- Unchecked exceptions occur at runtime.
- throw creates an exception.
- throws declares an exception.
- try-with-resources prevents resource leaks.
- Never swallow exceptions in production systems.
- Global exception handling is standard in Spring Boot.