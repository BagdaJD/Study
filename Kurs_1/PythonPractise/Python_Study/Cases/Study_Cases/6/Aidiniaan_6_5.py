def printList(a):
    for i in range(len(a)):
        print(a[i], end=' ')

def change1(a):
    max_, min_ = 0, 1000
    
    for i in range(len(a)):
        if a[i] < 0 :
            if i <= min_:
                min_ = i 
            else:
                max_ = i 
                
    a[min_], a[max_] = a[max_], a[min_]
    return a 

def change2(a):
    max_, min_ = 0, 1000
    
    for i in range(len(a)):
        if a[i] < 0 :
            if i <= min_:
                min_ = i 
            else:
                max_ = i 
                
    t = a[max_]
    a[max_] = a[min_]
    a[min_] = t 
    
    return a 
    
arr = [[1, 3, -1, -2], 
     [2, 3,-1, -5, 2,-3],
     [3, 2, 4,-1,-2, 4, 5,-7, 8]]

for a in arr:
    printList(a)
    print()
    
    b = a.copy()
    print(change1(b))
    
    b = a.copy()
    print(change2(b))