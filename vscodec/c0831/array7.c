#include <stdio.h>
//최대값을 구하시오
int main (){
    int arr[5] = {10,5,20,8,15} ;
     int i,search, found = 0;

    printf("검색할 값: ");
    scanf("%d", &search);
    for (i = 1; i < 5; i++) {
      if(arr[i] == search){
        printf("%d는 %d번째 위치해 있습니다.\n",search , i);
        found = 1;
        break;
      }
    }
    if(!found){
         printf("%d를 찾을 수 없습니다.\n", search);
    }
    
    
    return 0;
}