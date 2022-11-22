package err;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _01Basic {

    public static void main(String[] args) throws ParseException {

        /**
         * Java.lang.Throwable
         *      Error 不用管
         *      Exception 异常
         *          RuntimeException  编译阶段不会出现异常提醒，运行异常 例如数组越界
         *          其他异常 编译阶段就会出现的异常提醒
         */

        String time = "2021年11月22日";
        SimpleDateFormat t = new SimpleDateFormat("yyyy年MM月dd日");

        Date date = t.parse(time);
        System.out.println(date);
    }
}
