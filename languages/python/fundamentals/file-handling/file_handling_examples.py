# Python File Handling Examples

import os


# Write File Example
with open(
    "backend_report.txt",
    "w"
) as file:

    file.write(
        "Backend Engineering Report\n"
    )

print(
    "File Created"
)


# Read File Example
with open(
    "backend_report.txt",
    "r"
) as file:

    content = file.read()

print(content)


# Append File Example
with open(
    "backend_report.txt",
    "a"
) as file:

    file.write(
        "Request Processing Complete\n"
    )

print(
    "Data Appended"
)


# Read Line Example
with open(
    "backend_report.txt",
    "r"
) as file:

    first_line = file.readline()

print(first_line)


# Read All Lines Example
with open(
    "backend_report.txt",
    "r"
) as file:

    lines = file.readlines()

print(lines)


# File Existence Validation
if os.path.exists(
    "backend_report.txt"
):

    print(
        "File Available"
    )


# Exception Handling Example
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


# Backend Engineering Example
application_log = (
    "application.log"
)

with open(
    application_log,
    "a"
) as file:

    file.write(
        "API Request Processed\n"
    )

print(
    "Log Updated"
)


# Resource Cleanup Example
with open(
    "backend_report.txt",
    "r"
) as file:

    print(
        file.closed
    )

print(
    file.closed
)