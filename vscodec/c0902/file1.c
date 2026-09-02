#include <stdio.h>

int main() {
    FILE *fp = fopen("data.txt", "w");

    if (fp == NULL) {
        printf("파일을 열 수 없습니다.\n");
        return 1;

    }
    fprintf(fp, "Hello File\n");
    fprintf(fp, "안녕하세요 파일입니다.\n");

    fclose(fp);
    printf("파일 쓰기 완료!\n");
    return 0;
}