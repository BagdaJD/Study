<<<<<<< Updated upstream
''' 3.2. Переменные a, b, c содержат некоторые целые значения. Если
значение переменной b неотрицательно, то поменять местами значения
переменных a и c. '''
a = int(input('a = '))
b = int(input('b = '))
c = int(input('c = '))
'''
t = 0
if b >= 0:
    t = a
    a = c
    c = t
print('a = %d; b = %d; c = %d' %(a, b, c))
'''
#кортеж
if b >= 0:
    (a, c) = (c, a)
print('a = %d; b = %d; c = %d' %(a, b, c))    
=======
''' 3.2. Переменные a, b, c содержат некоторые целые значения. Если
значение переменной b неотрицательно, то поменять местами значения
переменных a и c. '''
a = int(input('a = '))
b = int(input('b = '))
c = int(input('c = '))
'''
t = 0
if b >= 0:
    t = a
    a = c
    c = t
print('a = %d; b = %d; c = %d' %(a, b, c))
'''
#кортеж
if b >= 0:
    (a, c) = (c, a)
print('a = %d; b = %d; c = %d' %(a, b, c))    
>>>>>>> Stashed changes
