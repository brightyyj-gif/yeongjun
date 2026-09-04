#include <stdio.h>
#include <string.h>

int main() {

    char str[101];
    char ch;
    int count = 0;

    fgets(str, sizeof(str), stdin);
    scanf("%c", &ch);
    for (int i = 0; i < strlen(str); i++) {
        if (str[i] == ch) {
            count++;
        }
    }
    printf("%c가 나타나는 횟수: %d\n", ch, count);

    return 0;
}