'''
 4.35. Дано действительное x. Вычислить приближенное значение бесконечной
 суммы:
 ln(1 + x) = x - x^2/2 + x^3/3 ... (|x| < 1)
 Напечатьвыдаватьзначениесуммы,посчитанноесзаданнойточностью,изначение
 функции.

 y_i = (-1)^(i+1)* x^i/i - общая формула
 c = x(1 - i)/i

 y_i = x(i-1)/i  *  (y_i-1)
'''
from math import log

p = int(input('epsilon = 10**(-p): p >> '))
eps = 1
for _ in range(p):
    eps = eps / 10

x = float(input('real |x| < 1 >>> '))

s = 0
i = 1
y = x
while abs(y) >= eps:
    s += y
    i += 1
    y = x * (1 - i)/i * y

print('summa = %*.*f' %(p+2, p, s))

f = log(1 + x)
print("f(%4.2f) = %*.*f" %(x, p+2, p, f))