package array;

public class _02MoreArray {

    public static void main(String[] args) {

        /**
         * 二维数组
         */
        int[][] arrays = {{1,2,3},{4,5}};

        for(int[] ite: arrays){
            for(int i :ite){
                System.out.println(i);
            }
        }

        /**
         * 定义一个三行四列的数组
         */
        int[][] arr = new int[3][4];
        arr[0][0] = 9;
        arr[1][1] = 8;
        arr[2][3] = 7;
        for(int[] ite: arr){
            for(int i :ite){
                System.out.println(i);
            }
        }

    }
}
