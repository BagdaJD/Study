'''
Дано действительное x. Вычислить приближенное значение бесконечной
суммы.


y_i = x*x(2*i-1) / (2*i + 1)
'''
from sympy import Symbol, Sum, oo
from math import log

x = float(input('x(abs(x) < 1) >>> '))
n = input('eps = 1e-5 (n - нет, enter - да) >>> ')

if n == 'n':
    N = int(input('Задайте число цифр после запятой >>> '))
    eps = 1 / 10**N
elif n == 'enter':
    eps = 1e-05


i = 0
y = x
sum_ = y

while y >= eps:
    i += 1
    y = y * x * x * (2 * i - 1) / (2 * i + 1)
    sum_ += y

f = log(1 + x / (1 - x)) / 2

print('sum = %8.5f' %sum_)
print('n = %3d' %i)
print('f(x) = %7.2f' %(f - sum_))
I = Symbol('i')
ss = Sum(x**(2*i + 1) / (2*i + 1), (I, 0, oo)).evalf()
print('ss = %8.5f' %ss)

