from math import ceil

def myDivMod(a, b):

     if b == 0:
          return 'На 0 делить нельзя'
     n1 = a // b
     n2 = a - ceil(n1)*b

     return (n1, n2)

print(myDivMod(10, 3))
print(myDivMod(10, -3))
print(myDivMod(-10, 3))
print(myDivMod(-10, -3))
print(myDivMod(-10, 0))
'''
(3, 1)
(-4, -2)
(-4, 2)
(3, -1)
На 0 делить нельзя
'''
