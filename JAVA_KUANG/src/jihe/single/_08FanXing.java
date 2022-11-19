package jihe.single;

import java.util.Arrays;

/**
 * 在编写一个类时候，如果不确定类型，那么这个类就可以被定义为泛型类
 * @param <T>
 */
public class _08FanXing<T> {

    Object[] obj = new Object[10];
    int size;

    public boolean add(T t){
        obj[size] = t;
        size++;
        return true;
    }

    public T get(int index){
        return (T)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }

    /**
     * 泛型方法，写在修饰符的后边
     */
    public static <E> void method(E ...data){
        String text = "";
        for (E datum : data) {
            text = text + datum + " ";
        }
        System.out.println(text);
    }
}
