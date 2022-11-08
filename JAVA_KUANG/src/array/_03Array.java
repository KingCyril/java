package array;

import java.util.Arrays;

public class _03Array {

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,2,4,6,7,2,5,1};
        System.out.println(arr); // [I@372f7a8d

        Arrays.sort(arr); // 排序
        System.out.println(Arrays.toString(arr)); // [1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6, 7]

        Arrays.fill(arr,1); // 拿1填充arr
        System.out.println(Arrays.toString(arr)); // [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
    }
}
