#include <stdio.h>

int main() {
    int i;
    
    for (i = 1; i <= 10; i++) {
        if (i == 5) {
            break;  // 5에서 반복 종료
        }
        printf("%d ", i);
    }
    printf("\n");
    
    return 0;
}