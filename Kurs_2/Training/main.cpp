#include"Class.h"
#include<vector>
#include<iterator>
#include<algorithm>
#include <numeric>
//min_element(v.begin(), v.end())
    //max_element() возвращает указатель
    //iter_swap()
    //accumulate(v.begin(), v.end(), 0, [](){} - сумма с каким-то условием(возвр сумму)
    //find() - место вхождения элемента
    //next(it) - следующий итератор после того, что в скобках
    //find_end() - последнее место вхождения данного элемента
    //copy() - initialize from something
    //copy(istream_iterator<int>(cin), istream_iterator<int>(), back_inserter(v));
    //copy() - do something
    //copy() - initialize from exist
    //count - кол-во элементов
    //myList.sort();      // Сортировка обязательна для unique
    //myList.unique();    // Оставляет только по одному экземпляру подряд идущих элементов
    //copy(v.begin(), v.end(), ostream_iterator<int>(cout, " "));
    // begin(): Возвращает итератор на первый элемент. Позволяет как читать, так и изменять данные.
    // cbegin() (от слова const): Возвращает константный итератор на первый элемент. Данные можно только читать, менять нельзя. Это полезно для безопасности кода.
    // rbegin() (от слова reverse): Возвращает «обратный» итератор. Он указывает на последний элемент, и при его инкременте (++it) вы будете двигаться к началу.
    // Группа конца (End)
    // end(): Указывает на позицию ЗА последним элементом. Это «флаг остановки», обращаться к нему напрямую нельзя.
    // cend(): Константный итератор на позицию ЗА последним элементом.
    // rend(): Обратный итератор, указывающий на позицию ПЕРЕД первым элементом.
    //remove_copy_if(v.begin(), v.end(), back_inserter(result), [](int x) { return x < 0; }); в новый массив
    //v.erase(remove_if(v.begin(), v.end(), [](int x) { return x < 0; }), v.end()); поудаляет элементы в старом

int main() {
    //Task1
    // vector<int> v{1, 2, 3, 4, 5, 6, 9};
    //
    // copy(v.begin(), v.end(), ostream_iterator<int>(cout, " "));
    //
    // vector<int> v1;
    // copy_if(v.begin(), v.end(), back_inserter(v1), [](int x) {
    //     return x % 3 != 0;
    // });
    // cout << endl;
    // copy(v1.begin(), v1.end(), ostream_iterator<int>(cout, " "));

    //Task2
    //
    // vector<int> v{3, 4, 1, 5, 2, 1, -1};
    //
    // auto min = min_element(v.begin(), v.end());
    // cout << *min << endl;

    // DynamicString str1("Hello");
    // cout << str1 << endl;
    //
    // DynamicString str2("Yup");
    //
    // cin >> str2;
    // cout << str2 << endl;
    // vector<int> v{1, -10, 9, 5};
    // //copy(istream_iterator<int>(cin), istream_iterator<int>(), back_inserter(v));
    // //1 -10 9 5
    // copy(v.begin(), v.end(), ostream_iterator<int>(cout, " "));
    //
    // int sum = accumulate(v.begin(), v.end(), 0, [](int total, int x) {
    //     return (abs(x) < 10) ? (total + abs(x)) : total;
    // });
    // int sum1 = 0;
    // for_each(v.begin(), v.end(), [&sum1](int x) {
    //     if (abs(x) < 10) sum1 += x;
    // });
    //
    // cout << endl;
    // cout << sum << endl;
    // cout << sum1 << endl;
    vector<int> v{1, 3, 6, 9, 10};
    int min = *min_element(v.begin(), v.end());

    transform(v.begin(), v.end(), v.begin(), [min](int x) {
        return (x % 2 != 0) ? min : x;
    });
   
    copy(v.begin(), v.end(), ostream_iterator<int>(cout, " "));
    return 0;

}