package jihe.single;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class _05Iterator {

    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();
        coll.add("Java");
        coll.add("JavaScript");
        coll.add("React");

        // iterator(coll);
        // strongfor(coll);
        lambda(coll);
    }

    /**
     * lambda表达式
     */
    public static void lambda(Collection<String> coll){
        /*
            coll.forEach(new Consumer<String>() {
                @Override
                public void accept(String s) {
                    System.out.println(s);
                }
            });
        */

        coll.forEach(s -> System.out.println(s));
    }

    /**
     * 增强for遍历
     */
    public static void strongfor(Collection<String> coll){
        for(String str: coll){
            System.out.println(str);
        }
    }

    /**
     * 迭代器遍历
     */
    public static void iterator(Collection<String> coll){
        Iterator<String> it = coll.iterator();
        /*
            Boolean flag = it.hasNext();
            it.next();
            Boolean flag1 = it.hasNext();
            it.next();
            Boolean flag2 = it.hasNext();
            it.next();
            Boolean flag3 = it.hasNext();
            System.out.println(flag);
            System.out.println(flag1);
            System.out.println(flag2);
            System.out.println(flag3);
        */
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
            // 不能用集合的方法删除或增加 只能用迭代器方法删除，添加暂无办法
            if("Java".equals(str)){
                // coll.remove("Java");
                it.remove();
            }
        }
        System.out.println(coll);
    }
}
