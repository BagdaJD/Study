'''
Дано положительное a (a < 1). Найти наибольшее число вида 2^−n
, n > 0, меньшее a.
'''

a = float(input('a(<1) >> '))
t = 1
n = 0

print('2^-n >= a')
print('%3d %7.2f %8s' %(n, t, t >= a))
while t >= a:
    n += 1
    t /= 2
    print('%3d %7.2f %8s' %(n, t, t >= a))

print('%6.2f' %t)


