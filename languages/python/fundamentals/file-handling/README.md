# Python File Handling

File handling is used to read, write and manage files in Python applications. File operations are commonly used in backend systems for configuration management, logging, report generation and data processing.

## Coverage

Topics:

- Read File
- Write File
- Append File
- File Modes
- Context Manager
- File Existence Validation
- Exception Handling

## Read File

Used to read file contents.

Example:

```python
with open(
    "config.txt",
    "r"
) as file:

    content = file.read()

    print(content)
```

Coverage:

- read()
- readline()
- readlines()

## Write File

Used to create or overwrite file content.

Example:

```python
with open(
    "report.txt",
    "w"
) as file:

    file.write(
        "Backend Report"
    )
```

## Append File

Used to add content without overwriting.

Example:

```python
with open(
    "application.log",
    "a"
) as file:

    file.write(
        "Request Processed"
    )
```

## File Modes

Coverage:

- r → Read
- w → Write
- a → Append
- x → Create
- rb → Read Binary
- wb → Write Binary

## Context Manager

Context manager automatically handles resource cleanup.

Example:

```python
with open(
    "config.txt",
    "r"
) as file:

    print(
        file.read()
    )
```

## File Existence Validation

Example:

```python
import os

if os.path.exists(
    "config.txt"
):

    print(
        "File Available"
    )
```

## Exception Handling

Example:

```python
try:

    with open(
        "backend.txt",
        "r"
    ) as file:

        print(
            file.read()
        )

except FileNotFoundError:

    print(
        "File Missing"
    )
```

## Backend Engineering Usage

File handling is commonly used for:

- Configuration Management
- Logging
- Report Generation
- Data Processing
- Application Persistence

## Learning Focus

- Resource Management
- Data Processing
- Error Handling
- Backend Application Foundation