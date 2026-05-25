n = int(input('Enter n value: '))

# Way-1
for i in range( n ):
    print('* '*n)
print("\n")

# Way-2
for i in range( n ):
    for j in range( n ):
        print('*', end=" ")
    print("\t")
print("\n")
