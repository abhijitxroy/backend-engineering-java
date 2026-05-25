# Python Data Types

Data types define the kind of value a variable can store. Python provides multiple built-in data types for processing application logic, backend workflows and data handling.

## Coverage

Topics:

- Integer
- Float
- String
- Boolean
- List
- Tuple
- Set
- Dictionary
- Type Conversion
- Type Checking

## Numeric Types

### Integer

Stores whole numbers.

Example:

```python
server_count = 5
```

### Float

Stores decimal values.

Example:

```python
cpu_usage = 82.5
```

## String

Stores text values.

Example:

```python
service_name = "payment-service"
```

Coverage:

- String Creation
- String Concatenation
- String Formatting

## Boolean

Stores True or False values.

Example:

```python
database_connected = True
```

Coverage:

- Conditional Processing
- Feature Flags
- Validation Logic

## List

Ordered mutable collection.

Example:

```python
services = [
    "api",
    "database",
    "cache"
]
```

## Tuple

Ordered immutable collection.

Example:

```python
database_server = (
    "localhost",
    5432
)
```

## Set

Stores unique values.

Example:

```python
regions = {
    "us-east",
    "eu-west"
}
```

## Dictionary

Stores key value pairs.

Example:

```python
config = {
    "host": "localhost",
    "port": 5432
}
```

## Type Conversion

Convert values between data types.

Example:

```python
cpu = "80"

cpu_usage = int(cpu)
```

Coverage:

- int()
- float()
- str()
- bool()

## Type Checking

Example:

```python
service_name = "backend"

print(
    type(
        service_name
    )
)
```

## Backend Engineering Usage

Data types are commonly used for:

- API Payload Processing
- Configuration Management
- Cache Handling
- Database Operations
- Request Processing

## Learning Focus

- Data Representation
- Type Conversion
- Data Processing
- Backend Application Foundation