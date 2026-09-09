#include <iostream>
#include <string>
using namespace std;

class Product {
    public:
    string name;
    int price;

    Product(string n, int p) : name(n), price(p) {}

    void show() {
        cout << name << " : " << price << "원" << endl;
    }
};

int main() {
    Product p("노트북", 1200000);
    p.show();
    return 0;
    
}