n = int(input())

d = 2
while n != 1:
    if n % d == 0:
        print(d)
        n //= d 
    else:
        d = d + 1 