''' 2.2. Даны величины сторон треугольника a, b, c. Найти градусную меру
всех углов треугольника.  '''
from math import *

a = float(input('Введите сторону a: '))
b = float(input('Введите сторону b: '))
c = float(input('Введите сторону c: '))

cos_alfa = (a * a + c * c - a * a) / (2 * b * c)
cos_beta = (a * a + c * c - b * b) / (2 * a * c)
cos_gama = (b * b + a * a - c * c) / (2* a * b)
alfa = degrees(acos(cos_alfa))
beta = degrees(acos(cos_beta))
gama = degrees(acos(cos_gama))

print('Угол альфа равняется %4.3f' %alfa)
print('Угол бета равняется %4.3f' %beta)
print('Угол гама равняется %4.3f' %gama)
