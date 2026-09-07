#include <iostream>
#include <string>
using namespace std;

int main() {
    string a = "Hello", b = " c++";
    string c = a + b;
    cout << c << " (길이: " << c.length() << ")" << endl;
    return 0;
}