from random import randint 

def menu():
    zag = "=" * 20 + " menu " + "=" * 20
    print(zag)
    print("| 1) Получение элементов векторов A и B случайным образом |") 
    print("| 2) Ввод элементов векторов A и B с клавиатуры |") 
    print("| 3) Вывод векторов A и B на печать |") 
    print("| 4) C = A − B (C — новый вектор) |") 
    print("| 5) B = r(B − A) (r — любое целое число) |") 
    print("| 6) A = r!A (1 6 r 6 5) |") 
    print("| 7) Скалярное произведение векторов: d = A · B|") 
    print("| 0) Выход из программы |") 

#Получение элементов одного вектора случайным образом
def getElements(vector):
    return vector[randint(0, len(vector) - 1)]

#Ввод элементов с клавиатуры
def inputNum():
    return float(input("Введите целочисленное число"))

#Вывод элементов вектора
def printVector(vector):
    for i in range(len(vector)):
        print(vector[i], end=" ")

def urovnVectors(a, b):
    n = len(a) - len(b)
    
    if n > 0:
        urVec = b.copy()
        for _ in range(n):
            urVec += [0]
    elif n < 0:
        urVec = a.copy()
        for _ in range(abs(n)):
            urVec += [0]
    
    return urVec

#Разность векторов
def raznVectors(a, b):
    vec = urovnVectors(a, b)
    
    
    


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
    
    d = 0 
    
    for i in range():