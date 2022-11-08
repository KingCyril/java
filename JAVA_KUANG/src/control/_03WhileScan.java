package control;

import java.util.Scanner;

public class _03WhileScan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        int count = 0;

        System.out.println("请输入数字：");
        while(scanner.hasNextDouble()){
            sum += scanner.nextDouble();
            count++;
            System.out.println("当前输入的是第"+count+"位数字，总合为："+sum);
        }

        System.out.println("平均数为："+(sum/count));

        scanner.close();
    }
}
