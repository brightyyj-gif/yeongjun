#include <stdio.h>

int main() {
    FILE *fp = fopen("numbers.txt", "w");
    int i;

    if (fp == NULL) {
        printf("파일을 열 수 없습니다.\n");
        return 1;

    }

    for(i = 1; i <= 10; i++) {
        fprintf(fp, "%d\n", i);
    }

    fclose(fp);
    printf("숫자 파일 저장 완료!\n");
    return 0;
}