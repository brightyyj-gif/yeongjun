#include <stdio.h>
#include <string.h>

struct Student {
    char name[20];
    int age;
    int score;
};

int main() {
    struct Student s1;

    strcpy(s1.name, "홍길동");
    s1.age = 20;
    s1.score = 85;

    printf("이름: %s\n", s1.name);
    printf("나이: %d\n", s1.age);
    printf("점수: %d\n", s1.score);

    return 0;
}