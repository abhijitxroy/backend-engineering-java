# Python Logging

Logging is used to capture application events, errors and operational information during application execution. Logging is essential for backend systems to support monitoring, debugging and production reliability.

## Coverage

Topics:

- Logging Levels
- Basic Logging
- File Logging
- Log Formatting
- Exception Logging
- Multiple Handlers
- Structured Logging
- Production Logging Practices

## Logging Levels

Python logging supports multiple severity levels.

Coverage:

- DEBUG
- INFO
- WARNING
- ERROR
- CRITICAL

Example:

```python
import logging

logging.basicConfig(
    level=logging.INFO
)

logging.info(
    "Application Started"
)
```

## Basic Logging

Example:

```python
import logging

logging.warning(
    "Memory Usage High"
)
```

## File Logging

Logs can be stored in files.

Example:

```python
import logging

logging.basicConfig(

    filename="application.log",

    level=logging.INFO
)

logging.info(
    "Request Processed"
)
```

## Log Formatting

Example:

```python
logging.basicConfig(

    format=

    "%(asctime)s "

    "%(levelname)s "

    "%(message)s"
)
```

Coverage:

- Timestamp
- Log Level
- Message Format

## Exception Logging

Example:

```python
try:

    result = 10 / 0

except Exception:

    logging.exception(
        "Processing Failed"
    )
```

## Multiple Handlers

Example:

- Console Logging
- File Logging

Coverage:

- StreamHandler
- FileHandler

## Structured Logging

Structured logs improve observability.

Example:

```python
logging.info(

    "Request Completed "

    "service=payment "

    "status=200"
)
```

## Backend Engineering Usage

Logging is commonly used for:

- API Monitoring
- Error Tracking
- Service Health Validation
- Audit Logging
- Production Troubleshooting

## Learning Focus

- Application Observability
- Failure Investigation
- Production Reliability
- Backend Operations