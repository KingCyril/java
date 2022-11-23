package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _Copy01 {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        FileInputStream fileInputStream = new FileInputStream("testFile/back.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("testFile/aaa/copy.jpg");

        int num;
        while ((num = fileInputStream.read()) != -1){
            fileOutputStream.write(num);
        }

        // 先开的最后关闭
        fileOutputStream.close();
        fileInputStream.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}
