import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {

    static ArrayList<String> pokerList = new ArrayList<>();

    /**
     * 静态代码块
     * 特点：只执行一次
     */
    static {
        // 准备牌
        String[] type = {"♠︎","♣︎","♥︎","♦︎"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        for (String s : type) {
            for (String s1 : number) {
                pokerList.add(s + s1);
            }
        }
        pokerList.add("small");
        pokerList.add("big");

    }

    /**
     * 无参构造
     */
    public PokerGame(){
        // 洗牌
        Collections.shuffle(pokerList);
        System.out.println(pokerList);

        // 发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < pokerList.size(); i++) {
            if(i <= 2){
                lord.add(pokerList.get(i));
                continue;
            }
            int num = i % 3;
            if(num == 0){
                player1.add(pokerList.get(i));
            } else if (num == 1) {
                player2.add(pokerList.get(i));
            }else {
                player3.add(pokerList.get(i));
            }
        }

        // 看牌
        lookPoker("底牌",lord);
        lookPoker("刘亦菲",player1);
        lookPoker("三吉彩花",player2);
        lookPoker("我",player3);
    }

    public void lookPoker(String playerName,ArrayList<String> list){
        System.out.print(playerName + "：");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println("");
    }
}
