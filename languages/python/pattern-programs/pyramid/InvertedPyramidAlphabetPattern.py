n = int(input("Provide an integer input: "))
# n = 4

####################################################################################

# Case-1
# for i in range(n): # i = 0 1 2 3
#     print((' '*i) + (str(chr(65+i)+ ' ')*(n-i) ))
# print()


# A A A A
#  B B B
#   C C 
#    D

####################################################################################

#case-2

# for i in range(n):
#     print(' '*i, end='')
#     for j in range(n-i):
#         print(chr(65+j), end=' ')
#     print()
# print()

# A B C D
#  A B C
#   A B
#    A

####################################################################################

#case-3

for i in range(n):
    print(' '*i, end='')
    for j in range(n-i):
        print(chr(64+n-j), end=' ')
    print()
print() 

# D C B A
#  D C B
#   D C
#    D
