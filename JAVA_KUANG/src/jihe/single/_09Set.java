package jihe.single;

import java.util.HashSet;
import java.util.Set;

public class _09Set {

    public static void main(String[] args) {

        /**
         * Set系列集合：添加的元素是无序、不可重复、无索引
         *      HashSet:无序、不可重复、无索引
         *      LinkedHashSet:有序、不可重复、无索引
         *      TreeSet:可排序、不可重复、无索引
         */

        Set<String> set = new HashSet<>();

        boolean f1 = set.add("张三");
        boolean f2 = set.add("张三");
        boolean f3 = set.add("李四");

        System.out.println(f1 + " " + f2 + " " +f3); // true false true
        System.out.println(set);


        /**
         * Set 系列 没有索引，只可使用迭代器，增强for，Lambda表达式遍历
         */
    }
}
