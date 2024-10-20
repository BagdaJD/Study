<<<<<<< Updated upstream
'''
Даны x, y, z.
Вычислить выражения U и V
'''
from math import *

x = float(input('Введите число x: '))
y = float(input('Введите число y: '))
z = float(input('Введите число z: '))

d = z*z + (x*x)/4
V = cos(d)
U = sin(abs((y - sqrt(abs(x)))*(x - y/d)))

print('Выражение V равно %4.2f' %V)
print('Выражение U равно %4.2f' %U)
=======
'''
Даны x, y, z.
Вычислить выражения U и V
'''
from math import *

x = float(input('Введите число x: '))
y = float(input('Введите число y: '))
z = float(input('Введите число z: '))

d = z*z + (x*x)/4
V = cos(d)
U = sin(abs((y - sqrt(abs(x)))*(x - y/d)))

print('Выражение V равно %4.2f' %V)
print('Выражение U равно %4.2f' %U)
>>>>>>> Stashed changes
