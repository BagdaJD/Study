#include <algorithm>
#include <iostream>
#include <ctime>
#include <iterator>
#include <numeric>
#include <vector>

using namespace std;
int main() {
    //Task2
    // srand(time(0));
    // vector<int> v(5);
    //
    // int N = -10, M = 10;
    //
    // generate(v.begin(), v.end(), [N, M]() {
    //     return rand() % (M - N + 1) - M;
    // });//заполнение элементами вектор v;
    //
    // copy(v.begin(), v.end(), ostream_iterator<int>(cout, " "));
    // cout << endl;
    //
    // int sum_ = 0;
    // for_each(v.begin(), v.end(), [&sum_](int x) {
    //     sum_ += x;
    // });
    //
    // double sred_arith = (double)sum_ / v.size();
    // cout << "Среднее арифметическое: " << sred_arith << endl;
    //
    // int abs_min = v[0]; //*v.begin()
    // for_each(v.begin(), v.end(), [&abs_min](int x) {
    //     if (abs(abs_min) >= abs(x)) abs_min = x;
    // });
    //
    // cout << "Минимальный по модулю элемент: " << abs_min << endl;
    //
    //
    // int countLess = count_if(v.begin(), v.end(), [sred_arith](int x) {
    //     return x < sred_arith;
    // });
    //
    // cout << "Кол-во элементов меньших сред.ариф: " << countLess << endl;
    // vector<int> new_v ;
    // remove_copy_if(v.begin(), v.end(), back_inserter(new_v), [sred_arith](int x) {
    //     return x < sred_arith;
    // });
    // cout << "---------- New vector ----------" << endl;
    // copy(new_v.begin(), new_v.end(), ostream_iterator<int>(cout, " "));
    //
    // cout << endl;
    // cout << "---------- New vector with x * x ----------" << endl;
    // transform(new_v.begin(), new_v.end(), new_v.begin(),[](int x){return x * x;});
    // copy(new_v.begin(), new_v.end(), ostream_iterator<int>(cout, " "));
    //Task3
    srand(time(0));
    int M = 5, N = 3;//M - rows, N - cols
    vector<vector<int>> matr(M, vector<int> (N));

    for (int i = 0; i < M; i++) {
        generate(matr[i].begin(), matr[i].end(), [N, M]() {
            return rand() % (M - N + 1) - M;
        });
        // copy(matr[i].begin(), matr[i].end(), ostream_iterator<int>(cout, " "));
        // cout << endl;
    }
    for_each(matr.begin(), matr.end(), [](vector<int> v) {
       copy(v.begin(), v.end(), ostream_iterator<int>(cout, " "));
        cout << endl;
    });

    int min_sum_row = 10000;
    int ind = -1;
    int ind_curr = -1;
    for_each(matr.begin(), matr.end(), [&min_sum_row, &ind, &ind_curr](vector<int> v) {
        int sum = accumulate(v.begin(), v.end(), 0);
        ind_curr++;
        if (sum <= min_sum_row) {
            min_sum_row = sum;
            ind = ind_curr;
        }
    });
    cout << endl;
    cout << "Номер строки с минимальной сумме в строке: " << ind;

    vector<vector<int>> new_matr = {
        {1, 2, 4},
        {0, 0, 0},
           {1, 0, 1}
    };
    new_matr.erase(    remove_if(new_matr.begin(), new_matr.end(), [](const vector<int>& v) {
        return all_of(v.begin(), v.end(), [](int elem) { return elem == 0; });
    }), new_matr.end());

    cout << "---------------" << endl;
    cout << endl;

    for_each(new_matr.begin(), new_matr.end(), [](vector<int> v) {
        copy(v.begin(), v.end(), ostream_iterator<int>(cout, " "));
        cout << endl;
    });

    cout << "Matr with min" << endl;
    for_each(matr.begin(), matr.end(), [](vector<int>& v) { // <- Передаем по ССЫЛКЕ (&)
        // Передаем v.begin() третьим аргументом и не забываем точку с запятой
        transform(v.begin(), v.end(), v.begin(), [v](int x) {
            int min = v[0];
            for (int n : v) if (abs(n) <= abs(min)) min = n;
                return min;
        });
    });

    for_each(matr.begin(),matr.end(), [](vector<int> v) {
        copy(v.begin(), v.end(), ostream_iterator<int>(cout, " "));
        cout << endl;
    });
    int n = 3;
    vector<vector<int>> m1 = {
        {1, 1, 1},
        {2, 2, 2},
        {3, 3, 3}
    };
    vector<vector<int>> m2 = {
        {4, 4, 4},
        {5, 5, 5},
        {6, 6, 6}
    };
    cout << "----------------" << endl;
    vector<vector<int>> m3;
    transform(m1.begin(), m1.end(), back_inserter(m3), [&m2](const vector<int>& row) {
            vector<int> v;
            for (int i = 0; i < m2[0].size(); i++) {
                int sum = 0;
                // Цикл для подсчета скалярного произведения (строка на столбец)
                for (int k = 0; k < row.size(); k++) {
                    sum += row[k] * m2[k][i];
                }
                // ОБРАТИТЕ ВНИМАНИЕ: push_back строго ПОСЛЕ окончания цикла по k
                v.push_back(sum);
            }
            return v;
        });

    for_each(m3.begin(),m3.end(), [](vector<int> v) {
        copy(v.begin(), v.end(), ostream_iterator<int>(cout, " "));
        cout << endl;
    });
    return 0;
}