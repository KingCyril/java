package mymethods;

public class _02ChongZai {

    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
        double num = add(10,20);
        System.out.println(num);
    }

    /**
     * 方法重载
     * 要求：
     *      必须：方法名相同，参数（个数|| 类型 || 参数顺序）不相同
     *      方法返回值可以相同也可以不相同，仅仅只有方法返回值不同，不足以构成方法的重载
     */
    public static double add(int a, int b){
        return a;
    }

    public static double add(double a, double b){
        return a;
    }

    /*
         public static double add(int a, int b){
            return a;
         }
    */
}
