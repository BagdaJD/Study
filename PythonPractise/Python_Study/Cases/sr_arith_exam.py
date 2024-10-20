x = int(input('Введите оценку: '))
sum_ = 0
k = 0

if x > 1 and x < 6:
    k += 1
    sum_ += x
    while x > 1 and x < 6:
        x = int(input('Введите оценку: '))
        k += 1
        sum_ += x
if k != 0:
    sr_arith = sum_ / k
    print('Среднее арифметическое оценок равняется: %f' %sr_arith)
else:
    print('Error')

