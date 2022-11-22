package yinyongfangfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class _06Test {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,new Student("zhangsan",12),new Student("lise",23),new Student("ww",34));

        /**
         * map 将Student类型的数据转为String类型的数据
         * 此时toArray创建的数组也是String类型，即可String[]::new
         */
        String[] strings = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(strings));
    }
}
