package jihe.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _05Test {

    public static void main(String[] args) {
         // dataFilter();

        // stringFilter();

        selfFilter();
    }

    /**
     * 自定义类过滤
     */
    public static void selfFilter(){
        ArrayList<String> maleList = new ArrayList<>();
        Collections.addAll(maleList,"zs,23","ls,24","wwz,25","zl,26","sda,27","fdg,28");
        ArrayList<String> feMaleList = new ArrayList<>();
        Collections.addAll(feMaleList,"zsa,23","lsa,24","杨好,25","zls,26","杨不好,27","fdga,28");

        // 男演员只要名字为3个字的前两人
        maleList.stream().filter(s -> s.split(",")[0].length() == 3).limit(2).forEach(s -> System.out.print(s));
        System.out.println();

        // 女演员只要姓杨的，不要第一个
        feMaleList.stream().filter(s -> s.split(",")[0].startsWith("杨")).skip(1).forEach(s -> System.out.print(s));
        System.out.println();

        // 把过滤后的男演员姓名和女演姓名合并到一起
        List<String> collect = Stream.concat(maleList.stream(), feMaleList.stream()).map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split(",")[0];
            }
        }).collect(Collectors.toList());
        System.out.println(collect);

        // 将上一步演员信息封装成对象,并保存到list集合中
        List<Actor> actors = Stream.concat(maleList.stream(), feMaleList.stream()).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Actor(name, age);
            }
        }).collect(Collectors.toList());
        System.out.println(actors);
    }

    /**
     * 过滤
     */
    public static void stringFilter(){
        /**
         * 收集年龄大于24的放到Map集合中
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"zhangsan,23","lisi,25","wangwu,24");

        Map<String, Integer> collect = list.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24).collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split(",")[0];
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split(",")[1]);
            }
        }));
        System.out.println(collect);
    }

    /**
     * 数据过滤
     */
    public static void dataFilter(){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,4,6,7,9,11,34);

        Set<Integer> collect = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
