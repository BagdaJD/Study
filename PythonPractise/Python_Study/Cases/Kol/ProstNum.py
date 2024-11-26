n = int(input())

flag = True 
d = 2 

while flag and d * d <= n:
    falg = n % d != 0
    d += 1 

print(flag) 