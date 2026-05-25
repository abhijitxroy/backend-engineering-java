# Python Pytest Framework

Pytest is a popular Python testing framework used for writing simple and scalable test cases. Pytest improves backend application quality through automated validation and reliable test execution.

## Coverage

Topics:

- Test Functions
- Assertions
- Fixtures
- Parametrized Tests
- Test Discovery
- Setup and Teardown
- Exception Testing
- Test Execution

## Test Functions

Pytest automatically identifies test functions.

Example:

```python
def test_addition():

    assert 5 + 5 == 10
```

Coverage:

- Function Naming
- Assertion Validation
- Automated Discovery

## Assertions

Assertions validate expected application behavior.

Example:

```python
def test_service_health():

    service_running = True

    assert service_running
```

Coverage:

- Equality Validation
- Boolean Validation
- Output Verification

## Fixtures

Fixtures provide reusable setup logic.

Example:

```python
import pytest


@pytest.fixture
def database_config():

    return {

        "host":
        "localhost"
    }
```

Coverage:

- Shared Setup
- Test Isolation
- Resource Preparation

## Parametrized Tests

Execute same test with multiple inputs.

Example:

```python
import pytest


@pytest.mark.parametrize(

    "input,expected",

    [

        (2, 4),

        (5, 25)
    ]
)

def test_square(
    input,
    expected
):

    assert (

        input * input

        == expected
    )
```

## Exception Testing

Validate application failures.

Example:

```python
import pytest


def test_division():

    with pytest.raises(

        ZeroDivisionError
    ):

        10 / 0
```

## Test Execution

Run tests using:

```bash
pytest
```

Coverage:

- Single Test Execution
- Folder Execution
- Verbose Output

## Backend Engineering Usage

Pytest is commonly used for:

- API Validation
- Service Testing
- Database Testing
- Integration Testing
- Backend Reliability

## Learning Focus

- Automated Testing
- Validation Engineering
- Backend Quality
- Production Reliability