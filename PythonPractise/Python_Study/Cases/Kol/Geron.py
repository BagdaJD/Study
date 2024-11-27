a = float(input())

yp = (1 + a) / 2
y = (yp + a / yp) / 2 

while abs(y - yp) > 1e-6:
    yp = y
    y = (yp + a / yp) / 2

print(y)