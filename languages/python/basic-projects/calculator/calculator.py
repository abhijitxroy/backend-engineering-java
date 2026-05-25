# Calculator

print("Calculator")
print("1. Add")
print("2. Sub")
print("3. Mul")
print("4. Div")
ip = int(input("Enter the function name"))
arg1  = int(input())
arg2  = int(input())


def add( a, b):
    return a+b

def sub( a, b):
    return a-b

def mul( a, b):
    return a*b

def div( a, b):
    return a/b


if ip == 1:
    print(add(arg1,arg2))
    
elif ip == 2:
    sub(arg1,arg2)
elif ip == 3:
    mul(arg1, arg2)
elif ip == 4:
    div(arg1, arg2)
else: 
    print("Enter input range 1 to 4 \n")