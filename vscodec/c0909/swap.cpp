#include <iostream>
using namespace std;

void swapRef(int& a, int& b) {
    int t = a; a = b; b = t;
}

int main() {
    int x = 10, y = 20;
    swapRef(x, y);
    cout << x << ", " << y << endl; // 20, 10
    return 0;
}