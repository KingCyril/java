package jihe.single;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class _10Hash {

    public static void main(String[] args) {

        Student student = new Student("zhangsan",13);
        Student student1 = new Student("zhangsan",13);
        Student student2 = new Student("lisi",13);
        Student student3 = new Student("wangwu",13);

        /**
         *  默认调用Object对象上的hashCode，以地址值计算，相同属性和属性值的不同对象得到的hash值不一样
         *  在Student类中重写hashCode和equals方法，以属性和属性值进行计算，运行得到相同的值（1951553894）
         */
        System.out.println(student.hashCode()); // 798154996
        System.out.println(student1.hashCode()); // 681842940


        /**
         * HashSet
         */
        HashSet<Student> stus = new HashSet();
        System.out.println(stus.add(student)); // true
        System.out.println(stus.add(student1)); // false
        System.out.println(stus.add(student2)); // true
        System.out.println(stus.add(student3)); // true
        System.out.println(stus); // 无序

        System.out.println("=======================");

        /**
         * LinkedHashSet，比HashSet多了个双向链表记录顺序！
         */
        LinkedHashSet<Student> stus1 = new LinkedHashSet<>();
        System.out.println(stus1.add(student)); // true
        System.out.println(stus1.add(student1)); // false
        System.out.println(stus1.add(student2)); // true
        System.out.println(stus1.add(student3)); // true
        System.out.println(stus1); // 有序
    }
}
