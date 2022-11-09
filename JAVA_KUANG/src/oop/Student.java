package oop;

public class Student extends Persion {

    public String hobby;

    public Student (){
        System.out.println("Is Ok?");
    }
    public Student(String name,int age,char sex,String hobby){
        super(name,age,sex);
        // this();
        this.hobby = hobby;
    }

    public void ts(Student student){

        System.out.println(student == this); // this实际就是类的实例对象
        System.out.println(this.hobby); // code
        System.out.println(super.hobby); // 睡觉

        super.print("Hello World!");
    }

    /**
     * 重写父类方法
     * 1、static静态方法重写，使用父类还是子类的方法取决于实例对象的类型，因此不适合重写
     * Persion persion = new Student()
     * Student student = new Student()
     * 2、修饰符范围可以扩大不能缩小
     * public >= protected >= default >= private
     * 父类方法是protected，子类重写时修饰符只能是protected或者public，不能缩小
     * 3、final常量不能重写
     */
    protected void method(){
        System.out.println("is Student");
    }

    public void single(){
        System.out.println("Student single");
    }

    static public void log(){
        System.out.println("---Student---");
    }
}
