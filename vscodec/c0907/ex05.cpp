#include <iostream>
using namespace std;

int main() {
    int choice = 0;
    while (choice != 3) {
        cout << "1.출력 2.계산 3.종료";
        cin >> choice;
        if(choice == 1) cout << "Hello" << endl;
        else if(choice == 2) cout << "10+20=" << 30 << endl;
        
    }
    return 0;
}