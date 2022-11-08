package array;

import java.util.Arrays;

public class _04MaoPao {

    public static void main(String[] args) {
        int[] arr = {1,0,4,2,5,6,3,0,1,14,9,7,8};

        /**
         * 冒泡排序
         */
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++){
          for (int j = 0 ; j < arr.length - 1 - i; j++){
              if(arr[j] < arr[j + 1]){
                  temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
              }
          }
        }

        System.out.println(Arrays.toString(arr));
    }
}
