

# Class Loaders

## Overview

Class Loaders are responsible for loading Java classes into JVM memory at runtime.

When a Java application starts, classes are not loaded all at once.

The JVM loads classes only when required.

Benefits:

- Faster Startup
- Reduced Memory Usage
- Dynamic Class Loading
- Better Resource Management

## Class Loading Process

```text
.java
   ↓
Compilation
   ↓
.class
   ↓
Class Loader
   ↓
JVM Memory
   ↓
Execution
```

## Types Of Class Loaders

### Bootstrap Class Loader

Loads core Java classes.

Examples:

```java
java.lang.String
java.util.ArrayList
java.lang.Object
```

Location:

```text
JDK Runtime Libraries
```

Responsibilities:

- Load Core Java Classes
- Parent Of All Class Loaders

## Platform Class Loader

Loads Java platform libraries.

Examples:

```java
java.sql.*
java.xml.*
```

Responsibilities:

- Load Platform Modules
- Support JDK Libraries

## Application Class Loader

Loads application classes from classpath.

Examples:

```text
com.company.service.UserService
com.company.controller.UserController
```

Responsibilities:

- Load User Classes
- Load Third Party Dependencies

## Parent Delegation Model

Class loading follows a parent-first approach.

```text
Application Class Loader
            ↓
Platform Class Loader
            ↓
Bootstrap Class Loader
```

Loading Flow:

```text
Request Class
      ↓
Ask Parent
      ↓
Parent Found?
      ↓
Yes → Load Class
No  → Child Loads Class
```

Benefits:

- Security
- Prevents Duplicate Loading
- Consistent Class Resolution

## Example

```java
ClassLoader loader =
        String.class.getClassLoader();

System.out.println(loader);
```

Output:

```text
null
```

Reason:

```text
Bootstrap Class Loader
```

is implemented internally by the JVM.

## Viewing Class Loaders

```java
System.out.println(
        ClassLoader.getSystemClassLoader()
);
```

Useful For:

- Debugging
- JVM Troubleshooting
- Framework Development

## Class Loading vs Class Initialization

### Loading

```text
Read .class File
```

### Linking

```text
Verification
Preparation
Resolution
```

### Initialization

```java
static {
    System.out.println("Initialized");
}
```

Flow:

```text
Loading
   ↓
Linking
   ↓
Initialization
```

## Real Production Example

Spring Boot Startup:

```text
Application Start
       ↓
Class Loader Loads Classes
       ↓
Spring Creates Beans
       ↓
Application Ready
```

Frameworks Using Class Loaders:

- Spring Framework
- Hibernate
- Tomcat
- Kafka Clients

## Common Problems

### ClassNotFoundException

```text
Class Missing From Classpath
```

### NoClassDefFoundError

```text
Class Available During Compilation
But Missing At Runtime
```

Interview Favorite:

```text
ClassNotFoundException
vs
NoClassDefFoundError
```

## Production Engineering Perspective

### Why It Matters

- Startup Troubleshooting
- Dependency Issues
- Spring Boot Internals
- JVM Debugging
- Container Runtime Analysis

## Most Asked Interview Questions

1. What is a Class Loader?
2. What are the types of Class Loaders?
3. What is Parent Delegation?
4. Why does String.class.getClassLoader() return null?
5. Bootstrap vs Application Class Loader?
6. ClassNotFoundException vs NoClassDefFoundError?
7. Loading vs Linking vs Initialization?
8. How does Spring use Class Loaders?

## Quick Revision

### Priority

⭐⭐⭐⭐⭐ Very High Priority

### Remember

- JVM loads classes on demand.
- Bootstrap loads core Java classes.
- Platform loads JDK platform modules.
- Application Class Loader loads application code.
- Parent Delegation is parent-first.
- Class loading differs from class initialization.
- ClassNotFoundException and NoClassDefFoundError are common interview topics.
- Important for JVM troubleshooting and backend interviews.