def printList(a):
    for i in range(len(a)):
        print(a[i], end=' ')
    print()

#Линейный поиск
def poisk(a):
    i = 0
    while i < len(a) and a[i] % 2 != 0:
        i += 1

    return i < len(a)

#Линейный поиск с фиктивным/барьерным элементом(что ищем,то и добавляем)
def poiskB(a):
    #len(a) = 5
    a += [2]
    #len(a) = 6
    i = 0
    while a[i] % 2 != 0:
        i += 1 
    return i < len(a) - 1#на один меньше,т.к один лишний

test = [
    [2, 7, 9],
    [3, 2, 6],
    [3, 5, 6],
    [1],
    [1, 3, 4, 5, 7, 9]
]

for a in test:
    printList(a)
    if poiskB(a):
        print('Четные есть')
    else:
        print('Четных нет')

    print('=' * 25)
