package oop;

public class App {

    public static void main(String[] args) {
        Student student = new Student("zs",18,'女',"code");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.getSex());
        // System.out.println(student.sex);
        student.ts(student);

        student.method();
        student.single();

        /**
         * 低类型转高类型(Student -》 Persion)直接赋值即可
         * 高类型转低类型(Persion -》 Student) 则需要 ((Student) persions)
         */
        Persion persions = new Student();
        /**
         * persions能用：
         *  1、Persion里定义的方法
         *  2、Student里重写Persion里的方法
         *  3、要想用Student中独有的方法，则需要((Student) persions).single()强转
         * student能用：
         *   1、Persion里或者Student里定义的方法都可以使用
         *   2、Student里重写Persion里的方法
         */
        persions.method();
        ((Student) persions).single();
        persions.log();
        Persion.log();
        student.log();
        Student.log();

        System.out.println(student instanceof Object);
        System.out.println(student instanceof Persion);
        System.out.println(student instanceof  Student);

        System.out.println(persions instanceof Object);
        System.out.println(persions instanceof Persion);
        System.out.println(persions instanceof  Student);

        Persion persion = new Persion();
        System.out.println(persion.hobby + persion.name);

        Son son = new Son();
        son.doSomething();
    }
}
