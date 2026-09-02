#include <stdio.h>

struct Student {
    char name[20];
    int age;
    int score;
};
int main() {
    struct Student students[3];
    int i;
    // 입력
    for(i = 0; i < 3; i++) {
        printf("%d번 학생 정보 입력:\n", i + 1);
    
        scanf("%s %d %d", students[i].name, &students[i].age, &students[i].score); // 배열을 입력시 &을 넣지 않는다.

    }

    // 출력
    for (i = 0; i < 3; i++){
        printf("%s: 나이 %d, 점수 %d\n",
        students[i].name, students[i].age, students[i].score);
    }

    return 0;
}
