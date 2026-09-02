#include <stdio.h>
#include <string.h>

struct Student {
    char name[20];
    int age;
    int score;
};

int main() {
    struct Student students[3] = {
        {"홍길동", 20, 85},
        {"김철수", 22, 95},
        {"이영희", 21, 75}
    
    };
    int i = 0;
    int maxScore = 0;
    int maxIndex = 0;
    for(i = 1; i < 3; i++) {
        if(students[i].score > maxScore) {
            maxScore = students[i].score;
            maxIndex = i;
        }
    }

    printf("최고 점수 학생: %s\n", students[maxIndex].name);
    printf("최고 점수: %d\n", students[maxIndex].score);

    return 0;
}