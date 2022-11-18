package jihe.single;

import java.util.ArrayList;
import java.util.Scanner;

public class _02Test {

    public static void main(String[] args) {
        // 创建
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("zhangsan",23,"001");
        Student s2 = new Student("lisi",24,"002");
        Student s3 = new Student("wangwu",25,"003");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id = scanner.next();
        Student item = hasStudent(list,id);
        if(item != null){
            System.out.println(item.getName() + " " + item.getAge());
        }else{
            System.out.println("暂无此学生信息");
        }
    }

    private static Student hasStudent(ArrayList<Student> arr,String id){
        for(int i = 0; i < arr.size(); i++){
            Student item = arr.get(i);
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }

    private static void bianLi(ArrayList<Student> arr){
        for(int i = 0; i < arr.size(); i++){
            Student item = arr.get(i);
            System.out.println(item.getName() + " " + item.getAge());
        }
    }
}