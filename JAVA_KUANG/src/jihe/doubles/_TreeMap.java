package jihe.doubles;

import java.util.Comparator;
import java.util.StringJoiner;
import java.util.TreeMap;

public class _TreeMap {

    public static void main(String[] args) {
        /**
         * 可排序，无索引，不重复，都是由键决定的
         * 底层是红黑树结构
         * 默认是从小到大进行排序，也可以对键进行自定义排序
         *      1、实现Comparable接口
         *      2、创建集合时，传递Comparator对象指定规则
         */


        /**
         * 联系需求：
         * 键：学生对象；值：籍贯
         * 按照学生年龄升序排序，年龄一样按姓名字母进行排序，姓名年龄相同视为同一人
         */
        Student s1 = new Student("zhangsan",15);
        Student s2 = new Student("lisi",14);
        Student s3 = new Student("wangwu",17);
        Student s4 = new Student("zhaoliu",11);
        Student s5 = new Student("zhangsan",15);

        TreeMap<Student,String> map = new TreeMap<>();
        map.put(s1,"henan");
        map.put(s2,"henan");
        map.put(s3,"henan");
        map.put(s4,"henan");
        map.put(s5,"henan");

        System.out.println(map);

        test();
    }

    public static void test(){
        String str = "aababcabcdabcde";
        TreeMap<Character,Integer> map = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.containsKey(c)){
                int t = map.get(c) + 1;
                map.put(c,t);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);

        // 按照指定格式输出。（字符串拼接）
        // 1、StringBuilder
        StringBuilder ret = new StringBuilder();
        // 2、StringJoiner params 分割字符 开始字符 结束字符
        StringJoiner ret1 = new StringJoiner("|","---","---");
        map.forEach((Character key,Integer value) -> {
            ret.append(key + "(" + value + ")");
            ret1.add(key + "(" + value + ")");
        });
        System.out.println(ret);
        System.out.println(ret1);
    }
}
