# Python Exception Handling Examples


# try except Example
try:

    result = 10 / 0

except ZeroDivisionError:

    print(
        "Division Error"
    )


# else Example
try:

    database_connected = True

except Exception:

    print(
        "Database Connection Failed"
    )

else:

    print(
        "Database Connected"
    )


# finally Example
try:

    print(
        "Processing Request"
    )

finally:

    print(
        "Cleanup Resources"
    )


# Multiple Exception Example
try:

    number = int(
        "backend"
    )

except ValueError:

    print(
        "Invalid Number Format"
    )

except TypeError:

    print(
        "Type Error"
    )


# Raise Exception Example
request_count = 150

MAX_REQUEST_LIMIT = 100

try:

    if request_count > MAX_REQUEST_LIMIT:

        raise Exception(
            "Request Limit Exceeded"
        )

except Exception as error:

    print(error)


# Custom Exception Example
class DatabaseConnectionError(
    Exception
):
    pass


try:

    database_available = False

    if not database_available:

        raise DatabaseConnectionError(
            "Database Not Reachable"
        )

except DatabaseConnectionError as error:

    print(error)


# Backend Engineering Example
services = {
    "api": True,
    "database": False,
    "cache": True
}

for service, status in services.items():

    try:

        if not status:

            raise Exception(
                f"{service} Service Down"
            )

        print(
            service,
            "Healthy"
        )

    except Exception as error:

        print(error)


# File Handling Exception Example
try:

    with open(
        "backend_config.txt",
        "r"
    ) as file:

        print(
            file.read()
        )

except FileNotFoundError:

    print(
        "Configuration File Missing"
    )