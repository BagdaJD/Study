''' . Дано натуральное число n. Проверить, есть ли в записи числа n
цифра 5. '''
n = int(input('natural n >>> '))
m = abs(n)

print('%12d %6s'%(m, m > 0 and m % 10 != 5))
while m > 0 and m % 10 != 5:
    m //= 10
    print('%12d %6s'%(m, m > 0 and m % 10 != 5))
    
print(m > 0)
