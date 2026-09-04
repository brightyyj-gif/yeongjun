#include <stdio.h>
#include <string.h>
//문자열연결
int main() {
    char str1[20] = "Hello";
    char str2[]= " world";
    
    strcat(str1, str2);
    printf("연결된 문자열: %s\n", str1);
    
    return 0;
}