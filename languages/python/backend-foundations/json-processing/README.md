# Python JSON Processing

JSON (JavaScript Object Notation) is a lightweight data interchange format widely used in backend systems for API communication, configuration management and service integration.

## Coverage

Topics:

- JSON Serialization
- JSON Deserialization
- Dictionary to JSON
- JSON to Dictionary
- Read JSON File
- Write JSON File
- API Response Processing
- Nested JSON Handling
- Error Handling

## JSON Serialization

Convert Python object to JSON.

Example:

```python
import json

service = {
    "name": "payment",
    "enabled": True
}

json_data = json.dumps(
    service
)
```

Coverage:

- Dictionary Conversion
- List Conversion
- Object Serialization

## JSON Deserialization

Convert JSON into Python object.

Example:

```python
import json

json_data = '''

{
    "service":
    "payment"
}

'''

data = json.loads(
    json_data
)
```

Coverage:

- JSON Parsing
- Dictionary Conversion
- Data Processing

## Read JSON File

Example:

```python
import json

with open(
    "config.json"
) as file:

    config = json.load(
        file
    )
```

## Write JSON File

Example:

```python
import json

config = {

    "database":
    "postgres"
}

with open(
    "config.json",
    "w"
) as file:

    json.dump(
        config,
        file
    )
```

## Nested JSON Handling

Example:

```python
payload = {

    "user": {

        "id": 101,

        "name":
        "backend"
    }
}

print(
    payload[
        "user"
    ][
        "name"
    ]
)
```

## Error Handling

Example:

```python
try:

    data = json.loads(
        "invalid-json"
    )

except Exception:

    print(
        "JSON Parsing Failed"
    )
```

## Backend Engineering Usage

JSON processing is commonly used for:

- API Communication
- Configuration Management
- Service Integration
- Event Processing
- Request Response Handling

## Learning Focus

- Data Serialization
- API Payload Processing
- Backend Data Exchange
- Distributed System Communication