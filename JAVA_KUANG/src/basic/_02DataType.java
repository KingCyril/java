package basic;

public class _02DataType {
    public static void main(String[] args) {
        /**
         * 八大基本数据类型 primitive type
         */
        // 整数
        byte num1 = 120; // 占一个字节范围 -128 ～ 127
        short num2 = 200; // 占两个字节范围 -32768 ～ 32767
        int num3 = 1000; // 占四个字节范围 -2147483648 ～ 2147483647
        long num4 = 1300L; // 占八个字节范围 -9223372036854775808 ～ 9223372036854775807

        // 浮点数
        float num5 = 3.1415926F; // 占两个字节范围
        double num6 = 1000.23; // 占八个字节范围

        // 字符
        char name = '帅'; // 占两个字节范围

        // 布尔值
        boolean flag = true; // 占一个位

        /**
         * 类型转换 byte,short,char -> int -> long -> float -> double
         */
        // 强制类型转换 由高占用内存类型向低占用内存类型转换，可能存在内存溢出与精度问题
        int a = 128;
        byte b = (byte)a;
        System.out.println(b); // -128 // 内存溢出
        int c = 100;
        byte d = (byte)c;
        System.out.println(d);
        double e = 1234567888.43;
        int f = (int)e;
        System.out.println(f); // 1234567888 // 精度问题

        // 自动转换 由低占用内存类型到高占用内存类型
        int g = 3344455;
        double h = g;
        long i = g;
        System.out.println(h); // 3344455.0
        System.out.println(i); // 3344455

        // 字符也可以与数字相互转换，布尔值不可以
        char j = 'a';
        int k = j + 1;
        char l = (char)d;
        System.out.println(k); // 98   a的ASCII编码是97
        System.out.println(l); // d

        /**
         * 引用数据类型 reference type
         */
        // 类
        // 接口
        // 数组
    }
}
