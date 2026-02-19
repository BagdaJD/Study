def discr(a, b, c):
    from math import sqrt

    dis = b * b - 4 * a * c
    if dis > 0:
        res = []
        x1 = (-b + sqrt(dis)) / (2 * a)
        x2 = (-b - sqrt(dis)) / (2 * a)
        res.append(x1)
        res.append(x2)
    elif dis == 0:
        x1 = -b / (2 * a)
        res = x1
    else:
        res = 0

    return res

