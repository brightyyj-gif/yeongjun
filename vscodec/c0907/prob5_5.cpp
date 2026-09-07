#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "정수를 입력하세요: ";
    cin >> num;
    if((num % 2) == 0)
    cout << "짝수" << endl;
    else
    cout << "홀수" << endl;
    return 0;
}