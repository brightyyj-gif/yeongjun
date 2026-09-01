#include <stdio.h>

int sumArray(int *arr, int size) {
    int i, sum = 0;
    for (i = 0; i < size; i++) {
        sum += arr[i];
    }
    return sum;
}

int main() {
    int arr[5] = {10, 20, 30, 40, 50};
    int total = sumArray(arr, 5);
    printf("합계: %d\n", total);
    return 0;
}