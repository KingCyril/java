package jihe.single;

import java.util.ArrayList;
import java.util.Collection;

public class _04Collection {

    public static void main(String[] args) {
        /**
         * Collection 是接口，不能直接new创建对象， 创建他的实现类对象
         */
        Collection<String> collection = new ArrayList<>();

        collection.add("zhangsan");
        collection.add("zhangsan"); // Set系列会返回false
        collection.add("lisi");

        collection.remove("zhangsan");

        boolean flag = collection.contains("zhangsan");
        System.out.println(flag);

        System.out.println(collection.isEmpty());
        System.out.println(collection.size());

        System.out.println(collection);

        collection.clear();
        System.out.println(collection);
    }
}
