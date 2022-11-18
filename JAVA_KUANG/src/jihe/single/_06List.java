package jihe.single;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * List 除了Collection方法都有外 还有特有的方法
 */
public class _06List {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add(0,"JavaScript");
        list.add(1,"Java");
        list.add(2,"React");

        list.add(1,"Vue");
        System.out.println(list);

        String str = list.remove(0);
        System.out.println(str);
        System.out.println(list);

        String str1 = list.set(1,"JavaScript");
        System.out.println(str1);
        System.out.println(list);

        String str2 = list.get(1);
        System.out.println(str2);

        System.out.println("==========================");
        method(list);
        System.out.println("@@@ " + list);
    }

    /**
     * 列表迭代器（List系列独有的）
     */
    public static void method(List<String> list){
        ListIterator<String> it = list.listIterator();

        while (it.hasNext()){
            String str = it.next();
            if("React".equals(str)){
                // 列表迭代器除了删除，还可以添加
                it.add("Java");
            }
            System.out.println(str);
        }
        System.out.println(list);
    }
}
