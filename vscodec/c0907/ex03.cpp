#include <iostream>

using namespace std;
// 위에와 같은 말
// std::cout << "점수: ";
// std::cin >> score;

int main() {
    int score;
    cout << "점수: ";
    cin >> score; // 사용자가 입력한 값을 score에 저장
    if(score >= 60)
    cout << "합격" << endl;
    else
    cout << "불합격" << endl;
    return 0;
}