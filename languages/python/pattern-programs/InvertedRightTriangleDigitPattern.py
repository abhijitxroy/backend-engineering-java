n = int(input("Provide an integer: "))

for i in range(n):
    for j in range(n-i):
        print(str(j + 1), end=' ' )
    print()
print()



# Provide an integer: 3
# 1 2 3 
# 1 2 
# 1 