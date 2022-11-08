package array;

import java.util.Arrays;

public class _05XiShuArray {

    public static void main(String[] args) {
        // 定义原数组
        int[][] arrays = new int[11][11];
        arrays[1][3] = 1;
        arrays[4][5] = 2;

        // 打印原数组
        print(arrays);

        /**
         * 稀疏化数组
         */
        int count = 0;
        for(int[] arr: arrays){
            for (int ite:arr){
                if(ite != 0){
                    count++;
                }
            }
        }
        int[][] newArr = new int[count + 1][3];
        newArr[0][0] = arrays.length;
        newArr[0][1] = arrays[0].length;
        newArr[0][2] = count;
        int num = 1;
        for(int i = 1; i < arrays.length; i++){
            for(int j = 0; j < arrays[i].length; j++){
                if(arrays[i][j] != 0){
                    newArr[num][0] = i;
                    newArr[num][1] = j;
                    newArr[num][2] = arrays[i][j];
                    num++;
                }
            }
        }
        print(newArr);

        /**
         * 还原数组
         */
        int[][] oldArr = new int[newArr[0][0]][newArr[0][1]];
        for(int i = 1; i < newArr.length; i++){
            for(int j = 0; j < newArr[i].length; j++){
                oldArr[newArr[i][0]][newArr[i][1]] = newArr[i][2];
            }
        }
        print(oldArr);
    }

    /**
     * @param arrays 二维数组
     */
    public static void print(int[][] arrays){
        for(int[] arr: arrays){
            for (int ite:arr){
                System.out.print(ite + "\t");
            }
            System.out.println();
        }
    }
}