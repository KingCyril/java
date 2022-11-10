package yichang;

public class _01YiChang {

    public static void main(String[] args) {
        // print();
        try {
            new _01YiChang().test(1);
        }catch (Exception e){
            // e.printStackTrace();
            System.out.println(e);
        }finally {
            System.out.println("finally");
        }
    }

    public void test(int a) throws Exception{
        if(a == 0) return;
        throw new Exception("a must be == 0");
    }

    public static void print(){
        int a = 1;
        int b = 0;

        try{
            System.out.println(a / b);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }catch (Throwable e){
            System.out.println(e);
        }finally {
            System.out.println("The end");
        }
    }
}
