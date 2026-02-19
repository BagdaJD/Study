def printArr(arr):
    for i in range(len(arr)):
        print(arr[i], end=' ')

def resh(arr, k1, k2):
    sum_ = 0
    for i in range(k1, k2 + 1):
        sum_ += a[i]
    
    return sum_

a = [1.1, 2.2, 3.3, 4.4, 
     5.5, 6.6, 7.7, 8.8, 9.9, 10.1]

printArr(a)
print()

k1 = int(input('k1 >>> '))
k2 = int(input('k2 >>> '))

res = resh(a, k1, k2)
print('Result = %s' %res) 