<<<<<<< Updated upstream
'''
. Дано x. Вычислить значение функции
1) y = ,0 при x <= 0;
       ,x при 0 < x <= 1;
       x^2 в противном случае
Указания.
1)с вложенным оператором
2)с каскадным оператором
3)с вложенным тернарным оператором
'''
from math import *
x = float(input('x = '))
'''
#1)
if x <= 0:
    y = 0
else:
    if x <= 1:
        y = x
    else:
        y = x * x
print('y = %6.4f' %y)
#2)
if x <= 0:
    y = 0
elif x <= 1:
    y = x
else:
    y = x * x
print('y = %6.4f' %y)
#3)
y = 0 if x <= 0 else(x if x <= 1 else x * x)
'''
print((exp(x) - exp(-x))/2)
print('x = %x' %int(round(x)))
=======
'''
. Дано x. Вычислить значение функции
1) y = ,0 при x <= 0;
       ,x при 0 < x <= 1;
       x^2 в противном случае
Указания.
1)с вложенным оператором
2)с каскадным оператором
3)с вложенным тернарным оператором
'''
x = float(input('x = '))
#1)
if x <= 0:
    y = 0
else:
    if x <= 1:
        y = x
    else:
        y = x * x
print('y = %6.4f' %y)
#2)
if x <= 0:
    y = 0
elif x <= 1:
    y = x
else:
    y = x * x
print('y = %6.4f' %y)
#3)
y = 0 if x <= 0 else(x if x <= 1 else x * x)
print('y = %6.4f' %y)
>>>>>>> Stashed changes
