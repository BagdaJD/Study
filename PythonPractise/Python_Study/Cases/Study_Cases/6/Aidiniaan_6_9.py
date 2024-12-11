def printList(a):
    for i in range(len(a)):
        print(a[i], end=' ')
    print()

def removeBySdvig(a, x, y): 
    i = 0
    while i < len(a):
        if x <= a[i] <= y:
            for j in range(i, len(a) - 1):
                a[j] = a[j + 1]
            a[len(a) - 1] = 0
            a.pop()
        else:
            i += 1
    return a  

def removeBySrez(a, x, y):
    i = 0
    while i < len(a):
        if x <= a[i] <= y:
            a = a[:i] + a[i + 1:]
        else:
            i += 1
    return a

def removeByMethod(a, x, y):
    i = 0
    while i < len(a):
        if x <= a[i] <= y:
            a.pop(i)
        else:
            i += 1
    return a
    

a = [9, 8, 5, 3, 23]
printList(a)

x = int(input('x >>> '))
y = int(input('y >>> '))

printList(removeBySrez(a.copy(), x, y))
printList(removeBySdvig(a.copy(), x, y))
printList(removeByMethod(a.copy(), x, y))
