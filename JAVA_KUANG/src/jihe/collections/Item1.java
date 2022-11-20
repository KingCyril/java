package jihe.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Item1 {
    public static void main(String[] args) {

        /**
         * 随机选老婆
         */
        ArrayList<String> nameList = new ArrayList<>();
        Collections.addAll(nameList,"刘亦菲","三吉彩花","王鸥","美杜莎","云韵","焰灵姬","月婵","迪丽热巴","倪妮","古力娜扎");

        /**
         * 方法一
         */
        Random r = new Random();
        int index = r.nextInt(nameList.size());
        String name = nameList.get(index);
        System.out.println(name);

        /**
         * 方法二
         */
        Collections.shuffle(nameList);
        System.out.println(nameList.get(0));
    }
}
