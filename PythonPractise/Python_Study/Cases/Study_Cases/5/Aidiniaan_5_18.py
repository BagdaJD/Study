'''
Дано действительное x. Вычислить приближенное значение бесконечной
суммы.


y_i = x*x(2*i-1) / (2*i + 1)
'''
from sympy import Symbol, Sum, oo, log

def summa(x, eps=1e-05):
    i = 0
    y = x
    sum_ = y

    while y >= eps:
        i += 1
        y = y * x * x * (2 * i - 1) / (2 * i + 1)
        sum_ += y

    return (sum_, i)

x = float(input('x(abs(x) < 1) >>> '))
s =  input('eps = 1e-5 (n - нет, enter - да) >>> ')

if s == 'n':
    s = int(input('Задайте число цифр после запятой >>> '))
    N = s #Для форматированного вывода
    eps = 1 / 10 ** N
    res = summa(x, eps)
else:
    N = 5 #Для форматированного вывода
    eps = 1e-05
    res = summa(x)

sum_ = res[0]
n = res[1]

print('eps = %s' %eps)
print('sum = %*.*f' %(N+3, N, sum_))
print('n = %d' %n)

#Проверка
print('Проверка')

i = Symbol('i')
ss = Sum(x**(2*i + 1) / (2*i + 1), (i, 0, oo)).evalf()
f = log((1 + x) / (1 - x)) / 2

print('ss = %*.*f' %(N, N+3, ss))
print('f(x) = %*.*f' %(N*2 + 3, N*2, f))


