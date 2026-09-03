#include <iostream>
#include <string>
using namespace std;

int main() {
    int age;
    string name;
    cout << "나이: ";
    cin >> age; // 공백을 만나면 입력끝
    cin.ignore(); // 버퍼지우기
    cout << "이름(공백 가능): ";
    getline(cin, name); // 한줄입력
    cout << name << "(" << age << "세)" << endl;
    return 0;
}