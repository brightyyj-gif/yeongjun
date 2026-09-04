#include <stdio.h>
#include <string.h>
//문자열복사
int main() {
    char str[] = "Hello";
    char dest[20];
    
    strcpy(dest, str);
    printf("북사된문자열: %s\n", dest);
    
    return 0;
}