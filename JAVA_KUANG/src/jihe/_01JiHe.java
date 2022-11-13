package jihe;

import java.util.ArrayList;

public class _01JiHe {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        /**
         * add()
         */
        list.add("React");
        list.add("Vue");
        list.add("Angluar");
        list.add("JavaScript");
        list.add("JavaScript");
        System.out.println(list);
        /**
         * remove()
         */
        // list.remove("JavaScript");
        // list.remove(4);
        /**
         * set()
         */
        list.set(4,"Java");
        System.out.println(list);
        /**
         * get()
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
