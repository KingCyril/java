package err;

public class _03Methods {

    public static void main(String[] args) {

        /**
         * getMessage 返回此 throwable 的详细消息字符串
         * toString 返回此可抛出的简短描述
         * printStackTrace 把异常的错误信息输出在控制台，不会结束虚拟机运行，底层用System.err.println()输出
         */

        int[] arr = {1,2,3,4,5,6};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println(e.getMessage()); // Index 10 out of bounds for length 6
            // System.out.println(e.toString()); // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6
            e.printStackTrace(); // 将错误信息以红色的字体打印在控制台，不会结束虚拟机运行
        }

        System.out.println("看看我执行了没？");
        System.err.println("红色欧");
    }
}
