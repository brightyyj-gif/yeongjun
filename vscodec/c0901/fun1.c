#include <stdio.h>

// 함수 선언
int add(int a, int b); // add 함수가 정의가 될 것임을 알려주는 것

int main() {
    int result = add(10, 20); // 함수 호출
    printf("합: %d\n", result);
    return 0;
}

// 함수 정의 
int add(int a, int b){
    return a + b;
}