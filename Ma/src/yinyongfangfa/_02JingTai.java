package yinyongfangfa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class _02JingTai {

    public static void main(String[] args) {

        /**
         * 引用静态方法
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5","6");

        /**
         * 第一种方法
         */
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(s -> System.out.println(s));

        /**
         * 第二种方法
         */
        list.stream().map(s -> Integer.parseInt(s)).forEach(s -> System.out.println(s));

        /**
         * 第三种方法 自定义方法
         */
        list.stream().map(_02JingTai::toInt).forEach(s -> System.out.println(s));

        /**
         * 第四种方法 直接使用Integer类提供的parseInt方法
         * 类名::静态方法
         */
        list.stream().map(Integer::parseInt).forEach(s -> System.out.println(s));
    }

    public static int toInt(String str){
        return Integer.parseInt(str);
    }
}
