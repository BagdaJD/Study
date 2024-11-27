'''
Одна функция, которая считает одну медиану, проведенную к стороне х, для сторон треугольника x, y, z
после ввода трёх сторон треугольника a, b, c вызоваем три раза функцию от наборов (a, b, c), (b, c, a), (c, a, b)
'''
from math import sqrt

def med(x, y, z):
    length = sqrt(2*z*z + 2*y*y - z*z)
    return length

a = float(input('a >>> '))
b = float(input('b >>> '))
c = float(input('c >>> '))

medA = med(a, b, c)
medB = med(b, a, c)
medC = med(c, a, b)

print('Медиана к стороне A: %7.4f' %medA)
print('Медиана к стороне B: %7.4f' %medB)
print('Медиана к стороне C: %7.4f' %medC)
