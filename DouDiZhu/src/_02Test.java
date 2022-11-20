import java.util.*;

/**
 * 洗牌发牌（带顺序）
 * 排序方式1（映射关系）
 */
public class _02Test {
    // 映射关系表
    static HashMap<Integer,String> mappings = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        // 准备牌
        String[] type = {"♦︎","♣︎","♥︎","♠︎"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        int count = 1;

        for (String s : number) {
            for (String s1 : type) {
                mappings.put(count, s1 + s);
                list.add(count);
                count++;
            }
        }
        mappings.put(count, "small");
        list.add(count);
        count++;
        list.add(count);
        mappings.put(count, "big");
        System.out.println(list);
        System.out.println(mappings);
    }

    public _02Test(){
        // 洗牌
        Collections.shuffle(list);

        // 发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

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
            }else {
                player3.add(list.get(i));
            }
        }

        // 看牌
        lookPoker("底牌",lord);
        lookPoker("刘亦菲",player1);
        lookPoker("三吉彩花",player2);
        lookPoker("我",player3);
    }

    public void lookPoker(String playerName,TreeSet<Integer> list){
        System.out.print(playerName + "：");
        for (int s : list) {
            System.out.print(mappings.get(s) + " ");
        }
        System.out.println("");
    }
}
