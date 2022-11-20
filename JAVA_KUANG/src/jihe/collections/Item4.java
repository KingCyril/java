package jihe.collections;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Item4 {

    public static void main(String[] args) {
        // 省
        HashMap<String, ArrayList<String>> provinceList = new HashMap<>();
        // 市
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"郑州市","驻马店市","洛阳市");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"杭州市","宁波市","绍兴市");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"南京市","无锡市","苏州市");

        provinceList.put("河南省",list1);
        provinceList.put("浙江省",list2);
        provinceList.put("江苏省",list3);

        Set<Map.Entry<String,ArrayList<String>>> obj = provinceList.entrySet();
        for (Map.Entry<String, ArrayList<String>> stringArrayListEntry : obj) {
            String key = stringArrayListEntry.getKey();
            StringJoiner str = new StringJoiner("",key + "=","");
            ArrayList<String> value = stringArrayListEntry.getValue();

            for (int i = 0; i < value.size(); i++) {
                str.add(i + 1 == value.size() ? value.get(i) : value.get(i) + "，");
            }
            System.out.println(str);
        }
    }
}
