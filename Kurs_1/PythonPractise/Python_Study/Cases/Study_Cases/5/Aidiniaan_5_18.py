'''
i = 1
y_i = y_(i-1) * x*x(2i - 1) / 1 + 2i
'''
from sympy import Symbol, Sum, log, oo

def summa(x, eps = 1e-5):
    i = 0
    y = x 
    
    sum_ = y 
    while y >= eps:
        i += 1 
        y = y * x * x * (2 * i - 1) / (1 + 2*i)
        sum_ += y 
        
    return (sum_, i + 1)

x = float(input('x(abs(x) < 1) >>> '))
s = input('eps = 1e-5(n - нет, enter -  да)')

if s == 'n':
    s = int(input('Задайте число после запятой'))
    N = s
    eps = 1 / 10 ** N
    sum_, n = summa(x, eps)
else:
    N = 5
    sum_, n = summa(x)

print('summa = %*.*f' %((N+3),(N), sum_))

print('n = %d' %n)


i = Symbol('i')
ss = Sum(x**(2*i + 1) / 2*i + 1, (i, 0, oo)).evalf()

print('sympy = %*.*f' %((N+3),(N), ss))
print()
f = log(1 + x / (1 - x)) / 2 

print('f(x) = %*.*f' %((2*N + 3), (2*N), f))