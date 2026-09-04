#include <stdio.h>

int maxArray(int arr[], int size) {
    int i;
    int max = arr[0];
    for (i = 0; i < size; i++) {
        if (max < arr[i]) {
            max = arr[i];
        }
    }
    return max;
}

int minArray(int arr[], int size) {
    int i;
    int min = arr[0];
    for (i = 0; i < size; i++) {
        if (min > arr[i]) {
            min = arr[i];
        }
    }
    return min;
}

int main() {
    int arr[5] = {10, 5, 20, 8, 15};
    printf("최댓값: %d\n", maxArray(arr, 5));
    printf("최솟값: %d\n", minArray(arr, 5));
    return 0;
}