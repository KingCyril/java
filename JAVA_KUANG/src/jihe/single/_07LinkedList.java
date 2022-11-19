package jihe.single;

import java.util.ArrayList;
import java.util.LinkedList;

public class _07LinkedList {

    public static void main(String[] args) {
        /**
         * ArrayList 底层数据结构是数组
         * LinkedList 底层数据结构是双链表
         */
        LinkedList<String> list = new LinkedList<>();

        /**
         * 自定义泛型类
         */
        _08FanXing<Boolean> list1 = new _08FanXing<>();

        list1.add(true);
        list1.add(false);

        System.out.println(list1.toString());
        System.out.println(list1.get(1));

        /**
         * 泛型方法
         */
        _08FanXing.method("阿里巴巴", "腾讯", "字节跳动");
        _08FanXing.method(Math.PI);
    }

    /**
     * 使用泛型接口
     * 实现接口类的时候确定类型
     * A list = new A();
     */
    private class A implements Lis<String> {

        @Override
        public boolean add(String s) {
            return false;
        }
    }

    /**
     * 使用类的时候确定类型
     * B<String> list = new B<>();
     */
    private class B<T> implements Lis<T> {

        @Override
        public boolean add(T t) {
            return false;
        }
    }

    /**
     * 泛型的通配符
     * 泛型没有继承的概念
     * ? extends XXX 表示可以传递XXX类或者其所有的子类类型
     * ? super XXX 表示可以传递XXX类或者其所有的父类类型
     */
    private void me (ArrayList<? super _08FanXing> list){

    }
}

/**
 * 泛型接口
 */
interface Lis<E> {
    Object[] obj = new Object[10];

    boolean add(E e);
}