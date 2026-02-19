'''
Даны целые числа a, b, c. Найти значение выражения -
min(a, b, c)/log(a)
'''

a = int(input('a = '))

if a == 0 or a == 1:
    print('Нет решений')
else:
    b = int(input('b = '))
    c = int(input('c = '))
    mn = 0
    mx = 0

    if a > b and a > c:
        mx = a
        if b < c:
            mn = b
        else:
            mn = a
    elif b > a and b > c:
        mx = b
        if a < c:
            mn = a
        else:
            mn = c
    else:
        mx = c
        if a < b:
            mn = a
        else:
            mn = b
    
