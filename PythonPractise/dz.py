from math import sqrt

b = float(input('real b >> '))

a = b
i = 1


print('%3d %7.2f %s' % (i, a, a >= 0))
while a >= 0:
    i += 1
    a = a - i / sqrt(i - 1)
    print('%3d %7.2f %s' % (i, a, a >= 0))
    
print('Result: %6.4f' %a)
