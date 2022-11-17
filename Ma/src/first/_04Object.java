package first;

import java.util.Objects;

public class _04Object {

    public static void main(String[] args) {

        /**
         * toString
         * equals
         * clone
         */

        Object obj = new Object();
        String s1 = obj.toString();
        System.out.println(s1); // java.lang.Object@372f7a8d

        Object obj1 = new Object();
        System.out.println(obj1.equals(obj)); // false // 比较对象的地址值


        /**
         * Objects：对象工具类
         */
        boolean flag = Objects.equals(s1,obj1);
        System.out.println(flag);

        // 判断对象是否是null
        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.nonNull(s1));
    }

    /**
     * 重写clone
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
