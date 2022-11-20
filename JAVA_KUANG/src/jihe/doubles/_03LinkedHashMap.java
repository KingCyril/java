package jihe.doubles;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class _03LinkedHashMap {

    public static void main(String[] args) {
        /**
         * 有序，无索引，不重复，都是由键决定的
         * 额外多了个双向链表记录顺序
         */
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();

        map.put("zhangsan",13);
        map.put("lisi",14);
        map.put("wangwu",17);
        map.put("zhangsan",18);

        System.out.println(map); // {zhangsan=18, lisi=14, wangwu=17} 有序
    }
}
