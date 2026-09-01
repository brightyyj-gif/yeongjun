#include <stdio.h>

// 배열을 매개변수로 전달
void printArray(int arr[], int size) {
    int i;
    for (i = 0; i < size; i++) {
        printf("%d", arr[i]);
    }
    printf("\n");
}
int main() {
    int arr[5] = {1, 2, 3, 4, 5};
    printArray(arr, 5);
    return 0;
}