#include <stdio.h>
#include <string.h>

struct Student {
    char name[20];
    int age;
    int score;
};

int main() {
    struct Student students[3] ={
        {"홍길동", 20, 85},
        {"김철수", 22, 95},
        {"이영희", 21, 75}
    };
    
    int sum = 0; 
    int avg = 0;
    int i = 0;
    for(i = 0; i < 3; i++) 
        sum += students[i].score;
        
    printf("평균: %2.f\n", (double)sum / 3);
    return 0;
}
