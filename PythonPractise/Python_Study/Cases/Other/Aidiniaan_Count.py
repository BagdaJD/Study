def myCount(a, el):
    k = 0
    for i in range(len(a)):
        if a[i] == el:
            k += 1 
    
    return k 

a = [1, 2, 3, 4, 5, 1, 1, 1]

print(myCount(a, 1))