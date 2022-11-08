package array;

public class _01Array {

    public static void main(String[] args) {
        /**
         * 静态初始化
         */
        char[] cha = {'a','b','d'};
        System.out.println(cha[0]);
        System.out.println(cha[1]);

        /**
         * 动态初始化
         */
        // 1.
        int[] numbers; // 声明数组
        numbers = new int[10]; // 创建一个长度为10的int类型数组赋值给numbers，int类型未赋值默认为0

        // 2.
        String[] strs = new String[10]; // 声明并赋值，String类型未赋值默认为null

        numbers[0] = 199; // 手动赋值
        numbers[3] = 99;
        numbers[5] = 19;

        strs[0] = "hello";
        strs[1] = "world";

        for(int number:numbers){
            System.out.println(number);
        }

        for(String str:strs){
            System.out.println(str);
        }
    }
}
