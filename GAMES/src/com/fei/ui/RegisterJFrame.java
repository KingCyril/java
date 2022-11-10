package com.fei.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {

    public RegisterJFrame(){
        this.setSize( 488,500);
        this.setTitle("拼图注册"); // 标题
        this.setAlwaysOnTop(true); // 上层显示
        this.setLocationRelativeTo(null); // 居中显示
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 关闭窗口，虚拟机结束


        this.setVisible(true);
    }
}
