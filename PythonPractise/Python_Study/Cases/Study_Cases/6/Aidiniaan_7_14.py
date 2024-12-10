from random import randint


def menu():
    zag = "=" * 20 + " menu " + "=" * 20
    print(zag)
    print("| 1) Получение элементов векторов A и B случайным образом |") 
    print("| 2) Ввод элементов векторов A и B с клавиатуры |") 
    print("| 3) Вывод векторов A и B на печать |") 
    print("| 4) C = A − B (C — новый вектор) |")
    print("| 5) A = r!A (1 <= r <= 5) |")
    print("| 6) Скалярное произведение векторов: d = A · B |")
    print("| 9) Вывод меню |")
    print("| 0) Выход из программы |")

#Получение элементов одного вектора случайным образом
def randomVector(n, vector):
    vec = []
    for i in range(n):
        vec += [vector[randint(0, len(vector) - 1)]]

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
    vec1 = a.copy()
    vec2 = b.copy()
    max_len = max(len(vec1), len(vec2))

    vec3 = []
    for i in range(max_len):
        vec3 += [vec1[i] - vec2[i]]

    return vec3

#Умножение числа на вектор
def prodConstOnVector(vector, r):
    vec = vector.copy()
    for i in range(len(vec)):
        vec[i] *= r 
    
    return vec

#Скалярное произведение 
def scalProd(a, b):
    vec1 = a.copy()
    vec2 = b.copy()
    max_len = max(len(vec1), len(vec2))

    sum_ = 0
    for i in range(len(vec1)):
        sum_ += vec1[i] * vec2[i]

    return sum_

a = []
b = []
p = 9

print("Начните с заполнения списков (п.2)")
print()
while p != 0:
    if p == 1:
        f = int(input("Выберите вектор, из которого хотите получить элементы(A - 1; B - 2): "))
        n = int(input("Количесвто элементов: "))

        if f == 1:
            vec = randomVector(n, a)
        else:
            vec = randomVector(n, b)
        printVector(vec)
        print()
    elif p == 2:
        n = int(input("Количесвто элементов для вектора A: "))
        n1 = int(input("Количесвто элементов для вектора B: "))

        print("Ввод элементов для вектора A: ")
        a = inputVector(n)
        print()

        print("Ввод элементов для вектора B: ")
        b = inputVector(n1)

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
        f = int(input("Вычесть вектора A вектор B (введите - 1) или вычесть из вектора В вектор A (введите - 2): "))

        if f == 1:
            new_vec = raznVectors(a, b)
        else:
            new_vec = raznVectors(b, a)

        print("Разностью векторов будет вектор со следующими элементами: ")
        printVector(new_vec)

        print()
    elif p == 5:
        f = int(input("Выберете вектор(А - 1, B - 2): "))
        r = int(input("Введите число большее или равное 1 и меньшее или равное 5: "))

        if f == 1:
            a = prodConstOnVector(a, r)
        else:
            b = prodConstOnVector(b, r)

        print("Элементы вектора перемножены , печать - п.3")

        print()
    elif p == 6:
        d = scalProd(a, b)
        print("Скалярное произведение векторов A и B = %7.3f" %d)

        print()
    elif p == 9:
        menu()

    print("-" * 20)
    p = int(input("Выберите команду меню (9: Вывод меню): "))