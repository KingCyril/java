package file;

import java.io.File;

public class _02Method1 {

    /**
     * 判断、获取相关的方法
     */
    public static void main(String[] args) {

        // panduan();
        // changdu();
        // getPath();
        other();
    }

    public static void other(){
        File f1 = new File("/Users/shi/Documents/java/testFile/file/aaa.txt");
        File f2 = new File("/Users/shi/Documents/java/testFile/file");
        // 获取文件名字
        System.out.println(f1.getName()); // aaa.txt
        System.out.println(f2.getName()); // file

        System.out.println(f1.lastModified()); // 1669168399790
        System.out.println(f2.lastModified()); // 1669168399790
    }

    public static void getPath(){
        /**
         * 获取绝对路径，
         */
        File f1 = new File("/Users/shi/Documents/java/testFile/file/aaa.txt");
        File f2 = new File("testFile/file/aaa.txt"); // 相对路径，默认去当前工程下找此文件
        System.out.println(f1.getAbsolutePath()); // /Users/shi/Documents/java/testFile/file/aaa.txt
        System.out.println(f2.getAbsolutePath()); // /Users/shi/Documents/java/testFile/file/aaa.txt

        /**
         * 获取定义文件时使用的路径
         */
        File f3 = new File("/Users/shi/Documents/java/testFile/file/aaa.txt");
        File f4 = new File("testFile/file/aaa.txt"); // 相对路径，默认去当前工程下找此文件
        System.out.println(f1.getPath()); // /Users/shi/Documents/java/testFile/file/aaa.txt
        System.out.println(f2.getPath()); // testFile/file/aaa.txt
    }

    public static void changdu(){
        File f1 = new File("/Users/shi/Documents/java/testFile/file/aaa.txt");
        System.out.println(f1.length()); // 16(字节)

        File f2 = new File("/Users/shi/Documents/java/testFile/file");
        System.out.println(f2.length()); // 不能准确获取文件夹的大小，如果要获取文件夹的大小，那么要将文件夹内部所有文件累加起来
    }

    public static void panduan(){
        // 判断文件夹
        File f1 = new File("/Users/shi/Documents/java/testFile/file");
        System.out.println(f1.isDirectory()); // true
        System.out.println(f1.isFile()); // false
        System.out.println(f1.exists()); // true

        // 判断文件
        File f2 = new File("/Users/shi/Documents/java/testFile/file/aaa.txt");
        System.out.println(f2.isDirectory()); // false
        System.out.println(f2.isFile()); // true
        System.out.println(f2.exists()); // true

        // 判断不存在的文件
        File f3 = new File("/Users/shi/Documents/java/testFile/file/bbb.txt");
        System.out.println(f3.isDirectory()); // false
        System.out.println(f3.isFile()); // false
        System.out.println(f3.exists()); // false
    }
}
