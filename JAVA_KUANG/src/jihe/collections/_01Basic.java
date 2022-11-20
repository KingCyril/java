package jihe.collections;

import java.util.*;

public class _01Basic {

    public static void main(String[] args) {

        ArrayList<String> coll = new ArrayList<>();
        /**
         * 只能给Collection系列使用
         */
        Collections.addAll(coll,"Hello","World","!!!");
        System.out.println(coll);

        /**
         * 只能给List系列使用
         * 打乱集合
         */
        Collections.shuffle(coll);
        System.out.println(coll);
    }
}
