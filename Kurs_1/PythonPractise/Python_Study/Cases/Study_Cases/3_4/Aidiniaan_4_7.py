'''
Дано a ∈ R. Среди чисел

 1, 1 + 1/2 , 1 + 1/2 + 1/3< ...
 найти первое ,большее a
'''
a = float(input('real a >>> '))
i = 1
t = 1

print('%3d %7.2f %7s' %(i, t, a >= t))
while a > t:
    i += 1
    t += 1/i
    print('%3d %7.2f %7s' %(i, t, a >= t))

print('Res:%6.2f' %t)
