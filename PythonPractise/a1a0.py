<<<<<<< Updated upstream
'''
Дано натуральное число n = a2a1a0(ai - цифры числа).Изменить запись его числа,
поменяв местами цифры a0a1a2
'''
'''
n = int(input('Введите двухзначное число:  '))

a1 = n // 10
a0 = n % 10

n = a0 * 10 + a1
print(n)
'''
'''
Дано натуральное число n = a2a1a0(ai - цифры числа).Изменить запись его числа,
поменяв местами цифры a0a2a1
'''
n = int(input('Введите трехзначное число:  '))
a2a1 = n // 10
a0 = n % 10

n = a0 * 100 + a2a1
print(n)
=======
'''
Дано натуральное число n = a2a1a0(ai - цифры числа).Изменить запись его числа,
поменяв местами цифры a0a1a2
'''
'''
n = int(input('Введите двухзначное число:  '))

a1 = n // 10
a0 = n % 10

n = a0 * 10 + a1
print(n)
'''
'''
Дано натуральное число n = a2a1a0(ai - цифры числа).Изменить запись его числа,
поменяв местами цифры a0a2a1
'''
n = int(input('Введите трехзначное число:  '))
a2a1 = n // 10
a0 = n % 10

n = a0 * 100 + a2a1
print(n)
>>>>>>> Stashed changes