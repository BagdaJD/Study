def math_okrug(a):
    n = abs(a)
    ia = abs(int(a))
    ost = n - ia
    res = 0
    
    z = a / n
    if ost < 0.5:
        if z == -1:
            res = ia * z
        else:
            res = ia
    else:
        if z == -1:
            res = (ia + 1) * z
        else:
            res = ia + 1
            
    res = int(res)
    return res

def math_div_mod(num, del_):
    n = abs(num)
    d = abs(del_)
    z = del_ / d
    
    n1 = math_okrug(z*(n / d))
    n2 = num - (n1 * del_)

    return (n1, n2)

def PyDivMod(n, d):
    n1 = n // d
    n2 = n % d

    return (n1, n2)

print(math_div_mod(10, 3))
print(math_div_mod(10, -3))
print(math_div_mod(-10, 3))
print(math_div_mod(-10, -3))

