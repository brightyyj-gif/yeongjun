#include <iostream>
#include <fstream>
using namespace std;

int main() {
    ofstream fout("score.txt");
    fout << "홍길동 85" << endl;
    fout << "김철수 92" << endl;
    fout.close();
    cout << "저장 완료" << endl;
    return 0;
}