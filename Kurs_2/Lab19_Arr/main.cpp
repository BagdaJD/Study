#include "Array.h"


int main() {
    //unique_ptr - для создании одной копии объекта(без дубликаций)
    //только один владелец
    //его нельзя скопировать, только переместить(передать права владения)
   // unique_ptr<int> x_ptr(new int(42));
    //unique_ptr<int> y_ptr;
    //y_ptr = move(x_ptr);//y_ptr -> 42; x_ptr -> nullptr

    //unique_ptr<int[ ]>arr_ptr(new int[10]{1, 2, 3});

    //рекомендуемы способ
    //auto p1 = make_unique<int>(42);
    //auto arr_p = make_unique<int[ ]>(10);

    //y_ptr.reset(new int(5)); //удаляет старый объект и запимывает новый в скобках
    //x_ptr.reset(y_ptr.release()); //здесь y_ptr не удаляет старый объект а передает , а в x_ptr заберает себе 5
    //y_ptr - после будет nullptr, крч как move отработала последняя строка

    Array arr(5, 3);
    return 0;
}