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

    char search[20];
    int i, found = 0;
    printf("검색할 이름: ");
    scanf("%s", search);

     for(i = 0; i < 3; i++) {
        if(strcmp(students[i].name, search) == 0) {
            printf("찾았습니다!\n");
            printf("나이: %d, 점수: %d\n",
            students[i].age, students[i].score);
            found = 1;
            break;
        }
    }

    if(!found) {
        printf("찾을 수 없습니다.\n");
    }

    return 0;
}