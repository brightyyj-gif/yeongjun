#include <stdio.h>

int main() {
    FILE *fp = fopen("data.txt", "r");
    char buffer[100];

    if (fp == NULL) {
        printf("파일을 열 수 없습니다.\n");
        return 1;

    }

    while (fgets(buffer, 100, fp) != NULL) {
        printf("%s", buffer);
    }

    fclose(fp);
    // fopen() → 파일 열기
    // fgets() → 파일 읽기
    // printf() → 화면에 출력
    // fclose() → 파일 닫기
    return 0;
}