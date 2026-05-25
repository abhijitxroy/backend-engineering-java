# Python Collections Examples


# List Example
services = [
    "api",
    "database",
    "cache"
]

services.append("queue")

print("Services:", services)

services.remove("cache")

print("Updated Services:", services)

print("Service Count:", len(services))


# List Iteration
for service in services:
    print(service)


# Tuple Example
database_server = (
    "localhost",
    5432
)

print(database_server)

print(database_server[0])


# Set Example
regions = {
    "us-east",
    "eu-west",
    "us-east"
}

print(regions)

regions.add("ap-south")

print(regions)

print("ap-south" in regions)


# Dictionary Example
config = {
    "host": "localhost",
    "port": 5432,
    "database": "backend_db"
}

print(config)

print(config["host"])

print(config.get(
    "timeout",
    30
))

config["port"] = 3306

print(config)


# Dictionary Iteration
for key, value in config.items():
    print(key, value)


# Sorting Example
response_times = [
    120,
    80,
    200,
    60
]

sorted_response_times = sorted(
    response_times
)

print(sorted_response_times)


# Backend Engineering Example
service_health = {
    "api": True,
    "database": True,
    "cache": False
}

healthy_services = []

for service, status in service_health.items():

    if status:
        healthy_services.append(service)

print(
    "Healthy Services:",
    healthy_services
)


# API Payload Processing Example
api_payload = [
    {
        "service": "api",
        "status": "healthy"
    },
    {
        "service": "cache",
        "status": "unhealthy"
    }
]

healthy_payload_services = []

for payload in api_payload:

    if payload["status"] == "healthy":

        healthy_payload_services.append(
            payload["service"]
        )

print(
    "Healthy Payload Services:",
    healthy_payload_services
)