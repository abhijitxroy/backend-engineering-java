# Python Requests Library

The requests library is used to send HTTP requests and communicate with APIs and backend services. It is one of the most widely used Python libraries for backend integration and service communication.

## Coverage

Topics:

- GET Request
- POST Request
- PUT Request
- DELETE Request
- Request Headers
- Query Parameters
- JSON Payload
- Timeout Configuration
- Authentication
- Response Handling
- Error Handling

## GET Request

Retrieve data from an API.

Example:

```python
import requests

response = requests.get(
    "https://api.example.com/users"
)
```

Coverage:

- Resource Retrieval
- Query Processing

## POST Request

Create new resources.

Example:

```python
payload = {

    "name":
    "backend-user"
}

response = requests.post(

    "https://api.example.com/users",

    json=payload
)
```

## PUT Request

Update existing resources.

Example:

```python
response = requests.put(

    "https://api.example.com/users/1",

    json={

        "enabled":
        True
    }
)
```

## DELETE Request

Delete resources.

Example:

```python
response = requests.delete(

    "https://api.example.com/users/1"
)
```

## Request Headers

Headers provide metadata.

Example:

```python
headers = {

    "Authorization":

    "Bearer token",

    "Content-Type":

    "application/json"
}
```

## Query Parameters

Example:

```python
params = {

    "page": 1,

    "limit": 10
}
```

## JSON Payload

Example:

```python
payload = {

    "service":
    "payment",

    "enabled":
    True
}
```

## Timeout Configuration

Example:

```python
requests.get(

    "https://api.example.com",

    timeout=5
)
```

## Authentication

Coverage:

- API Token
- Bearer Token
- Basic Authentication

## Response Handling

Example:

```python
response = requests.get(

    "https://api.example.com"
)

print(
    response.status_code
)

print(
    response.json()
)
```

## Error Handling

Example:

```python
try:

    requests.get(

        "https://api.example.com",

        timeout=5
    )

except Exception:

    print(
        "Request Failed"
    )
```

## Backend Engineering Usage

Requests is commonly used for:

- Microservice Communication
- API Integration
- External Service Calls
- Authentication Services
- Backend Automation

## Learning Focus

- HTTP