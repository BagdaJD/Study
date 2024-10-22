def discr(a, b, c):
    from math import sqrt

    dis = b * b - 4 * a * c
    res = []
    if dis > 0:
        x1 = (-b + sqrt(dis)) / (2 * a)
        x2 = (-b - sqrt(dis)) / (2 * a)
        res.append(x1)
        res.append(x2)
    elif dis == 0:
        x1 = -b / (2 * a)
        res = x1
    else:
        res = 'Корней нет'
    return res

res = discr(-15, 14, 9)
print(res)

