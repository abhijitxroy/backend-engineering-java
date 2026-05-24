# Flaky Tests

Flaky tests produce inconsistent testing outcomes.

Tests pass sometimes and fail without application changes.

Goal:

Improve CI stability and deployment confidence.

## Common Causes

Examples:

- Shared mutable state
- Timing dependency
- External dependency instability
- Test ordering issues
- Environment dependency
- Resource contention
- Network instability

## Prevention

Strategies:

- Test isolation
- Dependency mocking
- Stable test data
- Independent execution
- Deterministic assertions
- Retry mechanism validation
- Controlled test environment

## Backend Engineering Impact

Problems:

- CI instability
- Lower deployment confidence
- Slower delivery
- Reduced developer trust

## Detection Strategy

Monitor:

- Repeated intermittent failures
- Environment dependency issues
- Timing related failures

## Flaky Test Detection Strategy

Monitor:

- Intermittent CI failures
- Non deterministic execution
- Environment specific failures
- Timing related failures

Benefits:

- Better CI stability
- Higher deployment confidence
- Faster troubleshooting

## Backend Engineering Examples

Examples:

- Database integration instability
- API timeout dependency
- Shared cache contamination
- External service dependency failure

## Backend Engineering Perspective

Stable testing improves:

- CI reliability
- Deployment quality
- Engineering productivity

## Notes

Flaky tests increase maintenance cost, reduce backend delivery confidence and negatively influence CI reliability.