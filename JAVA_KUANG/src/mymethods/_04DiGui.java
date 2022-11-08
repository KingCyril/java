package mymethods;

public class _04DiGui {

    public static void main(String[] args) {
        int num = fn(5);
        System.out.println(num);
    }

    /**
     * 递归 阶乘 能不用就不用 计算量大会产生栈溢出
     */
    public static int fn(int a){
        if(a == 1){
            return 1;
        }else{
            return a * fn(a - 1);
        }
    }
}
