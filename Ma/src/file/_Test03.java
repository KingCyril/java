package file;

import java.io.File;

/**
 * 删除有内容的文件夹
 */
public class _Test03 {

    public static void main(String[] args) {

        File file = new File("/Users/shi/Documents/test");
        delete(file);

    }

    public static void delete(File src){
        File[] files = src.listFiles();
        if(files == null) return;
        // 删除子
        for (File file : files) {
           if(file.isFile()){
               file.delete();
           }else{
               delete(file);
           }
        }
        // 再删除自己
        src.delete();
    }
}
