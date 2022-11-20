import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 * 根据价值排序
 */
public class _03Test {

    static ArrayList<String> list = new ArrayList<>();

    /**
     * 价值表3-10按照牌本身值为价值
     */
    static HashMap<String,Integer> valueMap = new HashMap<>();

    static {
        // 准备牌{"方片︎","梅花","红桃︎","黑桃"}
        String[] type = {"方片","梅花","红桃","黑桃"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        for (String s : number) {
            for (String s1 : type) {
                list.add(s1 + s);
            }
        }
        list.add("small");
        list.add("big");

        valueMap.put("J",11);
        valueMap.put("Q",12);
        valueMap.put("K",13);
        valueMap.put("A",14);
        valueMap.put("2",15);
        valueMap.put("small",16);
        valueMap.put("big",17);
    }

    public _03Test(){
        // 发牌
        Collections.shuffle(list);

        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(i <= 2){
                lord.add(list.get(i));
                continue;
            }
            int num = i % 3;
            if(num == 0){
                player1.add(list.get(i));
            } else if (num == 1) {
                player2.add(list.get(i));
            }else{
                player3.add(list.get(i));
            }
        }

        // 排序
        order(lord);
        order(player1);
        order(player2);
        order(player3);

        // 看牌
        lookPoker("底牌",lord);
        lookPoker("刘亦菲",player1);
        lookPoker("三吉彩花",player2);
        lookPoker("我",player3);
    }

    /**
     * 排序
     * @param list
     */
    public void order(ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                /**
                 * o1 要插入的牌
                 * o2 已经在序列中的牌
                 */
                String color = o1.substring(0,2);
                int value = getValue(o1);

                String color2= o2.substring(0,2);
                int value2 = getValue(o2);

                int i = value - value2;
                return i == 0 ? color.compareTo(color2) : i;
            }
        });
    }

    public int getValue(String data){
        if(data.equals("small") || data.equals("big")) {
            return valueMap.get(data);
        }
        String number = data.substring(2);
        if (valueMap.containsKey(number)) {
            return valueMap.get(number);
        } else {
            return Integer.parseInt(number);
        }
    }

    public void lookPoker(String playerName,ArrayList<String> list){
        System.out.print(playerName + "：");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println("");
    }
}
