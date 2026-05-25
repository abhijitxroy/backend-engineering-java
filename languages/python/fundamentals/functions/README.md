

# Python Functions

Functions are reusable blocks of code used to perform specific tasks. Functions help improve code readability, maintainability and reusability.

## Coverage

Topics:

- Function Definition
- Function Arguments
- Return Values
- Default Parameters
- Keyword Arguments
- Variable Length Arguments
- Lambda Functions

## Function Basics

Functions are defined using the `def` keyword.

Example:

```python

def calculate_total(price, quantity):
    return price * quantity

print(calculate_total(100, 2))
```

## Function Arguments

Functions can accept input parameters.

Example:

```python

def deploy(service_name):
    print(service_name)


deploy("payment-service")
```

## Return Values

Functions can return processed values.

Example:

```python

def get_cpu_usage():
    return 75


cpu = get_cpu_usage()
```

## Default Parameters

Example:

```python

def start_service(name, replicas=1):
    print(name, replicas)
```

## Variable Length Arguments

Example:

```python

def process_services(*services):
    print(services)
```

## Lambda Functions

Lambda functions are small anonymous functions.

Example:

```python

square = lambda number: number * number

print(square(5))
```

## Backend Engineering Usage

Functions are commonly used for:

- API Processing
- Validation Logic
- Data Transformation
- Utility Operations
- Configuration Processing

## Learning Focus

- Code Reusability
- Modular Development
- Backend Logic Organization
- Maintainable Programming