#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> scores; // int score[50] -vector는 필요시 정수추가
    int n, sum = 0;
    cout << "개수: ";
    cin >> n;
    for (int i = 0; i < n; i++) {
        int s;
        cin >> s;
        scores.push_back(s); // vector의 맨 뒤에 데이터를 추가
        sum += s;
    }
    cout << "합: " << sum << ", 평균: " << (double)sum / n << endl;
    return 0;

}