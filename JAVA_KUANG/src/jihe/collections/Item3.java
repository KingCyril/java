package jihe.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Item3 {
    public static void main(String[] args) {

        /**
         * 随机选老婆
         * 选到的不能再被选到，直到所有人都被选中过，开启新一轮
         */
        ArrayList<String> nameList = new ArrayList<>();
        Collections.addAll(nameList, "刘亦菲", "三吉彩花", "王鸥", "美杜莎", "云韵", "焰灵姬", "月婵", "迪丽热巴", "倪妮", "古力娜扎");
        ArrayList<String> copyList = new ArrayList<>();
        int total = nameList.size();

        Random r = new Random();
        // 10轮
        for (int i = 1; i <= 10; i++) {
            System.out.println("================第" + i + "轮点名开始======================");
            for (int j = 0; j < total; j++) {
                int index = r.nextInt(nameList.size());
                // 原集合删除
                String name = nameList.remove(index);
                // 保存在备用集合，用于开启下一轮
                copyList.add(name);
                System.out.println(name);
            }
            // 还原
            nameList.addAll(copyList);
            copyList.clear();
        }

    }
}
