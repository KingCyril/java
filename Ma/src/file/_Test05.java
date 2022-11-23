package file;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 统计目录下文件类型及其个数
 */
public class _Test05 {

    public static void main(String[] args) {

        File file = new File("/Users/shi/Desktop/model-preview");
        HashMap<String,Integer> map = tongji(file);
        System.out.println(map);
    }

    public static HashMap<String,Integer> tongji(File src){
        HashMap<String,Integer> total = new HashMap<>();
        File[] files = src.listFiles();
        if(files == null) return new HashMap<>();
        for (File file : files) {
            if(file.isFile()){
                String[] arr = file.getName().split("\\.");
                if(arr.length < 2) return new HashMap<>();// 没有后缀名，不考虑
                String ext = arr[arr.length - 1];
                if(total.containsKey(ext)){
                    int num = total.get(ext) + 1;
                    total.put(ext,num);
                }else{
                    total.put(ext,1);
                }
            }else{
                HashMap<String, Integer> tongji = tongji(file);
                Set<Map.Entry<String, Integer>> entries = tongji.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if(total.containsKey(key)){
                        int num = total.get(key) + value;
                        total.put(key,num);
                    }else{
                        total.put(key,value);
                    }
                }
            }
        }
        return total;
    }
}
