#Проверка 4.31
from sympy import *

i = Symbol('i')
ss = Sum(1 / i / (i + 1) / (i + 2), (i, 1, oo))
print(ss)
