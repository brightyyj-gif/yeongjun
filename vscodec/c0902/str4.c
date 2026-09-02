#include <stdio.h>
#include <string.h>
struct Student {
    char name[20];
    int age;
    int score;
};
// 함수 원형 선언
void printStudent(struct Student s);
// 구조체를 함수로 전달
int main() {
    struct Student s1 = {"홍길동",20,85};
    printStudent(s1);
    
    return 0;
}
void printStudent(struct Student s){
     printf("이름: %s\n", s.name);
    printf("나이: %d\n", s.age);
    printf("점수: %d\n", s.score);
}