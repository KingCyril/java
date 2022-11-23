package file;

import java.io.File;

public class _01Basic {

    public static void main(String[] args) {

        /**
         * 第一种
         */
        String str = "/Users/shi/Documents/a.txt";
        File f1 = new File(str);
        System.out.println(f1);

        /**
         * 第二种
         */
        String parent = "/Users/shi/Documents";
        String child = "a.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);

        /**
         * 第三种
         */
        File parent1 = new File("/Users/shi/Documents");
        String child1 = "a.txt";
        File f3 = new File(parent1,child1);
        System.out.println(f3);
    }
}
