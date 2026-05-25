n = int(input("Provide an integer input: "))
# n = 4


# Case-1
# for i in range(n): # i = 0 1 2 3
#     print((' '* i) + (str(i+1) + ' ') * (n-i))
# print()


# 1 1 1 1
#  2 2 2
#   3 3
#    4

####################################################################################

# Case-2

for i in range(n):
    print(' '* i, end='')
    for j in range(n-i):
        print( j+1, end=' ')
    print()
print()

# 1 2 3 4
#  1 2 3
#   1 2
#    1
####################################################################################