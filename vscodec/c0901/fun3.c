#include <stdio.h>

// 매개변수가 없는 함수
int getNumber(){
    return 100;
}

int main(){
    int num = getNumber();
    printf("숫자 :%d\n", num);
    return 0;
}