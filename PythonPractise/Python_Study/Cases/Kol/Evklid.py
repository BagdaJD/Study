a = int(input())
b = int(input())

while a != b: 
    if a > b: 
        a = a - b 
    else:
        b = b - a 

print(a)

while a * b != 0:
    if a > b:
        a = a % b 
    else:
        b = b % a 

print(a + b)

if a < b:
    r = b
    b = a
    a = r

while b != 0:
    r = a % b 
    a = b
    b = r

print(a)