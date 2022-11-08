package mymethods;

public class _03Param {

    public static void main(String[] args) {
        add(1,3.0,4.3,6.3,5.5);
    }

    /**
     * 可变参数，不定项参数，必须放最后,相当于javascript中的剩余参数rest
     */
    public static void add(int a, double... b){
        for(double c:b){
            System.out.println((int)c);
            a += c; // double类型自动转为int参与运算
        }
        System.out.println(a);
    }
}
