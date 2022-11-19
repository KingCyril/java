package first;

public class _02System {
    public static void main(String[] args) {
        /**
         * 0 正常停止
         * 非0 异常停止
         */
        // System.exit(0);

        long t = System.currentTimeMillis(); // 获取时间戳
        System.out.println(t);

        /**
         * 拷贝数组
         */
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr1 = new int[10];

        System.arraycopy(arr,0,arr1,0,8);

        for(int i:arr1){
            System.out.print(i + " ");
        }
    }
}