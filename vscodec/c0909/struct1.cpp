#include <iostream>
#include <string>
using namespace std;

struct Student {
    string name;
    int age;
    int score;
};

int main() {
    Student s[2] = {{"홍길동", 20, 85}, {"김철수", 22, 92}};
    for(int i = 0; i < 2; i++)
    cout << s[i].name << ": " << s[i].score << endl;
    return 0;
}