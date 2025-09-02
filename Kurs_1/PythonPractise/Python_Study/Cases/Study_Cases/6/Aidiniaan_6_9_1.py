
def printList(a):
    for i in range(len(a)):
        print(a[i], end=' ')
    print()

def removeBySdvig(x, y, a):
    length = len(a)    
    for i in range(length):
        if x <= a[i] <= y:
            for i in range(i, len(a)-1):
                a[i] = a[i+1]
            a[len(a)-1] = 0
            a.pop()
            length -= 1
    return a

def removeBySrez(x, y, a):
    for i in range(len(a)):
        if x <= a[i] <= a[i]:
            for j in range(i, len(a) - 1):
                a[j] = a[j + 1]
            a = a[:-1]
    
    return a

def removeByMethods(a, x, y):
    for k in range(x, y+1):
        while k in a:
            a.remove(k)
    return a
        

a = [5, 4, 12, 15, 2, 7, 8, 1, 9, 0]
printList(a)

x = int(input('int x: '))
y = int(input('int y: '))

printList(removeBySdvig(x, y, a.copy()))

