package err;

public class _04Throws {

    public static void main(String[] args) {

        /**
         * throws 写在方法定义处，表示声明一个异常，告诉调用者，使用本方法可能会有哪些异常
         *          编译时异常必须要写，运行时异常可以不写 public void method() 异常1,异常2{  ...  }
         * throw 写在方法内，结束方法，手动抛出异常对象，交给调用者，方法下边的代码不再执行了
         *          throw new NullPointerException()
         */
        int[] arr = {2,4,6,8,12,3};

        try {
            int max = getMax(arr);
            System.out.println(max);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    // public static int getMax(int[] arr) throws NullPointerException,ArrayIndexOutOfBoundsException{
    public static int getMax(int[] arr){ // 运行时异常 throws 可以不写
        if(arr == null){
            throw new NullPointerException();
        }
        if(arr.length == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = arr[0];
        for (int i = arr.length - 1; i > 0; i--) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
