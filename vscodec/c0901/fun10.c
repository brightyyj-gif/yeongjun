#include <stdio.h>

int main() {
    int a = 10;
    int *p = &a;

    printf("변경 전: %d\n", a);
    *p = 20; // 포인터를 통해 값 변경
    printf("변경 후: %d\n", a);

    return 0;
}