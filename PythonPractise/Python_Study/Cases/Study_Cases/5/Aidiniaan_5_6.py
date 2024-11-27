'''
Даны целые a, b. Получить значения выражений
u = min(a, b), v = min(a*b, a + b), w = min(u + v*v, 14)
'''
def minAB(a, b):
    min_ = a
    if b < a:
        min_ = b
    return min_

a = int(input('a >>> '))
b = int(input('b >>> '))

u = minAB(a, b)
v = minAB(a*b, a + b)
w = minAB(u + v * v, 14)

print('U = %4d' %u)
print('V = %4d' %v)
print('W = %4d' %w)
