def printArr(arr):
    for i in range(len(arr)):
        print(arr[i], end=' ')

n = int(input())

s = ['z', 'f', 't', 'a', 'u', 'm', 'd']

print('Последовательность S')
printArr(s)

m = s
p = []

print()
print()

for i in range(n - 1):
    for j in range(n - 1 - i):
        if m[j] > m[j + 1]:
            m[j], m[j + 1] = m[j + 1], m[j]

p = m

print('Последовательность P')
printArr(p)