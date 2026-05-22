#include "Array.h"

using namespace std;


ostream &operator <<(ostream &out, const Array &arr) {
    //не войдовска  функция, т.к чтобы мы могли после нашего вывода что-то выводить
    for (int i = 0; i < arr.n; i++) {
        out << arr.values[i] << " ";
    }
    return out;
}

void Array::reSize(size_t newSize) {
    if (newSize <= n) return;
    auto ptr = unique_ptr<int[ ]> (new int[newSize]{0});
    //более старая версия make_unique
    copy(values.get(), ptr.get(), n);
    values.reset(ptr.release());
    n = newSize;
}
