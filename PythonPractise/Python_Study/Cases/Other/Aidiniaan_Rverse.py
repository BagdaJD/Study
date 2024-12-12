def printList(a):
    for i in a:
        print(i, end=" ")

def myReverse(a):
    a = a[::-1]

    return a 

def myReverse1(a):
    b = []
    for i in range(len(a)-1, -1, -1):
        b += [a[i]]
    
    return b 

a = [1, 2, 3, 4, 5, 6]
printList(myReverse(a.copy()))

print()

a = [1, 2, 3, 4, 5, 6]
printList(myReverse1(a.copy()))