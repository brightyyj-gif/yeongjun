#include <iostream>
using namespace std;

int main() {
    int n = 100;
    int* p = &n;
    cout << "n=" << n << ", *p=" << *p << endl;
    *p = 200;
    cout << "n=" << n << endl;
    return 0;
}

// &n n의 주소
// *p p가 가르키는 값