#include <stdio.h>
#include <string.h>

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
        printf("이름: ");
        scanf("%s", students[i].name); // 배열을 입력시 &을 넣지 않는다.
        printf("나이: ");
        scanf("%d", &students[i].age);
        printf("점수: ");
        scanf("%d", &students[i].score);

    }

    // 출력
    for (i = 0; i < 3; i++){
        printf("%s: 나이 %d, 점수 %d\n",
        students[i].name, students[i].age, students[i].score);
    }

    return 0;
}