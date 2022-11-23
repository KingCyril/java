package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节输出流
 */
public class _01FileOutputStream {

    public static void main(String[] args) throws IOException {

        // basic();
        // newLine();
        xuxie();
    }

    public static void xuxie() throws IOException {
        // true 打开续写，不会清空文件
        FileOutputStream fos = new FileOutputStream("testFile/ddd.txt",true);
        String s1 = "Hello World";
        byte[] arr1 = s1.getBytes();
        fos.write(arr1);
        fos.close();
    }

    public static void newLine() throws IOException{
        FileOutputStream fos = new FileOutputStream("testFile/ddd.txt");
        String s1 = "Hello";
        byte[] arr1 = s1.getBytes();
        fos.write(arr1);

        String s2 = "\r\n"; // \r \n \r\n 都可
        byte[] arr2 = s2.getBytes();
        fos.write(arr2);

        String s3 = "World";
        byte[] arr3 = s3.getBytes();
        fos.write(arr3);

        fos.close();
    }

    public static void basic() throws IOException {
        /**
         * FileOutputStream(String｜File)
         * 如果文件不存在，会创建一个新的文件，进行写入，但是一定要保证父级路径是正确的
         * 如果文件已经存在，则会清空文件，再写入
         */
        FileOutputStream fos = new FileOutputStream("testFile/ddd.txt");
        /**
         * 参数是整数，实际写入的是ASCII上对应的字符
         * 写数据有三种方式
         */
        // 1、void write(int 78) 一次写一个字节数据
        fos.write(97);
        // 2、void write(byte[] a) 一次写一个字节数组数据
        byte[] arr = {97,98,99,100,101,102};
        fos.write(arr);
        // 3、void write(byte[] a, int off, int len) 一次写一个字节数组的部分数据
        fos.write(arr,2,2); // 数组 开始索引 长度
        // 释放资源
        fos.close();
    }
}
