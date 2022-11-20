package jihe.doubles;

import java.util.*;
import java.util.function.BiConsumer;

public class _01Map {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("三吉彩花", "情人");
        String ret = map.put("刘亦菲", "情人");
        map.put("周放", "女朋友");
        String ret1 = map.put("刘亦菲", "老婆");
        System.out.println(ret); // null
        System.out.println(ret1); // 情人
        System.out.println(map); // {三吉彩花=情人, 刘亦菲=老婆, 周放=女朋友}

        String ret2 = map.remove("周放");
        String ret3 = map.remove("周放1");
        System.out.println(ret2); // 女朋友
        System.out.println(ret3); // null

        boolean flag = map.containsKey("刘亦菲");
        boolean flag1 = map.containsKey("周放");
        System.out.println(flag); // true
        System.out.println(flag1); // false

        boolean flag2 = map.containsValue("老婆");
        boolean flag3 = map.containsValue("老婆1");
        System.out.println(flag2); // true
        System.out.println(flag3); // false

        // map.clear();

        boolean flag4 = map.isEmpty();
        System.out.println(flag4); // false

        System.out.println(map.size()); // 2

        System.out.println("=====================");
        // keyfor(map);
        // entryfor(map);
        lambda(map);
    }

    /**
     * 第三种遍历方式：lambda
     */
    public static void lambda(Map<String, String> map) {
        map.forEach((String s, String s2) -> {
            System.out.println(s);
            System.out.println(s2);
        });
        // 匿名内部类
        /*
            map.forEach(new BiConsumer<String, String>() {
                @Override
                public void accept(String s, String s2) {
                    System.out.println(s);
                    System.out.println(s2);
                }
            });
        */
    }

    /**
     * 第二种遍历方式：通过键值对遍历
     */
    public static void entryfor(Map<String, String> map) {
        Set<Map.Entry<String, String>> obj = map.entrySet();
        for (Map.Entry<String, String> stringStringEntry : obj) {
            System.out.println(stringStringEntry);
            System.out.println(stringStringEntry.getKey());
            System.out.println(stringStringEntry.getValue());
        }
    }

    /**
     * 第一种遍历方式：根据key找value
     */
    public static void keyfor(Map<String, String> map) {
        // 把双列Map 转为单列Set
        Set<String> keys = map.keySet();
        /**
         * 此处还可以使用Set的其他两种遍历方式：增强for和lambda表达式进行遍历
         */
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(map.get(key));
        }
    }
}
