# Python Control Flow Examples


# if Condition
cpu_usage = 85

if cpu_usage > 80:
    print("High CPU Usage")


# if else Condition
memory_usage = 65

if memory_usage > 80:
    print("Memory Alert")

else:
    print("Memory Healthy")


# if elif else Condition
response_time = 250

if response_time < 100:

    print("Fast Response")

elif response_time < 300:

    print("Normal Response")

else:

    print("Slow Response")


# Nested Condition
api_enabled = True
database_enabled = True

if api_enabled:

    if database_enabled:

        print(
            "Application Ready"
        )


# for Loop
services = [
    "api",
    "database",
    "cache"
]

for service in services:

    print(service)


# range Example
for retry in range(3):

    print(
        "Retry:",
        retry
    )


# while Loop
retry_count = 1

while retry_count <= 3:

    print(
        "Retry Attempt:",
        retry_count
    )

    retry_count += 1


# break Example
for retry in range(5):

    if retry == 3:
        break

    print(
        "Break Example:",
        retry
    )


# continue Example
for retry in range(5):

    if retry == 2:
        continue

    print(
        "Continue Example:",
        retry
    )


# pass Example
feature_enabled = True

if feature_enabled:
    pass


# Backend Engineering Example
services_health = {
    "api": True,
    "database": True,
    "cache": False
}

for service, status in services_health.items():

    if status:

        print(
            service,
            "Healthy"
        )

    else:

        print(
            service,
            "Down"
        )


# Retry Logic Example
MAX_RETRY = 3

attempt = 1

while attempt <= MAX_RETRY:

    print(
        "Connection Attempt:",
        attempt
    )

    attempt += 1	