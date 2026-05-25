# Python OOP Examples

from abc import (
    ABC,
    abstractmethod
)


# Class and Object Example
class Service:

    pass


api_service = Service()

print(
    type(api_service)
)


# Constructor Example
class Database:

    def __init__(
        self,
        host,
        port
    ):

        self.host = host
        self.port = port

    def connect(
        self
    ):

        print(
            f"Connected -> "
            f"{self.host}:"
            f"{self.port}"
        )


database = Database(
    "localhost",
    5432
)

database.connect()


# Instance Variable Example
class Application:

    def __init__(
        self,
        application_name
    ):

        self.application_name = (
            application_name
        )

    def start(
        self
    ):

        print(
            self.application_name,
            "Started"
        )


backend_app = Application(
    "Backend Platform"
)

backend_app.start()


# Encapsulation Example
class Cache:

    def __init__(
        self
    ):

        self.__cache_size = 256

    def get_cache_size(
        self
    ):

        return self.__cache_size


cache = Cache()

print(
    cache.get_cache_size()
)


# Inheritance Example
class BackendService:

    def deploy(
        self
    ):

        print(
            "Backend Service Deploy"
        )


class PaymentService(
    BackendService
):

    pass


payment = PaymentService()

payment.deploy()


# Polymorphism Example
class Notification:

    def send(
        self
    ):

        print(
            "Generic Notification"
        )


class EmailNotification(
    Notification
):

    def send(
        self
    ):

        print(
            "Email Notification"
        )


class SlackNotification(
    Notification
):

    def send(
        self
    ):

        print(
            "Slack Notification"
        )


notifications = [
    EmailNotification(),
    SlackNotification()
]

for notification in notifications:

    notification.send()


# Abstraction Example
class HealthCheck(
    ABC
):

    @abstractmethod

    def execute(
        self
    ):

        pass


class APIHealthCheck(
    HealthCheck
):

    def execute(
        self
    ):

        print(
            "API Healthy"
        )


health = APIHealthCheck()

health.execute()


# Backend Engineering Example
class ServiceMonitor:

    def __init__(
        self,
        service_name,
        is_running
    ):

        self.service_name = (
            service_name
        )

        self.is_running = (
            is_running
        )

    def health_status(
        self
    ):

        if self.is_running:

            return (
                f"{self.service_name} "
                f"Healthy"
            )

        return (
            f"{self.service_name} "
            f"Down"
        )


monitor = ServiceMonitor(
    "payment-service",
    True
)

print(
    monitor.health_status()
)