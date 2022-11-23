package file;

import java.io.File;
import java.util.Arrays;

/**
 * 遍历目录下所有gif文件
 */
public class _Test02 {

    public static void main(String[] args) {

        findJs();
    }

    public static void findJs(){
        File[] rootFiles = File.listRoots();

        for (File rootFile : rootFiles) {
            File users = new File(rootFile, "Users/shi/Documents/test");
            findJs(users);
        }
    }

    public static void findJs(File file){
        File[] files = file.listFiles();
        if(files != null) {
            for (File file1 : files) {
                if (file1.isFile()) {
                    if (file1.getName().endsWith(".gif")) {
                        System.out.println(file1.getName());
                    }
                } else {
                    findJs(file1);
                }
            }
        }
    }
}
