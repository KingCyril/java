package file;

import java.io.File;

/**
 * 统计一个文件夹的总大小
 */
public class _Test04 {

    public static void main(String[] args) {

        File file = new File("/Users/shi/Desktop/model-preview");
        long size = getSize(file);
        System.out.println(size);
    }

    public static long getSize(File src){
        long size = 0;
        File[] files = src.listFiles();
        if(files == null) return 0;
        for (File file : files) {
            if(file.isFile()){
                size += file.length();
            }else{
                size += getSize(file);
            }
        }
        return size;
    }
}
