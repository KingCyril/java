package jihe.single;

import java.util.Comparator;
import java.util.TreeSet;

public class _11TreeSet {

    public static void main(String[] args) {

        /**
         * TreeSet中存的是int类型，默认升序排序；
         * 如果存的是String类型，则按照Ascll码表字符的数值升序排序
         * 如果存的是自定义类，则要自己实现排序规则
         *      1、自定义类中实现compareable接口方法
         *      2、在创建TreeSet时，传递比较器comparator指定规则
         */

        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(2);
        integers.add(23);
        integers.add(11);
        integers.add(12);
        integers.add(8);
        System.out.println(integers); // [2, 8, 11, 12, 23] 排了序

        Student stu1 = new Student("zhangsan",22);
        Student stu2 = new Student("lisi",13);
        Student stu3 = new Student("wangwu",17);
        Student stu4 = new Student("zhangsan",22);

        TreeSet<Student> stus = new TreeSet<>();
        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
        stus.add(stu4);
        System.out.println(stus);

        System.out.println("==============");
        /**
         * 第二种方法
         * o1 要添加的元素
         * o2 已经在红黑树中存在的元素
         * 返回值同第一个方法
         *
         * 注：Comparator是@FunctionalInterface（函数类型）的接口，因此可以使用lambda表达式简写
         */
        TreeSet<Student> suts1 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        suts1.add(stu1);
        suts1.add(stu2);
        suts1.add(stu3);
        suts1.add(stu4);
        System.out.println(suts1);
    }
}
