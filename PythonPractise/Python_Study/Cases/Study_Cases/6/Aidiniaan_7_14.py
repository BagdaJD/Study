from random import randint


def menu():
    zag = "=" * 20 + " menu " + "=" * 20
    print(zag)
    print("| 1) Получение элементов векторов A и B случайным образом |") 
    print("| 2) Ввод элементов векторов A и B с клавиатуры |") 
    print("| 3) Вывод векторов A и B на печать |") 
    print("| 4) C = A − B (C — новый вектор) |")
    print("| 5) B = r(B − A) (r — любое целое число); |")
    print("| 6) A = r!A (1 <= r <= 5) |")
    print("| 7) Скалярное произведение векторов: d = A · B |")
    print("| 9) Вывод меню |")
    print("| 0) Выход из программы |")

#Получение элементов одного вектора случайным образом
def randomVector(n):
    vec = []
    for _ in range(n):
        vec += [randint(-1000, 1000)]
    
    return vec

#Ввод элементов с клавиатуры
def inputVector(n):
    new_vec = []
    for i in range(n):
        new_vec += [int(input("[" + str(i) + "] = "))]

    return new_vec

#Вывод элементов вектора
def printVector(vector):
    for i in range(len(vector)):
        print(vector[i], end=" ")

#Разность векторов
def raznVectors(a, b):

    vec = []
    for i in range(len(a)):
        vec += [a[i] - b[i]]
    return vec

    vec1 = a.copy()
    vec2 = b.copy()

    vec3 = []
    for i in range(len(vec1)):
        vec3 += [vec1[i] - vec2[i]]

    return vec3

#Умножение числа на вектор
def prodConstOnVector(a, r):
    for i in range(len(a)):
        a[i] *= r 
    
    return a

#Скалярное произведение 
def scalProd(a, b):
    vec1 = a.copy()
    vec2 = b.copy()

    sum_ = 0
    for i in range(len(a)):
        sum_ += a[i] * b[i]

    return sum_

p = 9

print("Начните с заполнения списков (п.1, п.2)")
print()
while p != 0:
    if p == 1:
        f = int(input("Выберите вектор(A - 1, A - 2): "))
        n = int(input("Количесвто элементов: "))

        if f == 1:
            a = randomVector(n)
        else:
            b = randomVector(n)
        print("Элементы векторов получены, печать - п.3")
        
        print()
    elif p == 2:
        print("!!!Размеры векторов должны совпадать!!!")
        f = int(input("Какой вектор хотите заполнить(A - 1; B - 2): "))
        n = int(input("Количество вводимых элементов: "))

        if f == 1:
            print("Ввод элементов для вектора A: ")
            a = inputVector(n)
        else:
            print("Ввод элементов для вектора B: ")
            b = inputVector(n)
        print()

        print("Элементы векторов получены, печать - п.3")
    elif p == 3:
        print("Элементы вектора A:")
        printVector(a)
        print()
        print()
        print("Элементы вектора B:")
        printVector(b)

        print()
    elif p == 4:
        f = int(input("Вычесть из вектора A вектор B (введите - 1) или вычесть из вектора В вектор A (введите - 2): "))

        if f == 1:
            new_vec = raznVectors(a, b)
        else:
            new_vec = raznVectors(b, a)

        print("Разностью векторов будет вектор со следующими элементами: ")
        printVector(new_vec)

        print()
    elif p == 5:
        f = int(input("Выберете вектор(А - 1, B - 2): "))
        r = int(input("Введите любое число : "))
        if f == 1:
            a = prodConstOnVector(a, r)
        else:
            b = prodConstOnVector(b, r)

        print("Элементы вектора перемножены , печать - п.3")

        print()
    elif p == 6:
        f = int(input("Выберете вектор(А - 1, B - 2): "))
        r = int(input("Введите число r(1 <= r <= 5): "))
        
        if f == 1:
            for i in range(1, r + 1):
                a = prodConstOnVector(a, i)
        else:
            for i in range(1, r + 1):
                b = prodConstOnVector(b, i)

        print("Элементы вектора перемножены , печать - п.3")

        print()
        
    elif p == 7:
        d = scalProd(a, b)
        print("Скалярное произведение векторов A и B = %7.3f" %d)

        print()
    elif p == 9:
        menu()

    print("-" * 20)
    p = int(input("Выберите команду меню (9: Вывод меню): "))