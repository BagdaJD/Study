def k(n):
    if n < 20:
        k = n // 2
    else:
        k = n - 10
    return k

n = int(input('n - четное количество пирожков --> '))

kol = k(n)
print(kol)
