package jihe.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Item2 {
    public static void main(String[] args) {

        /**
         * 随机选老婆(带有概率)
         * 70%真人
         * 30%动漫
         */
        ArrayList<String> realList = new ArrayList<>();
        ArrayList<String> virtualList = new ArrayList<>();
        Collections.addAll(realList,"刘亦菲","三吉彩花","王鸥","迪丽热巴","倪妮","古力娜扎");
        Collections.addAll(virtualList,"美杜莎","云韵","焰灵姬","月婵");

        /**
         * 定义概率数组集合
         */
        ArrayList<Integer> intList = new ArrayList<>();
        Collections.addAll(intList,1,1,1,1,1,1,1,0,0,0);
        Collections.shuffle(intList);

        Random r = new Random();
        int index = r.nextInt(intList.size());
        int num = intList.get(index);

        if(num == 1) {
            // 真人
            int i = r.nextInt(realList.size());
            String name = realList.get(i);
            System.out.println(name);
        }else{
            // 动漫
            int i = r.nextInt(virtualList.size());
            String name = virtualList.get(i);
            System.out.println(name);
        }
    }
}
