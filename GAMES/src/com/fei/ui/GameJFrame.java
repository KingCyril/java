package com.fei.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {

    public GameJFrame(){
        initInterface();

        initJMenuBar();

        initImage();

        this.setVisible(true);
    }

    private void initImage() {
        // 创建图片对象
        ImageIcon imageIcon =new ImageIcon("");
        // 创建一个JLabel对象
        JLabel jLabel = new JLabel(imageIcon);
        // 指定图片位置
        // jLabel.setBounds(0,0,105,105);

        // 添加到页面中
        this.add(jLabel);
        // this.getContentPane().add(jLabel);
    }

    /**
     * 初始化菜单
     */
    private void initJMenuBar(){
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登陆");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
    }

    /**
     * 初始化GUI界面
     */
    private void initInterface(){
        this.setSize(603,680); // 界面宽高
        this.setTitle("拼图单机版 v1.0"); // 标题
        this.setAlwaysOnTop(true); // 上层显示
        this.setLocationRelativeTo(null); // 居中显示
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 关闭窗口，虚拟机结束
        // this.setLayout(null); // 取消默认的居中放置，按照XY轴的形式添加组件
    }
}
