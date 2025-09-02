'''
записать одну из модификаций этого алгоритма
'''

'''
a = int(input())
b = int(input())

if b > a:
    a, b = b, a

while b != 0:
    r = a % b
    a, b = b, r

cmd = a
print(cmd)
'''

a = int(input('a >>> '))
b = int(input('b >>> '))

while a * b != 0:
    if a > b:
        a = a % b
    else:
        b = b % a

print(a + b)
