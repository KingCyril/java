package yinyongfangfa;

import java.util.ArrayList;
import java.util.Collections;

public class _03ChengYuan extends Parent {

    public static void main(String[] args) {

        _03ChengYuan chengYuan = new _03ChengYuan();

        /**
         * 引用成员方法
         *      其他类（其他类名:方法名）
         *      本类（this:方法名） 引用处不能是静态方法
         *      父类（super:方法名） 引用处不能是静态方法
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","赵敏","张三丰","周芷若","张三");

        /**
         * 其他类
         */
        list.stream().filter(new StringOperation()::StringJudge).forEach(s -> System.out.println(s));

        /**
         * 本类
         */
         // list.stream().filter(this::StringJudge).forEach(s -> System.out.println(s)); // 静态方法中是没有this的，只能创建本类的对象
         list.stream().filter(chengYuan::StringJudge).forEach(s -> System.out.println(s));
         chengYuan.self(list);

        /**
         * 父类
         */
        chengYuan.parent(list);
    }

    private void parent(ArrayList<String> list){
        list.stream().filter(super::Judge).forEach(s -> System.out.println(s));
    }

    private void self(ArrayList<String> list){
        list.stream().filter(this::StringJudge).forEach(s -> System.out.println(s));
    }

    private boolean StringJudge(String s){
        return s.startsWith("张") && s.length() == 3;
    }
}
