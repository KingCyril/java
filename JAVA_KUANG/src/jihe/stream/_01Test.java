package jihe.stream;

import java.util.ArrayList;

public class _01Test {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("张三丰");
        list1.add("张无忌");
        list1.add("赵敏");
        list1.add("周芷若");
        list1.add("张三");

        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if(s.startsWith("张")){
                list2.add(s);
            }
        }
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if(s.length() == 3){
                list3.add(s);
            }
        }
        System.out.println(list3);

        for (String s : list3) {
            System.out.println(s);
        }

        System.out.println("==========================");
        // stream流实现
        list1.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }
}
