package err;

public class _02try {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        try{
            System.out.println(arr[10]);
            System.out.println(2/0);
            String s = null;
            System.out.println(s.equals("Hello"));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (NullPointerException | ArithmeticException e){
            System.out.println("捕获到空指针异常和计算异常");
        }

        System.out.println("看看我执行了么？");

        /**
         * 如果catch没有捕获到异常，相当于try catch白写了
         */
    }
}
