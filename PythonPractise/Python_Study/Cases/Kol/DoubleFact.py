n = int(input())

fact = 1 
for i in range(n, 0, -2):
    fact *= i 

print(fact)