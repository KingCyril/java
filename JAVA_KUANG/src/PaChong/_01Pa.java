package PaChong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01Pa {

    public static void main(String[] args) throws IOException {
        // 创建一个URL对象
        URL url = new URL("https://www.taobao.com/");
        // 连接
        URLConnection coon = url.openConnection();
        // 创建一个对象，去读取网络中的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(coon.getInputStream()));
        String line;
        Pattern pattern = Pattern.compile("https://[1-9a-zA-Z./0]{0,}");
        while ((line = br.readLine()) != null){
            // System.out.println(line);
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
                System.out.println(matcher.group());
            }
        }

        br.close();
    }
}
