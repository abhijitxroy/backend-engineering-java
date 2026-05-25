

# Python Operators Examples

# Arithmetic Operators
cpu = 80
memory = 20

print("Addition:", cpu + memory)
print("Subtraction:", cpu - memory)
print("Multiplication:", cpu * memory)
print("Division:", cpu / memory)
print("Modulus:", cpu % memory)
print("Exponent:", memory ** 2)

# Comparison Operators
api_response_time = 120
threshold = 100

print("Greater Than:", api_response_time > threshold)
print("Less Than:", api_response_time < threshold)
print("Equal:", api_response_time == threshold)
print("Not Equal:", api_response_time != threshold)

# Logical Operators
is_api_up = True
is_database_up = True

print("AND:", is_api_up and is_database_up)
print("OR:", is_api_up or is_database_up)
print("NOT:", not is_api_up)

# Assignment Operators
request_count = 100

request_count += 20
print("After +=", request_count)

request_count -= 10
print("After -=", request_count)

# Membership Operators
services = ["api", "database", "cache"]

print("api" in services)
print("queue" not in services)

# Identity Operators
primary_database = ["postgres"]
secondary_database = primary_database

print(primary_database is secondary_database)
print(primary_database is not secondary_database)

# Backend Engineering Example
cpu_usage = 75
memory_usage = 60

system_healthy = cpu_usage < 85 and memory_usage < 85

print("System Healthy:", system_healthy)