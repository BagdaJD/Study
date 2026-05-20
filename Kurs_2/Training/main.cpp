#include <algorithm>
#include <iostream>
#include <iterator>
#include <vector>
#include<list>
    //min_element9)
    //max_element()
    //iter_swap()
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

    // begin(): Возвращает итератор на первый элемент. Позволяет как читать, так и изменять данные.
    // cbegin() (от слова const): Возвращает константный итератор на первый элемент. Данные можно только читать, менять нельзя. Это полезно для безопасности кода.
    // rbegin() (от слова reverse): Возвращает «обратный» итератор. Он указывает на последний элемент, и при его инкременте (++it) вы будете двигаться к началу.
    // Группа конца (End)
    // end(): Указывает на позицию ЗА последним элементом. Это «флаг остановки», обращаться к нему напрямую нельзя.
    // cend(): Константный итератор на позицию ЗА последним элементом.
    // rend(): Обратный итератор, указывающий на позицию ПЕРЕД первым элементом.

using namespace std;
int main() {
    //Task2
    //vector<int> v;
    //vector<int> v = {1, 2, 3, ...}
    // auto first_min = min_element(v.begin(), v.end());
    // auto last_max = max_element(v.begin(), v.end());
    // cout << "--------------------" << endl;
    // iter_swap(first_min, last_max);
    // for (auto i = v.begin(); i < v.end(); i++) {
    //     cout << *i << endl;
    // }
    // for (int i = 0; i < 10; i++) v.push_back(i);
    // for (auto i = v.begin(); i < v.end(); i++) {
    //     cout << *i << endl;
    // }
    // auto first_min = min_element(v.begin(), v.end());
    // auto last_max = max_element(v.begin(), v.end());
    // cout << "--------------------" << endl;
    // iter_swap(first_min, last_max);
    // for (auto i = v.begin(); i < v.end(); i++) {
    //     cout << *i << endl;
    // }
    // list<char> listofChars = {
    //     'a', 'b', 'c', '*'
    // };
    //
    // auto firstSign = find(listofChars.begin(), listofChars.end(), '*');
    // //если не находит нужный символ возращает .end()
    // if (firstSign != listofChars.end()) {
    //     listofChars.insert(firstSign, '(');
    //     //не передаем снова просто firstSign из-за того, что он до сих пор указывает на '*"
    //     listofChars.insert(next(firstSign), ')');
    // }
    //
    //
    // for (char c : listofChars) cout << c << endl;
    //Task 3
    vector<int> v;
    //copy(istream_iterator<int>(cin), istream_iterator<int>(), back_inserter(v));

    for (int i = 0; i < 10; i++) {
        v.push_back(i);
    }
    copy(begin(v),end(v), ostream_iterator<int>(cout, " "));

    return 0;

}