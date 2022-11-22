package yinyongfangfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _05other {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd");

        /**
         * 类名引用成员方法
         * 类名::成员方法
         * 成员参数什么类型，就只能使用什么类型的成员方法
         * 如果只有一个参数，则引用类成员的空参方法
         * 第二到n个参数，则需要引用对应的1到n-1个参数的方法
         */
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));


        /**
         * 引用数组的构造方法
         * 类型[]::new
         * 类型要与流（集合）的数据类型完全一致
         */
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,1,2,3,4,5,6);
        Integer[] integers = list1.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));
    }

}
