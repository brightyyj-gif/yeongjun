#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> v = {3, 9, 1, 7, 5};
    int maxVal = v[0];
    for(int x : v) // v의 요소를 하나씩 꺼내서 x에 할당
        if(x > maxVal) maxVal = x;
    cout << "최댓값: " << maxVal << endl;
    return 0;
}