'''
4.11. Дано натуральное число n (количество цифр в числе заранее неизвестно).
Проверить, совпадают ли первая и последняя цифры в записи числа n
'''

n = int(input('natural n >>> '))
m = n

while m > 0 and (n % 10 != m // 10):
    m //= 10

print(m > 0)