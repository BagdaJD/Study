'''
Описать функцию, которая для любого целого аргумента возвращает коли-
чество цифр в его записи.
'''

def countDig(n):
    N = abs(n)
    k = 0
    while N > 0:
        k += 1
        N //= 10
    return k


a = int(input('a >>> '))
b = int(input('b >>> '))
c = int(input('c >>> '))

print('Count of digits A : %3d' %countDig(a))
print('Count of digits B : %3d' %countDig(b))
print('Count of digits C : %3d' %countDig(c))
