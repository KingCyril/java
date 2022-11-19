package first;

import java.io.IOException;

public class _03Runtime {

    public static void main(String[] args) throws IOException {

        // 获取runtime对象
        Runtime runtime = Runtime.getRuntime();
        // 停止虚拟机
        // runtime.exit(0);
        // 获取cpu线程数
        System.out.println(runtime.availableProcessors());

        // 获取jvm虚拟机能获得的总内存的大小
        System.out.println(runtime.maxMemory() / 1024 / 1024 + "MB"); // 4096MB
        // 获取虚拟机已经获得的内存大小
        System.out.println(runtime.totalMemory() / 1024 / 1024 + "MB"); // 260MB
        // 获取虚拟机剩余内存的大小
        System.out.println(runtime.freeMemory() / 1024 / 1024 + "MB"); // 255MB（运行占用了5MB）

        // runtime.exec("shutdown -s -t 10");
    }
}
