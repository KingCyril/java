package basic; // 定义包

import java.util.Date; // 导入包 import xxx/sss/.*   导入xxx/sss/下的所有类（包）

public class _01Hello {
    public static void main(String[] args) {
        // 这是单行注释

        /*
            多行注释
            注释多行
        */

        System.out.println(new Date());

        /**
         * 这是文档注释
         * @auth cyril
         */
        System.out.println("Hello World!!!!");
    }
}