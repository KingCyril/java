package first;

import java.util.ArrayList;

public class _01Math {
    public static void main(String[] args) {
        boolean flag = isPrimary(997);
        System.out.println(flag);

        isSelf();
    }

    /**
     * 质数
     */
    public static boolean isPrimary(int num){
        int count = 0;
        for(int i = 2; i < Math.sqrt(num); i++){
            count++;
            if(num % i == 0){
                return true;
            }
        }
        System.out.println(count); // 只用循环30次就可以判断997为质数
        return false;
    }

    /**
     * 水仙花数
     */
    public static void isSelf(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 100; i < 999; i++){
            int g = i % 10;
            int s = i / 10 % 10;
            int b = i / 100 % 10;
            if(Math.pow(g,3) + Math.pow(s,3) + Math.pow(b,3) == i){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
