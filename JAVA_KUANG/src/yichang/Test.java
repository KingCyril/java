package yichang;

public class Test {

    public static void main(String[] args) {
        try {
            add(11);
        }catch (_02MyException e){
            System.out.println(e);
            // e.printStackTrace();
        }
    }

    public static void add(int a) throws _02MyException{
        if(a > 10){
            throw new _02MyException("a cant > 10");
        }
    }
}
