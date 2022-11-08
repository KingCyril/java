package control;

public class _04ChengFaBiao {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }

        /**
         * 增强版for循环
         */
        int[] numbers = {10,20,30,40,50}; // 定义存储int类型的数组
        for(int number:numbers){
            System.out.println(number);
        }

        /**
         * break,continue,goto,java中没有goto，通过break和continue实现
         */
        // 求质数
        outer:for(int i = 101; i <= 150; i++){
             for (int j = 2; j <= i/2; j++){
                 if( i%j == 0){
                     continue outer;
                     // break outer;
                 }
             }
            System.out.print(i+"\t");
        }
    }
}
