i = 1 
y = 1 
sum_ = y 

while y >= 1e-5:
    i += 1 
    y = 1 / i / i 
    sum_ += y 

print(sum_)