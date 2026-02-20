#include"Array.h"
using namespace std;
int main() {
     Array A;
     Array B(10, 3);
     Array C(4);

     cout << A.size() << endl;
     cout << B.size() <<  endl;
     cout << C.size() << endl;

     //cin >> A;

     Array D(A);
     cout << (A == D) << endl;
     cout << A.operator==(B) << endl;
     D.vst(3, 89);
     cout << D << endl;
     D.del(3);
     cout << D << endl;
     D.reSize(25);
     cout << D;
    //
    //  cout << A + B << endl;
    //  cout << "D" << endl;
    //  try {
    //      //D = A + D; - не заработает, если не реализовать перегрузку =
    //     // cout << D << endl;
    //
    //      D += B;
    //      cout << D << endl;
    //  }catch (int e) {
    //      cout << "Error" << endl;
    //  }
    // cout << "lol" << endl;
    // cout << A[6] << endl;
    // C[3] = 23;
    //
    // cout << C[3] << endl;
    // cout << endl;
    //
    // B.reSize(25);
    // cout << B << endl;
    // B[5] = 1000;
    // B[6] = 1001;
    // B[24] = 21213;
    // cout << endl;
    // cout << B;
    return 0;
}
