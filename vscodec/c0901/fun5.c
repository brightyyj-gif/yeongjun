#include <stdio.h>


// 참조 전달 - 포인터
void changeValue(int *x) { 
    *x = 100; // 주소안의 내용을 100으로 변경
    printf("함수 내부: %d\n",x); // 주소값
}
int main() {
    int num = 10;
    changeValue(&num);
    printf("함수 호출후: %d\n", num); // 100
    return 0;
}