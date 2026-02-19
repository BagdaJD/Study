def read(n):
    arr = []
    for _ in range(n):
            x = int(input())
            arr += [x]
    return arr 

def resh(arr, m = 5):
    k = 0
    for i in range(len(arr)):
        if a[i] % m == 0: 
            k += 1 
    return k 
    

n = int(input('n >>> '))
a = read(n)

m = int(input('m >>> '))

res1 = resh(a)
res2 = resh(a, 2)

print('Resul1 = %s' %res1)
print('Result2 = %s' %res2)