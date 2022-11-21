package jihe.stream;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class _04End {

    public static void main(String[] args) {

        /**
         * 终结方法
         * forEach   遍历
         * count   统计
         * toArray   收集流中的数据，放到数组中
         * collect   收集流中的数据，放到集合中(List,Set,Map)
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三丰", "赵敏1", "张无忌", "周芷若");

        /**
         * count
         */
        long count = list.stream().filter(s -> s.startsWith("张")).count();
        System.out.println(count);

        /**
         * toArray
         */
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            // int value 表示流中数据的个数
            @Override
            public String[] apply(int value) {
                System.out.println(value);
                // 返回String类型长度为value的数组
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));

        /**
         * collect
         */
        // List中
        List<String> list1 = list.stream().filter(s -> s.startsWith("张")).collect(Collectors.toList());
        System.out.println(list1);
        // Set中 默认HashSet，自动去重
        Set<String> set = list.stream().filter(s -> s.startsWith("张")).collect(Collectors.toSet());
        System.out.println(set);
        // Map中  Collectors.toMap(键的生成规则，值的生成规则) 键不能重复
        Map<String, String> map = list.stream().collect(Collectors.toMap(new Function<String, String>() {
            // 流中数据的类型 键的类型
            @Override
            public String apply(String t) { // 流中每个数据
                return t.substring(0, 2);
            }
        }, new Function<String, String>() {

            @Override
            public String apply(String t) {
                return t.substring(2);
            }
        }));
        System.out.println(map);
    }
}
