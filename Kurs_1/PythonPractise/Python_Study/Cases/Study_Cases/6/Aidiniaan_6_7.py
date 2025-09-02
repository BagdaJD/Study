def poisk(a):
    i = 0 
    j = i + 1

    
    while i < len(a) and a[i] % 10 != a[j] % 10:
        j += 1
        while j < len(a) - i and a[i] % 10 != a[j] % 10:
            j += 1 
            
        i += 1