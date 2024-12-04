def printArr(arr):
    for i in range(len(arr)):
        print(arr[i], end=' ')


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