#include <stdio.h>

int global = 100; // 전역변수

void func1() {
    global = 200;
    printf("func1: %d\n", global);
}

void func2() {
    printf("func2: %d\n", global);
}
int main() {
    printf("main: %d\n",global);
    func1();
    func2();
    printf("main: %d\n", global);
    return 0;
}