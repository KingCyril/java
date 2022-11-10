package com.fei.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {

    public LoginJFrame(){
        // 界面宽高
        this.setSize(488,430);
        this.setTitle("拼图登陆"); // 标题
        this.setAlwaysOnTop(true); // 上层显示
        this.setLocationRelativeTo(null); // 居中显示
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 关闭窗口，虚拟机结束


        this.setVisible(true);
    }
}
