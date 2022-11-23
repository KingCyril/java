package file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class _Test01 {

    public static void main(String[] args) throws IOException {

       // test1();

        System.out.println(test2(new File("/Users/shi/Documents/java/testFile")));
    }

    public static boolean test2(File file){
        /**
         * 找一个文件夹内是否有以txt类型的文件
         */
        File[] files = file.listFiles(s -> s.isFile() && s.getName().endsWith(".txt"));
        System.out.println(Arrays.toString(files));
        return files.length != 0;
    }

    public static void test1() throws IOException {
        /**
         * 在当前模块下的testFile文件夹中创建一个b.txt文件
         */
        File f = new File("testFile/b.txt");

        System.out.println(f.createNewFile());
    }
}
