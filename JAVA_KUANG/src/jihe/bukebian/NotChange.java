package jihe.bukebian;

import java.util.*;

public class NotChange {

    public static void main(String[] args) {

        /**
         * List不可变集合
         * 一旦创建不能添加，不能删除，不能修改，只能读取，遍历
         */
        List<String> list = List.of("Hello", "world");

        System.out.println(list.get(1));

        for (String ite : list) {
            System.out.println(ite);
        }

        /**
         * Set不可变集合，参数不可重复
         */
        Set<String> set = Set.of("Hello","World");
        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String ite = iterator.next();
            System.out.println(ite);
        }

        /**
         * Map不可变集合，键不可重复，最多可以传入10个键值对
         * 没有使用可变参数，因为参数不能有两个可变参数Map.of(...keys,...values)
         */
        Map<String, String> map = Map.of("zs", "南京","ls","上海","ww","杭州");

        Set<String> keys = map.keySet(); // map.entrySet()
        for (String key : keys) {
            System.out.println(key + "：" + map.get(key));
        }

        /**
         * 如果想传入超过10对的参数
         * 使用 Map.ofEntries
         */
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("zs","zs");
        hashMap.put("zs1","zs");
        hashMap.put("zs2","zs");
        hashMap.put("zs3","zs");
        hashMap.put("ls","zs");
        hashMap.put("ls1","zs");
        hashMap.put("ls2","zs");
        hashMap.put("ls3","zs");
        hashMap.put("ww","zs");
        hashMap.put("ww1","zs");
        hashMap.put("ww2","zs");
        hashMap.put("ww3","zs");

        // 第一种方法
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        Map.Entry<String, String>[] ret = entries.toArray(new Map.Entry[0]);
        Map<String, String> stringStringMap1 = Map.ofEntries(ret);

        // map1.put("2","3");不可修改
        // 遍历
        for (Map.Entry<String, String> stringStringEntry : stringStringMap1.entrySet()) {
            System.out.println(stringStringEntry);
        }

        System.out.println("========================");

        // 第二种方法 JDK10
        Map<String, String> stringStringMap = Map.copyOf(hashMap);
        // stringStringMap.put("bbb","w");
        for (Map.Entry<String, String> stringStringEntry : stringStringMap.entrySet()) {
            System.out.println(stringStringEntry.getKey());
            System.out.println(stringStringEntry.getValue());
        }
    }
}
