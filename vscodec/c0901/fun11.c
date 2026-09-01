#include <stdio.h>

int main() {
    int arr[5] = {1, 2, 3, 4, 5};
    int *p = arr;
    int i;

    // 배열 인덱스로 접근
    for (i = 0; i < 5; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    // 포인터로 접근
    for(i = 0; i < 5; i++){
        printf("%d ", *(p + i));
    }
    printf("\n");

    return 0;
}

// p + 0 -> arr[0]
// p + 1 -> arr[1]
// p + 2 -> arr[2]
// p + 3 -> arr[3]
// p + 4 -> arr[4]
// *(p+0) -> 1
// *(p+1) -> 2