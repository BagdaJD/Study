```python

'''
4.47 Дано натуральное n. Вычислить:
Сумму (-1)^i/2*i + 1, i = 1, 2, 3
'''
n = int(input('n >>> '))

z = -1
s = z / 3

for i in range(2, n + 1):#не забываем +1 дописать
    z = -z 
    s = s + z / (2 * i + 1)

print('summa = %7.5f' %s)
```
Проверка через SymPy
```python
#Проверка чере симпай

from sympy import *

i = Symbol('i')
ss = Sum((-1)** i / (2 * i + 1), (i, 1, oo)).evalf()
print('suma = %7.2f' %ss)
```
### Примеры вычислений степени и факторилов(рекурентно)
```python
#Рекурентное вычисление степени (упрощ)
x = float(input('x = '))
n = int(input('n = '))#натуральнок, т.е  n = 1, 2, 3

y = x
for _ in range(2, n + 1):
    y = y * x
print(y)
------------
#Рекурентное вычисление степени(для всех)
x = float(input('x = '))
n = int(input('n = '))#натуральнок, т.е  n = 1, 2, 3

y = 1
for _ in range(2, n + 1):
    y = y * x
print(y)
------------
#Рекурентное вычисление факториала(упрощ)
n = int(input('n = '))#натуральнок, т.е  n = 1, 2, 3

y = 1
for i in range(2, n + 1):
    y = y * i
print(y)
------------
#Рекурентное вычисление факториала(для всех)
n = int(input('n = '))#натуральнок, т.е  n = 1, 2, 3

y = 1
for i in range(1, n + 1):
    y = y * i
print(y)
```

Задачки
```python
'''4.49'''
from math import sin as msin#Чтобы не запутаться

x = float(input('x = '))
n = int(input('n = '))
#начальное значение при i = 1
fact = 1 #i!
p = 1 + msin(i * x) / fact

for i in range(2, n + 1):#Рекурентно находим факториал и остальное выражение
    fact = fact * i
    p = p * (1 + msin(i * x) / fact)

print('prod = %7.5f' %p)
-------------
#Проверка через SymPy
#Проверка SymPy
from sympy import Symbol, Product, sin, factorial

i = Symbol('i')
ps = Product(1 + sin(i * x) / factorial(i), (i, 1, n))#произведение
print('symp = %7.5f' %ps)

-----------------------
-----------------------

'''4.50'''
from math import sin as msin
from sympy import Symbol, Sum, sin

x = float(input('x = '))
n = int(input('n = '))

y = msin(x)
s = y

for _ in range(2, n + 1):
    y = y * msin(x)
    s = s + y

print('summa = %7.4f' %s)

#Проверка
i = Symbol('i')
ss = Sum(sin(x) ** i, (i, 1, n))
print('ssumma = %7.4f' %ss)

```