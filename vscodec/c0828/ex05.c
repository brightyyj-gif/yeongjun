#include <stdio.h>
int main(){
    int age;
    float height;

    printf("나이와 키를 입력하세요: ");
    scanf("%d %f", &age, &height);
    printf("나이: %d, 키: %.1f\n", age, height);
    return 0;
}
// &를 붙이는 이유
// scanf()는 입력받은 값을 변수에 저장해야 하기 때문에 변수의 주소