def printList(a):
    for i in a:
        print(i, end=" ")
    print()

def sdvig(a):
    for i in range(len(a)-1, -1, -1):
        if a[i] % 2 != 0:
            a += [0]
            for j in range(len(a) - 1, i, -1):
                a[j] = a[j - 1]
            a[i + 1] = 2025
    
    return a

def srez(a):
    for i in range(len(a) - 1, -1, -1):
        if a[i] % 2 != 0:
            a[i+1:i+1] = [2025]
    return a

def insert(a):
    for i in range(len(a)-1, -1, -1):
        if a[i] % 2 != 0:
            a.insert(i + 1, 2025)
    return a
    
a = [5, 4, 8, 5, 7, 3]
printList(a)

printList(sdvig(a.copy()))
printList(srez(a.copy()))
printList(insert(a.copy()))
