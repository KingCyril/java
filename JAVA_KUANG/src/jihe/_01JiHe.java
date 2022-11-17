package jihe;

import java.util.ArrayList;

public class _01JiHe {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        /**
         * add()
         */
        Boolean flag = list.add("React");
        list.add("Vue");
        list.add("Angluar");
        list.add("JavaScript");
        list.add("JavaScript");
        System.out.println(flag);
        System.out.println(list);
        /**
         * boolean remove()
         */
        // boolean flag = list.remove("JavaScript");
        // list.remove(4);
        // System.out.println(flag);
        /**
         * String set()
         */
        String s = list.set(4,"Java");
        System.out.println(s); // 被替换的元素
        System.out.println(list);
        /**
         * String get()
         */
        String str = list.get(3);
        System.out.println(str);

        /**
         * size()
         */
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
