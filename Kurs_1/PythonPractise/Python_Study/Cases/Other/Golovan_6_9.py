def printList(a):
    for i in range(len(a)):
        print(a[i], end=' ')
    print()

def sdvig(a, x, y):
    vec = a.copy()
    for k in range(x, y+1):
        for i in range(k, len(a)-1):
            vec[i] = vec[i+1]
        vec[len(vec)-1] = 0
        vec.pop()
    return vec

def srez(a, x, y):
    for k in range(x, y+1):
        a = a[:a.index(k)] + a[a.index(k) + 1:]

    return a

def method_rem(a, x, y):
    for k in range(x, y+1):
        a.remove(k)
    return a
        

a = [5, 4, 12, 15, 2, 7, 8, 1, 9, 0]
printList(a)

x = int(input('int x: '))
y = int(input('int y: '))

printList(sdvig(a.copy(), x, y))
printList(srez(a.copy(), x, y))
printList(method_rem(a.copy(), x, y))

