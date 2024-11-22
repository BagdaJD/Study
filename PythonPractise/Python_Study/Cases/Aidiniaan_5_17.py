'''
5.17. Описать функцию для нахождения суммы и произведения целых положительных чисел,
принадлежащих отрезку [a; b] и кратных числу m. m — целое поло-
жительное число, по умолчанию равное двум.
'''
def sumProd(a, b, m = 2):
    sum_ = 0
    prod = 1
    
    for i in range(a, b + 1):
        if i % m == 0:
            sum_ += i
            prod *= i

    return (sum_, prod)


a = int(input('a >>> '))
b = int(input('b >>> '))

sumProd_ = sumProd(a, b)
print(sumProd_)
