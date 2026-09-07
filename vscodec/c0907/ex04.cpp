#include <iostream>
using namespace std;

int main() {
    int choice;
    cout << "1.시작 2.종료 선택: ";
    cin >> choice;
    switch (choice)
    {
    case 1: cout << "프로그램 시작" << endl; break;
    case 2: cout << "종료" << endl; break;
    default: cout << "다시 선택" << endl;
    }
    return 0;
}