#include <stdio.h>

int main() {
    int a, b ,c;
    int max;
    printf("세수를 입력 받으세요: ");
    scanf("%d %d %d", &a, &b ,&c);

    max = a;  //처음에는 a가장 큰수라 가정
    if(b > max){
        max = b;
    }

    if(c > max){
        max = c;
    }

    printf("가장 큰 수: %d\n", max);
    
    return 0;
}