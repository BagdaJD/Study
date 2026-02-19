'''
Даны натуральное n и вещественное х.
Описать функцию с параметрами по умолчанию для вычисления суммы
1 + x + x^2 + ... + x^n.
Вызов функции осуществить в четырёх вариантах:
а) со значеняими по умолчанию
б, в) с одним параметром по умолчанию, второй задать по ключу
г) используя позиционные параметры
'''
def summa(x = 2, n = 5):
    y = 1
    sum_ = y

    for _i in range(1, n + 1):
        y = y * x
        sum_ += y

    return sum_

n = int(input('natural n >>> '))
x = float(input('float x >>> '))

res = summa()
print('Res = %s' %res)
#1 + 2 + 4 + 8 + 16 + 32

res = summa(x = x)
print('Res = %s' %res)
#x = 3 n = 5
#1 + 3 + 9 + 27 + 81 + 243

res = summa(n = n)
print('Res = %s' %res)
#x = 2 n = 3
#1 + 2 + 4 + 8

res = summa(x, n)
#x = 3 n = 3
#1 + 3 + 9 + 27

print('Res = %s' %res)
