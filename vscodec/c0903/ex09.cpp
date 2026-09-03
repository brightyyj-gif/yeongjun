#include <iostream>
#include <string>
using namespace std;

int main() {
    int score = 85;
    bool pass = score >= 60 && score <= 100;
    cout << "합격: " << pass << endl;
    return 0;
}