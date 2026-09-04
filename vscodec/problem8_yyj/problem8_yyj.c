#include <stdio.h>

int main() {
    int arr[8];
    
    for (int i = 0; i < 8; i++) {
        scanf("%d", &arr[i]);
    }

    printf("짝수: ");

    int evenCount = 0;

    for (int i = 0; i < 8; i++) {
        if (arr[i] % 2 == 0) {
            printf("%d ", arr[i]);
            evenCount++;
        }
    }

    if (evenCount == 0) {
        printf("없음");
    }
    printf("\n");
    printf("홀수: ");

    int oddCount = 0;

    for (int i = 0; i < 8; i++) {
        if (arr[i] % 2 != 0) {
            printf("%d ", arr[i]);
            oddCount++;
        }
    }

    if (oddCount == 0) {
        printf("없음");
    }
    printf("\n");

    return 0;
}