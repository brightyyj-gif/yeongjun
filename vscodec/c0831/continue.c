#include <stdio.h>

int main() {
    int i;
    
    for (i = 1; i <= 10; i++) {
        if (i % 2 == 0) {
            continue;  // 짝수는 건너뛰기
        }
        printf("%d ", i);
    }
    printf("\n");
    
    return 0;
}