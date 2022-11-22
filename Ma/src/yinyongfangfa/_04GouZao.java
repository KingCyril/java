package yinyongfangfa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _04GouZao {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌,23","赵敏,24","张三丰,25","周芷若,26","张三,22");

        List<Student> collect = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(collect);
    }
}
