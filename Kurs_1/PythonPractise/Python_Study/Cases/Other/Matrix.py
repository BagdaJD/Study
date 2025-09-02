def multMat(a , b):
    if len(a[0]) != len(b):
        #Нельзя перемножать
        mat3 = -1
    else:
        mat1 = a
        mat2 = b
        mat3 = []
        for i in range(len(mat1)):
            row = []
            for j in range(len(mat2[0])):
                el = 0
                for k in range(len(mat2)):
                    el += mat1[i][k] * mat2[k][j]
                row.append(el)
            mat3.append(row)

    return mat3

def sumMat(a, b):
    if len(a) != len(b):
        #Нельзя складывать
        mat3 = -1
    else:
        mat1 = a
        mat2 = b
        mat3 = []
        for i in range(len(mat1)):
            row = []
            for j in range(len(mat1[0])):
                el = mat1[i][j] + mat2[i][j]
                row.append(el)
            mat3.append(row)

    return mat3

def subMat(a, b):
    if len(a) != len(b):
        #Нельзя вычитать
        mat3 = -1
    else:
        mat1 = a
        mat2 = b
        mat3 = []
        for i in range(len(mat1)):
            row = []
            for j in range(len(mat1[0])):
                el = mat1[i][j] - mat2[i][j]
                row.append(el)
            mat3.append(row)

    return mat3

def transMat(a):
    mat1 = a
    mat2 = []

    for i in range(len(mat1[0])):
        row = []
        for j in range(len(mat1)):
            el = mat1[j][i]
            row.append(el)
        mat2.append(row)

    return mat2
