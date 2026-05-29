

# REST API Design

REST API design principles help backend systems build scalable, maintainable and production ready services.

Good API design improves client integration, system evolution and operational reliability.

## Why REST API Design Matters

REST APIs are often the primary integration layer between services, applications, external consumers, and business systems.

Poor API design typically leads to:

- Breaking client integrations
- Difficult service evolution
- Increased operational complexity
- Security vulnerabilities
- Scalability limitations
- Higher maintenance costs

Well-designed APIs improve long-term maintainability, backward compatibility, and developer experience.

## REST Principles

Core REST concepts:

- Stateless Communication
- Client Server Architecture
- Cacheable Responses
- Layered System
- Uniform Interface
- Resource Based Design

## HTTP Methods

| Method | Purpose | Idempotent | Typical Usage |
| ------- | -------- | ---------- | ------------- |
| GET | Retrieve resources | Yes | Read data |
| POST | Create resources | No | Create new entities |
| PUT | Replace a resource completely | Yes | Full update |
| PATCH | Update part of a resource | Usually Yes | Partial update |
| DELETE | Remove resources | Yes | Resource deletion |

Example:

GET /users/100

POST /users

PUT /users/100

PATCH /users/100

DELETE /users/100

## HTTP Status Codes

### Success Responses

- 200 OK
- 201 Created
- 202 Accepted
- 204 No Content

### Client Errors

- 400 Bad Request
- 401 Unauthorized
- 403 Forbidden
- 404 Not Found
- 405 Method Not Allowed
- 409 Conflict
- 422 Unprocessable Entity
- 429 Too Many Requests

### Server Errors

- 500 Internal Server Error
- 502 Bad Gateway
- 503 Service Unavailable
- 504 Gateway Timeout

## API Versioning

Common approaches:

- URI Versioning (/v1/users)
- Header Versioning
- Query Parameter Versioning

## API Naming Best Practices

Recommended:

- Use nouns instead of verbs
- Use plural resource names
- Keep URLs predictable
- Maintain consistency across services

Examples:

Good:

- /users
- /orders
- /products

Avoid:

- /getUsers
- /createOrder
- /deleteProduct

## Pagination

Common pagination styles:

- Offset Pagination
- Cursor Pagination
- Keyset Pagination

Example:

GET /users?page=1&size=20

## Filtering

Example:

GET /users?department=platform

## Sorting

Example:

GET /users?sort=name,asc

## Idempotency

Idempotent operations produce the same result for repeated requests.

Examples:

- GET
- PUT
- DELETE

## Error Response Design

Example:

```json
{
  "timestamp": "2026-01-01T10:00:00Z",
  "status": 400,
  "error": "Bad Request",
  "message": "Email is required",
  "path": "/users"
}
```

Consistent error structures improve debugging and client integration.

## Production API Engineering

Production APIs commonly require:

- Retry strategy design
- Timeout handling
- Correlation IDs
- Distributed tracing
- Request validation
- Rate limiting
- API security
- Backward compatibility
- Deprecation strategy
- Contract governance
- API observability
- SLA awareness

## Interview Questions

1. Difference between PUT and PATCH?
2. What makes an API RESTful?
3. Why is idempotency important?
4. URI versioning vs header versioning?
5. Offset pagination vs cursor pagination?
6. How do you design API error responses?
7. How would you implement rate limiting?
8. How do you maintain backward compatibility?
9. What status code should be returned for validation failures?
10. How do correlation IDs help production debugging?

## Quick Revision

- REST is resource-oriented.
- APIs should be stateless.
- Use proper HTTP methods.
- Use meaningful status codes.
- Design for backward compatibility.
- Prefer consistent error responses.
- Support observability and traceability.
- Consider scalability from the beginning.