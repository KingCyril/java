package basic;

/**
 * @author cyril
 * @version 1.0
 */
public class _03Temp {

    // 4、常量
    static final double PI = 3.14;

    // 3、类变量
    static double salary = 2500;

    // 2、实例变量 可以不赋初始值 系统会给默认值 0 0.0 布尔值默认false  非基本数据类型默认值都为null
    int num;
    String id;

    /**
     * main 方法
     * @param args
     */
    public static void main(String[] args) {
        // 1、局部变量
        int a = 10;
        System.out.println(a);

        // 实例化类对象
        _03Temp obj = new _03Temp();
        System.out.println(obj.num); // 0
        System.out.println(obj.id); // null

        System.out.println(salary);
        System.out.println(PI);
    }

    // 其他方法
    public void add(){

    }
}
