package mymethods;

public class _01Add {

    public static void main(String[] args) {
        int sum = add(3,3);
        System.out.println(sum);

        int max = new _01Add().max(10,10);
        System.out.println(max);
    }

    /**
     * 修饰符 返回值类型 方法名(参数){
     *     方法体
     *     return 返回值
     * }
     */
    public static int add(int a,int b){
        return a + b;
    }

    public int max(int a,int b){
        if(a>=b){
            return a;
        }else{
            return b;
        }
    }
}
