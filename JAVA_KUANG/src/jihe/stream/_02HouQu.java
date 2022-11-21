package jihe.stream;

import java.util.*;
import java.util.stream.Stream;

public class _02HouQu {

    public static void main(String[] args) {

        /**
         * 类型                       方法
         * 单列集合                    Collection默认方法
         * 双列集合                    转为单列集合
         * 数组                       Arrays工具类中的静态方法
         * 零散数据（同一类型）          Stream接口中的静态方法
         */

        /**
         * 单列集合 stream()
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"Hello","World");

        list.stream().forEach(s -> System.out.println(s));

        /**
         * 双列集合 stream()
         */
        HashMap<String,String> map = new HashMap<>();
        map.put("zs","zsa");
        map.put("ls","lsa");
        // 转为单列集合 keySet entrySet
        Set<Map.Entry<String, String>> entries = map.entrySet();
        entries.stream().forEach(s -> System.out.println(s.getKey() + "：" + s.getValue()));

        /**
         * 数组 Arrays.stream.
         */
        int[] arr = {1,3,5,7,9};
        Arrays.stream(arr).forEach(s -> System.out.println(s));

        /**
         * 零散数据 Stream.of
         * 同一类型
         */
        Stream.of("zs","ls","ww","zl").forEach(s -> System.out.println(s));
    }
}
