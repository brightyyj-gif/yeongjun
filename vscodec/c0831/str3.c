#include <stdio.h>
#include <string.h>

int main() {
    char name[20]; //name[0] ~ name[18]  name[19] = \0 맨끝에 들어감
    
    printf("이름을 입력하세요: ");
    fgets(name, 20, stdin);//gets(저장할_배열, 최대크기, 입력스트림);
    //홍길동 + 엔터    홍길동\n\0

    name[strlen(name)-1] = '\0'; //문자열 마지막에 있는 \n -> \0바꿔라
    printf("입력한 이름: %s\n", name);
    return 0;
}