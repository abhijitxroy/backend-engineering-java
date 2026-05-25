# Python Object Oriented Programming

Object Oriented Programming (OOP) is a programming approach that organizes code using objects and classes. OOP improves code maintainability, scalability and backend application design.

## Coverage

Topics:

- Class
- Object
- Constructor
- Instance Variable
- Method
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

## Class

Class is a blueprint used to create objects.

Example:

```python
class Database:

    pass
```

## Object

Object is an instance of a class.

Example:

```python
class Service:

    pass


api = Service()
```

## Constructor

Constructor initializes object data.

Example:

```python
class Database:

    def __init__(
        self,
        host
    ):

        self.host = host
```

Coverage:

- __init__()
- Object Initialization

## Instance Variable

Stores object-specific information.

Example:

```python
class Service:

    def __init__(
        self,
        service_name
    ):

        self.service_name = service_name
```

## Method

Method defines object behavior.

Example:

```python
class Service:

    def deploy(
        self
    ):

        print(
            "Deploy Service"
        )
```

## Encapsulation

Encapsulation hides internal implementation.

Example:

```python
class Database:

    def __init__(
        self
    ):

        self.__password = "admin"
```

## Inheritance

Inheritance allows code reuse.

Example:

```python
class Service:

    pass


class PaymentService(
    Service
):

    pass
```

## Polymorphism

Polymorphism allows same method with different behavior.

Example:

```python
class API:

    def execute(
        self
    ):

        print(
            "API Processing"
        )
```

## Abstraction

Abstraction hides implementation complexity.

Example:

```python
from abc import (
    ABC,
    abstractmethod
)


class Notification(
    ABC
):

    @abstractmethod

    def send(
        self
    ):

        pass
```

## Backend Engineering Usage

OOP is commonly used for:

- API Development
- Service Layer Design
- Database Layer
- Application Architecture
- Backend Module Organization

## Learning Focus

- Code Reusability
- Scalable Development
- Backend Application Design
- Software Engineering Foundation