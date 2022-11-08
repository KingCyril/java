package control;

import java.util.Scanner;

public class _02Scan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 0;
        double b = 0.0;
        System.out.println("请输入整数：");

        if(scanner.hasNextInt()){
            a = scanner.nextInt();
            System.out.println("你输入的整数是："+a);
        }else{
            System.out.println("请输入整数！！");
        }

        System.out.println("请输入小数：");
        if(scanner.hasNextDouble()){
            b = scanner.nextDouble();
            System.out.println("你输入的小数是："+b);
        }else{
            System.out.println("请输入小数！！");
        }

        scanner.close();
    }
}
