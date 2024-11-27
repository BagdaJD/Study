from random import randint

def createRandomArr(n):
    arr = []
    for _ in range(n):
        arr += [randint(1, 100)]
    
    return arr

def printArr(arr):
    for i in range(len(arr)):
        print(arr[i], end=' ')

n = int(input('n >>> '))

a = createRandomArr(n)
printArr(a)

print()

sum1 = 0
sum2 = 0

for i in range(len(a)):
    if a[i] % 2 == 0:
        sum1 += a[i]
    else:
        sum2 += a[i]

if sum1 > sum2:
    print('Сумма четных больше ,чем нечетных')
else:
    print('Сумма нечетных больше ,чем четных')

