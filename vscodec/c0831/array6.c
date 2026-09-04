#include <stdio.h>
//최대값을 구하시오
int main (){
    int arr[5] = {10,5,20,8,15} ;
     int i, max = arr[0];//max 배열 첫번째 요소 10
    
    
    for (i = 1; i < 5; i++) {
        if(arr[i] > max){
            max = arr[i];
        }
    }
     printf("최대값: %d\n", max);
    
    return 0;
}