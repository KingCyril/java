package control;

import java.util.Scanner;

public class _01Scan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入：");


        /*
            if(scanner.hasNext()){
                String str = scanner.next(); // 不能得到带有空格的字符串
                System.out.println("write in "+ str);
            }
         */

        if(scanner.hasNextLine()){
            String str = scanner.nextLine(); // 以enter键为结束字符
            System.out.println("write in "+ str);
            System.out.println(str.equals("Hello")); // 判断输入的str是否是（==）Hello
        }

        scanner.close();
    }
}
