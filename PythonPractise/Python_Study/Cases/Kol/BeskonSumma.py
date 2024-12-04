x = float(input())

i = 0 
y = 1
sum_ = y 

while abs(y) >= 1e-5:
    i += 1 
    y = y * x / i 
    sum_ += y 

print(sum_)

i = 1 
y = 1 
sum_ = y

while y >= 1e-5:
    i += 1 
    y = 1 / i / i 
    sum_ += y 

print(sum_)    