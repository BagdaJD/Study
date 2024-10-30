'''
 4.36. Дано действительное x (|x| <= pi/4).Вычислить приближенное значение бесконечной суммы:
 1) sinx = x - x^3/3!  +  x^5/5 - .....

 y_i = (-1)^i+1 * x^2*i-1 / (2*i - 1)! - общая формула
 с = -x*x/(2*i-1)*(2*i-2) * y_i-1

y_1 = x, y_i = -x*x/(2*i-1)*(2*i-2) * y_i-1, i = 1, 2, 3, 4 ...
'''
from math import sin

p = int(input('epsilon = 10**(-p): p >>> '))
eps = 1

for _ in range(p):
    eps = eps / 10

x = float(input('real |x| < pi / 4 >>> '))

s = 0
i = 1
y = x

while abs(y) >= eps:
    s += y
    i += 1
    y = -x * x /(2 * i - 1)*(2 * i - 2) * y

print('summa = %*.*f' %(p+2, p, s))

sin_ = sin(x)
print('f(%5.2f) == %*.*f' % (sin_, p+2, p, s))