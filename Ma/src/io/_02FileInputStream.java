package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 字节输入流
 */
public class _02FileInputStream {

    public static void main(String[] args) throws IOException {
        // basic();
        // forRead();
        readMore();
    }

    /**
     * 多个读取
     */
    public static void readMore() throws IOException {
        FileInputStream fos = new FileInputStream("testFile/ddd.txt");
        byte[] bytes = new byte[2];  // 一次读取两个字节
        int len1 = fos.read(bytes);
        System.out.println(len1); // 2 读取到的长度
        System.out.println(new String(bytes)); // ab

        int len2 = fos.read(bytes);
        System.out.println(len2); // 1 读取到的长度
        System.out.println(new String(bytes)); // cb   由于本次只读取到一个数据，所以只把a替换掉了，b继续保留
        // 因此我们不想要残留数据 这种写法重要
        System.out.println(new String(bytes, 0, len2)); // c

        int len3 = fos.read(bytes);
        System.out.println(len3); // -1 读取到的长度
        System.out.println(new String(bytes)); // cb 没有读取到数据，数据还是上一次残留下的

        fos.close();
    }

    /**
     * 循环读取
     */
    public static void forRead() throws IOException{
        FileInputStream fos = new FileInputStream("testFile/ddd.txt");
        int num;
        while ((num = fos.read()) != -1){
            System.out.print((char)num);
        }
        fos.close();
    }

    public static void basic() throws IOException {
        /**
         * 如果文件路径不对，则直接报错
         * 一次只读一个字节，返回的是ASCII上对应的数字，没有数据返回-1
         */
        FileInputStream fos = new FileInputStream("testFile/ddd.txt");
        int i1 = fos.read(); // 一次只能读取一个字符
        System.out.println((char)i1);

        int i2 = fos.read();
        System.out.println((char)i2);

        int i3 = fos.read();
        System.out.println((char)i3);

        int i4 = fos.read();
        System.out.println(i4); // 如果读不到了，会返回-1

        fos.close();
    }
}
