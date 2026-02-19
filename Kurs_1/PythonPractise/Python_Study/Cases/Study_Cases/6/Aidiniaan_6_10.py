def printList(a):
    for i in a:
        print(i, end=" ")

def vstavkaBySdvig(a):
    b = a.copy()
    
    for i in range(len(b) - 1, -1, -1):
        if b[i] % 2 != 0:
            b += [0]
            for j in range(len(b) - 1, i, -1):
                b[j] = b[j - 1]
            b[i + 1] = 2025
    
    return b 

def vstavkaBySrez(a):
    b = a.copy()
    
    for i in range(len(b) - 1, -1, -1):
        if b[i] % 2 != 0:
            b[i + 1:i + 1] = [2025]
    
    return b

def vstavkaByInsert(a):
    b = a.copy()
    
    for i in range(len(b) - 1, -1, -1):
        if b[i] % 2 != 0:
            b.insert(i + 1, 2025)
    return b
    
a = [1, 3, 6, 9, 10,
     20, 78, 54, 90]
printList(a)
print()

a1 = a.copy()

b = vstavkaBySdvig(a1)
printList(b)
print()

b = vstavkaBySrez(a1)
printList(b)
print()

b = vstavkaByInsert(a1)
printList(b)
print()