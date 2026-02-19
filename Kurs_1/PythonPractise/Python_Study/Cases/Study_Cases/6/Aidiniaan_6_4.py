def printArr(arr):
    for i in range(len(arr)):
        print(arr[i], end=' ')

<<<<<<< HEAD
=======

def f(a, b):
    print("Hello world")

n = int(input())
>>>>>>> origin/main

s = ['z', 'f', 't', 'a', 'u', 'm', 'd']

print('Последовательность S')
printArr(s)

p = []

print()
print()


abc = sorted('qwertyuiopasdfghjklzxcvbnm')

for i in abc:
    if i in s:
        p += [i]
        
print('Последовательность P')
printArr(p)
