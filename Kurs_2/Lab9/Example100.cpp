//Пример 100. Проверить вектор целых чисел на симметричность относительно середины
#include <iostream>
#include <vector>
using namespace std;
int main() {
    vector<int> v;
    int n, a;
    cin >> n;
    for (int i = 0; i < n; ++i) {
        cin >> a;
        v.push_back(a);
    }
    bool b = true;
    if (v.size() > 0) {
        auto itb = v.begin();
        auto ite = v.end() - 1;
        while (b && itb < ite) {
            b = (*itb) == (*ite);
            itb++;
            ite--;
        }
    }
    cout << (b ? "yes" : "no");
    return 0;
}
