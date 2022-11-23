package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 大文件拷贝(一次读取多个字节--数组)
 */
public class _Copy02 {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        FileInputStream fileInputStream = new FileInputStream("testFile/back.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("testFile/aaa/copy.jpg");

        byte[] bytes = new byte[1024]; // 一般是1024byte的倍数

        int num; // 记录读取到多少数据
        while ((num = fileInputStream.read(bytes)) != -1){
            fileOutputStream.write(bytes,0,num); // 读到多少数据，写入多少，防止最后一次有残留数据
        }

        // 先开的最后关闭
        fileOutputStream.close();
        fileInputStream.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
        // 速度大大提升
    }
}
