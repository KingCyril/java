package jihe.single;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String id;

    public Student() {
    }

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(id, student.id);
    }

    @Override
    public int compareTo(Student o) {
        /**
         * 不断调用此方法
         * this 当前对象
         * o 上一个元素
         *
         * 负数，表示当前要添加的元素是小的，存红黑树左边
         * 正数，表示当前要添加的元素是大的，存红黑树右边
         * 0，表示红黑树中已经存在该元素了，舍弃
         */
        return this.age - o.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }
}
