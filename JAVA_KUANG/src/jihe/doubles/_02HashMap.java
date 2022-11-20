package jihe.doubles;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class _02HashMap {

    public static void main(String[] args) {
        /**
         * 无序，无索引，不重复，都是由键决定的
         */
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 26);
        Student s4 = new Student("zhangsan", 23);

        HashMap<Student, String> map = new HashMap<>();
        map.put(s1, "zhejiang");
        map.put(s2, "henan");
        map.put(s3, "henan");
        map.put(s4, "beijing");
        System.out.println(map);

        map.forEach((Student student, String s) -> {
            System.out.println(student + " --> " + s);
        });
    }
}
