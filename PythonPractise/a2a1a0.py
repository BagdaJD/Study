<<<<<<< Updated upstream
'''
Дано целое трехзначное число n = a2a1a0(ai - цифры числа).Ихменить запись
числа на - n = a1a0a2
*Числа могут быть отрицательными.Сохранить знак числа
'''
'''
n = int(input('Введите целое трехзначное число: '))

z = n // abs(n)
n = abs(n)

a2 = n // 100
a1a0 = n % 100

n = (a1a0 * 10 + a2) * z
print(n)
'''
'''
Дано целое четырехзначное число n = a3a2a1a0(ai - цифры числа).Ихменить запись
числа , удалив цифру , отвечающую за сотни: n = a3a1a0
*Числа могут быть отрицательными.Сохранить знак числа
'''
'''
n = int(input('Введите четырехзначное число: '))

a3 = n // 1000
a1a0 = n % 100

n = a3 * 100 + a1a0
print(n)
'''
'''
Дано целое четырехзначное число n = a3a2a1a0(ai - цифры числа).Ихменить запись
числа добавиви цифру 5: n = a3a2_5_a1a0
*Числа могут быть отрицательными.Сохранить знак числа
'''
n = int(input('Введите четырехзначное число: '))

z = n // abs(n)
n = abs(n)

a3a2 = n // 100
a1a0 = n % 100

n = z * (a3a2 * 1000 + 500 + a1a0)
print(n)
=======
'''
Дано целое трехзначное число n = a2a1a0(ai - цифры числа).Ихменить запись
числа на - n = a1a0a2
*Числа могут быть отрицательными.Сохранить знак числа
'''
'''
n = int(input('Введите целое трехзначное число: '))

z = n // abs(n)
n = abs(n)

a2 = n // 100
a1a0 = n % 100

n = (a1a0 * 10 + a2) * z
print(n)
'''
'''
Дано целое четырехзначное число n = a3a2a1a0(ai - цифры числа).Ихменить запись
числа , удалив цифру , отвечающую за сотни: n = a3a1a0
*Числа могут быть отрицательными.Сохранить знак числа
'''
'''
n = int(input('Введите четырехзначное число: '))

a3 = n // 1000
a1a0 = n % 100

n = a3 * 100 + a1a0
print(n)
'''
'''
Дано целое четырехзначное число n = a3a2a1a0(ai - цифры числа).Ихменить запись
числа добавиви цифру 5: n = a3a2_5_a1a0
*Числа могут быть отрицательными.Сохранить знак числа
'''
n = int(input('Введите четырехзначное число: '))

z = n // abs(n)
n = abs(n)

a3a2 = n // 100
a1a0 = n % 100

n = z * (a3a2 * 1000 + 500 + a1a0)
print(n)
>>>>>>> Stashed changes