#include <stdio.h>
#include <string.h>
struct Student {
    char name[20];
    int age;
    int score;
};
// 구조체 포인트
int main() {
    struct Student s1 = {"홍길동",20,85};
    struct Student *p = &s1;

    
    printf("이름: %s\n", p -> name); //구조체 포인터를 이용해서 접근하려면 -> 를 사용
    printf("나이: %d\n", p->age);
    printf("점수: %d\n", p->score);
        // 또는
    printf("이름: %s\n", (*p).name);   // 간접 참조
    printf("나이: %d\n", (*p).age);
    printf("점수: %d\n", (*p).score);
    return 0;
}