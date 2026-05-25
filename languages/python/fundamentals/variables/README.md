# Python Variables

Variables are used to store data values in memory. Python uses dynamic typing, meaning a variable can hold different data types without explicitly declaring its type.

## Coverage

Topics:

- Variable Declaration
- Dynamic Typing
- Variable Assignment
- Multiple Variable Assignment
- Naming Convention
- Type Checking
- Memory Reference Basics

## Variable Declaration

Example:

```python
name = "Backend Engineering"
version = 1
cpu_usage = 78.5
is_active = True

services = ["api", "database", "cache"]
```

Python automatically determines the variable type.

## Dynamic Typing

Example:

```python
value = 100

value = "Python"

value = True
```

The same variable can store different data types.

## Multiple Variable Assignment

Example:

```python
cpu, memory, disk = 70, 80, 60
```

Assign same value:

```python
x = y = z = 0
```

## Naming Convention

Good:

```python
user_name = "Alex"

service_count = 5
```

Avoid:

```python
a = "Alex"

x1 = 5
```

Use meaningful variable names.

## Type Checking

Example:

```python
name = "Python"

print(type(name))
```

Output:

```text
<class 'str'>
```

## Backend Engineering Usage

Variables are commonly used for:

- API Configuration
- Database Connection Details
- Feature Flags
- Request Processing
- Application State Management

## Learning Focus

- Data Storage
- Dynamic Typing
- Memory Reference Understanding
- Backend Programming Foundation