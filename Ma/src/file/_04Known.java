package file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class _04Known {

    public static void main(String[] args) {

        /**
         * listRoots 列出可用的文件系统根
         */
        // listRoots();
        /**
         * list 获取当前目录下所有内容，不是路径，只是文件名
         */
        list();

        /**
         * 返回的是路径
         * public File[] listFiles() 只掌握这个即可
         * public File[] listFiles(FileFilter filter)
         * public File[] listFiles(FilenameFilter filter)
         */
        // list1();
    }

    public static void list1(){
        File f = new File("/Users/shi/Documents/java/testFile");

        File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".txt");
            }
        });

        File[] files1 = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File path = new File(dir, name);
                return path.isFile() && path.getName().endsWith(".txt");
            }
        });

        System.out.println(Arrays.toString(files)); // [/Users/shi/Documents/java/testFile/ccc.txt, /Users/shi/Documents/java/testFile/aaa.txt]
        System.out.println(Arrays.toString(files1)); // [/Users/shi/Documents/java/testFile/ccc.txt, /Users/shi/Documents/java/testFile/aaa.txt]
    }

    public static void list(){
        File f = new File("/Users/shi/Documents/java/testFile");
        String[] list = f.list();
        System.out.println(Arrays.toString(list)); // [ccc.txt, .DS_Store, file, bbb, aaa, aaa.txt]

        // 要求：输出所有txt文件
        String[] list1 = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                // dir 父级路径 /Users/shi/Documents/java/testFile
                // name 每一个子文件名
                // System.out.println(dir);
                // System.out.println(name);
                File path = new File(dir,name);
                // System.out.println(path);
                return path.isFile() && path.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(list1)); // [ccc.txt, aaa.txt]
    }

    public static void listRoots(){
        File[] files = File.listRoots();
        System.out.println(Arrays.toString(files)); // [/]
    }
}
