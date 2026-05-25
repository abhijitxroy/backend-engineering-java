# Python Control Flow

Control flow determines how a program executes instructions based on conditions, loops and decision-making logic. Control flow is fundamental for building backend applications and automation workflows.

## Coverage

Topics:

- Conditional Statements
- Nested Conditions
- for Loop
- while Loop
- break Statement
- continue Statement
- pass Statement
- Pattern Logic

## Conditional Statements

Conditional statements execute code based on specific conditions.

Example:

```python
cpu_usage = 85

if cpu_usage > 80:
    print("High CPU Usage")
```

Coverage:

- if
- if else
- if elif else

## Nested Conditions

Conditions can be placed inside another condition.

Example:

```python
api_enabled = True
database_enabled = True

if api_enabled:

    if database_enabled:
        print("Application Ready")
```

## for Loop

Used for iterating collections.

Example:

```python
services = [
    "api",
    "database",
    "cache"
]

for service in services:
    print(service)
```

Coverage:

- List Iteration
- Dictionary Iteration
- range()

## while Loop

Executes repeatedly while a condition remains true.

Example:

```python
retry_count = 1

while retry_count <= 3:

    print(retry_count)

    retry_count += 1
```

## break Statement

Stops loop execution.

Example:

```python
for retry in range(5):

    if retry == 3:
        break

    print(retry)
```

## continue Statement

Skips current iteration.

Example:

```python
for retry in range(5):

    if retry == 2:
        continue

    print(retry)
```

## pass Statement

Placeholder statement.

Example:

```python
if True:
    pass
```

## Backend Engineering Usage

Control flow is commonly used for:

- API Validation
- Retry Logic
- Request Processing
- Data Filtering
- Service Health Validation
- Monitoring Workflow

## Learning Focus

- Decision Making
- Loop Processing
- Backend Logic Development
- Automation Workflow Foundation