# Python Functions Examples


# Basic Function
def display_service():
    print("Payment Service Running")


display_service()


# Function Arguments
def deploy_service(service_name):
    print("Deploying:", service_name)


deploy_service("payment-service")


# Function Return Value
def calculate_total(price, quantity):
    return price * quantity


total = calculate_total(100, 3)

print("Total:", total)


# Default Parameter
def start_service(service_name, replicas=1):
    print(service_name, replicas)


start_service("auth-service")
start_service("payment-service", 3)


# Keyword Arguments
def create_user(name, role):
    print(name, role)


create_user(role="admin", name="Alex")


# Variable Length Arguments
def process_services(*services):
    print(services)


process_services(
    "api",
    "database",
    "cache"
)


# Lambda Function
square = lambda number: number * number

print(square(5))


MAX_REQUEST_LIMIT = 100

# Backend Engineering Example
def validate_request(api_key, request_count):

    if api_key and request_count < MAX_REQUEST_LIMIT:
        return "Request Accepted"

    return "Request Rejected"


result = validate_request(
    "backend-key",
    50
)

print(result)


# Configuration Processing Example
def build_database_url(
    host,
    port,
    database
):

    return (
        f"postgresql://"
        f"{host}:"
        f"{port}/"
        f"{database}"
    )


database_url = build_database_url(
    "localhost",
    5432,
    "backend_db"
)

print(database_url)


# Metrics Processing Example
def calculate_cpu_average(*cpu_values):
    return sum(cpu_values) / len(cpu_values)


print(
    calculate_cpu_average(
        60,
        70,
        80
    )
)