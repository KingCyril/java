package oop;

/**
 * abstract 抽象类
 */
public abstract class _02Abstract {

    /**
     * 不能 new 抽象类，只能靠子类（子子类）去实现它，好似一个约束
     * 抽象类中可以写普通方法，抽象方法只能放到抽象类中
     */

    public void common(){
        System.out.println("abstract---common");
    }

    /**
     * 规范类_02Abstract的子类必须都要有doSomething和doCopy方法
     */
    public abstract void doSomething();
    public abstract void doCopy();
}

abstract class Persions extends _02Abstract{
    /**
     * 没有实现dosomething，Son实现
     */
    public void doCopy(){

    }
}

class Son extends Persions{
    public void doSomething(){
        System.out.println("do some things");
    };
}
