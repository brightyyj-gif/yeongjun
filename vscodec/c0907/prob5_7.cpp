#include <iostream>
using namespace std;

int main() {
    int menu;
    cout << "메뉴를 선택하세요.";
    cin >> menu;
    switch (menu)
    {

    case 1: cout << "프로그램 시작" << endl;
        /* code */
        break;
    case 2: cout << "종료" << endl;
        break;
    default:
        cout << "다시 선택" << endl;
        break;
    }
}