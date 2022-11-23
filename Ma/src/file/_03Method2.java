package file;

import java.io.File;
import java.io.IOException;

public class _03Method2 {

    public static void main(String[] args) throws IOException {

        /**
         * createNewFile 创建新的文件
         */
        // createNewFile();
        /**
         * 创建新的文件夹
         */
        // mkdir();
        /**
         * 删除文件、空的文件夹
         * 不会走回收站
         */
        // delete();
        /**
         * 获取一个有权限访问的文件夹内的所有文件，包括隐藏文件，不包括多级后代文件
         */
        listFiles();
    }

    public static void listFiles(){
        // 返回null的情况：没访问文件夹权限时、空文件夹时、路径是文件时、路径不存在时
        File f1 = new File("/Users/shi/Documents/java/testFile");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    public static void delete(){
        File f1 = new File("/Users/shi/Documents/java/testFile/aaa");
        System.out.println(f1.delete());

        File f = new File("/Users/shi/Documents/java/testFile/aaa.txt");
        System.out.println(f.delete());
    }

    public static void mkdir(){
        // mkdir 创建单级文件夹
        File f = new File("/Users/shi/Documents/java/testFile/bbb");
        System.out.println(f.mkdir());
        // mkdirs 创建多级文件夹，也可创建单级
        File f1 = new File("/Users/shi/Documents/java/testFile/aaa/bbb/ccc");
        System.out.println(f1.mkdirs());
        File f2 = new File("/Users/shi/Documents/java/testFile/aaa/eee");
        System.out.println(f2.mkdirs());
    }

    public static void createNewFile() throws IOException {
        File f = new File("/Users/shi/Documents/java/testFile/aaa.txt");
        boolean flag = f.createNewFile();
        System.out.println(flag);
    }
}
