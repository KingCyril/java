package oop;

import static java.lang.Math.*;

public /* final 加此修饰符则不能被继承 */ class Persion /* extends Object */ {
    public String name = "spf";
    protected int age = 24;
    private char sex = '男'; // 属性私有

    public String hobby = "睡觉";

    /**
     * 方法重载
     */
    public Persion(){
        // System.out.println(Math.random()); 不需要导入Math 比如 import static java.lang.Math.*;
        System.out.println(random());
    }
    public Persion(String name,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /**
     *  private属性的 getter 和 setter
     */
    public char getSex(){
        return this.sex;
    }

    public void setSex(char sex){
        this.sex = sex;
    }

    public void print(String str){
        System.out.println(str);
    }

    protected void method(){
        System.out.println("is Persion");
    }

    static public void log(){
        System.out.println("---Persion---");
    }
}
