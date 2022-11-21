package jihe.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class _03Middle {

    public static void main(String[] args) {

        /**
         * 中间方法会返回新的stream流，原来数据流只能使用一次
         * 修改stream流中的数据，不会影响原来的数据
         * filter 过滤
         * limit 获取前几个元素
         * skip 跳过前几个元素
         * distinct 去重（依赖hashcode和equals）
         * concat 合并为一个stream流
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三丰","赵敏","张无忌","周芷若","张强","张无忌","张无忌");

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"zs","ls","ww");

        /**
         * filter
         */
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.print(s));
        System.out.println();

        /**
         * limit
         */
        list.stream().limit(3).forEach(s -> System.out.print(s));
        System.out.println();

        /**
         * skip
         */
        list.stream().skip(3).forEach(s -> System.out.print(s));
        System.out.println();

        /**
         * distinct
         */
        list.stream().distinct().forEach(s -> System.out.print(s));
        System.out.println();

        /**
         * concat
         */
        Stream.concat(list.stream(),list1.stream()).distinct().forEach(s -> System.out.print(s));
        System.out.println();

        /**
         * map
         */
        list.stream().distinct().map(s -> s.substring(1)).forEach(s -> System.out.print(s));
    }

}
