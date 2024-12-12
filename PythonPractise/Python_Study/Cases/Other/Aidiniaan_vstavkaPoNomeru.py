def printList(a):
    for i in a:
        print(i, end=" ")

def vstaskaPoNomeru(a, index, el):
    b = a.copy()
    
    for i in range(len(b)-1, -1, -1):
        if i == index:
            b[i + 1:i + 1] = [el] 
            break 
    
    return b 

a = [2, 5, 3, 8, 9, 11]
printList(vstaskaPoNomeru(a, 3, 99))
#2 5 3 8 99 9 11