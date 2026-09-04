#include <stdio.h>

//1 2 3 4 5 6 7 8 9 10

int main(){
    int dan, i;
    printf("단을 입력하세요: ");
    scanf("%d", &dan);
    for (i = 1; i <= 9; i++) {
       printf("%d x %d = %d\n", dan, i, dan * i);
    }
    printf("\n");
    


    return 0;
}