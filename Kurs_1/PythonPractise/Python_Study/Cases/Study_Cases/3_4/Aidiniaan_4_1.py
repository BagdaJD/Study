'''
Дано действительное b > . Найти первый отрицательный член последова-
тельности a1 , a2 ,…, образованной по закону:
a1 = b; a_i = a_i-1 - i/sqrt(i - 1) 
'''

from math import *

b = float(input('b(>0) >> '))

i = 1
a = b
print('a >= 0')
print('%3d %7.2f %8s' %(i, a, a >= 0))
while a >= 0:
    i += 1
    a = a - i/sqrt(i - 1)
    print('%3d %7.2f %8s' %(i, a, a >= 0))


print('%6.2f' %a)
