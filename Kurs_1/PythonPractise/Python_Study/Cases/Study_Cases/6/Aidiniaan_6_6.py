def printList(a):
    for i in range(len(a)):
        print(a[i], end=' ')

def poisk(s):
    i = 0
    
    while i < len(s) and s[i] not in 'eyuioa':
        i += 1 
        
    return i < len(s)

def poiskB(s):
    i = 0
    
    s += ['a']
    while s[i] not in 'eyuioa':
        i += 1

    return i < len(s) - 1

abc = [['a', 'c', 'v'], ['b', 'h', 'l', 'u', 'k'],
       ['k', 'l', 'n', 'b', 'a'], ['r', 't', 'g', 'k']]

for s in abc:
    printList(s)
    print()
    if poisk(s) and poiskB(s):
        print('В последовательности есть гласные буквы')
    else:
        print('В последовательности нет гласных букв')
    print('=' * 20)