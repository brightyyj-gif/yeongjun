#include <stdio.h>

int main() {
    int arr[10] = {85, 90, 75, 60, 95, 80, 70, 65, 88, 92};
    int sum = 0;
    float avg = 0;
    int count = 0;

    for (int i = 0; i < 10; i++) {
        sum += arr[i];
    }
    avg = (float)sum / 10;
    
    for (int i = 0; i < 10; i++) {
        if (arr[i] >= avg) {
            count++;
        }
    }
    printf("평균: %.2f\n", avg);
    printf("평균 이상인 값의 개수: %d\n", count);

    return 0;
}