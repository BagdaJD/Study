n = int(input())

d = 2
flag = True 

while flag and d * d <= n :
    flag = n % d != 0 
    d += 1 

print(flag)