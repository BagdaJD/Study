def printList(a):
    for i in a:
        print(i, end=" ")

def vstavkaByInsert(a):
    for i in range(len(a) - 1, -1, -1):
        if a[i] < 0:
            a.insert(i + 1, 100)
    
    return a

def vstavkaBySrez(a):
    for i in range(len(a) - 1, -1, -1):
        if a[i] < 0:
            a[i + 1:i + 1] = [100]
    
    return a

a = [-1, -4, -5, -6, -10]
b = vstavkaByInsert(a.copy())
printList(b)

print()

b = vstavkaBySrez(a.copy())
printList(b)
'''
-1 100 -4 100 -5 100 -6 100 -10 100 
-1 100 -4 100 -5 100 -6 100 -10 100 
'''