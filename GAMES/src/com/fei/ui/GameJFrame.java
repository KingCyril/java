package com.fei.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    String[][] allImage = {
        {"animal1","animal2","animal3","animal4","animal5","animal6","animal7","animal8",},
        {"girl1","girl2","girl3","girl4","girl5","girl6","girl7","girl8","girl9","girl10","girl11","girl12","girl13"},
        {"sport1","sport2","sport3","sport4","sport5","sport6","sport7","sport8","sport9","sport10"},
    };
    Object[][] allImageEvent = new Object[3][13];

    int[][] data = new int[4][4];
    int[][] winData = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,0},
    };
    int x = 0;
    int y = 0;
    String imagePath = "GAMES/image/girl/girl7/";
    int step = 0;
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登陆");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");

    public GameJFrame(){
        initInterface();

        initJMenuBar();

        initData();

        initImage();

        this.setVisible(true);
    }

    private void initData(){
        // 初始化一维数组
        int[] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        // 打乱数组
        Random random = new Random();
        for (int i = 0; i < tempArr.length; i++){
            int randomIndex = random.nextInt(tempArr.length);
            int t = tempArr[i];
            tempArr[i] = tempArr[randomIndex];
            tempArr[randomIndex] = t;
        }
        // 给二维数组赋值
        for (int i = 0; i < tempArr.length; i++){
            if(tempArr[i] == 0){
                // 保存0空白的坐标位置
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    private void initImage() {
        // 清空所有图片
        this.getContentPane().removeAll();

        if(isVictory()){
            JLabel winLabel = new JLabel(new ImageIcon("GAMES/image/win.png"));
            winLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winLabel);
        }

        JLabel textLabel = new JLabel("步数：" + step);
        textLabel.setBounds(50,30,100,20);
        this.getContentPane().add(textLabel);

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                int c = data[i][j];
                // 创建图片对象
                ImageIcon imageIcon = new ImageIcon(imagePath + c + ".jpg");
                // 创建一个JLabel对象
                JLabel jLabel = new JLabel(imageIcon);
                // 设置边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                // 指定图片位置
                jLabel.setBounds(105 * j + 83,105 * i + 134,105,105);

                // 添加到页面中
                // this.add(jLabel);
                this.getContentPane().add(jLabel);
            }
        }

        // 后添加的图片在下方
        JLabel background = new JLabel(new ImageIcon("GAMES/image/background.png"));
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);

        // 刷新界面
        this.getContentPane().repaint();
    }

    /**
     * 初始化菜单
     */
    private void initJMenuBar(){
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        JMenu imageJMenu = new JMenu("更换图片");

        for(int i = 0; i < allImage.length; i++){
            String text = i == 0 ? "动物" : i == 1 ? "美女" : "运动";
            JMenu itemJMenu = new JMenu(text);
            for(int j = 0; j < allImage[i].length; j++){
                JMenuItem item = new JMenuItem(allImage[i][j]);
                allImageEvent[i][j] = item;
                item.addActionListener(this);
                itemJMenu.add(item);
            }
            imageJMenu.add(itemJMenu);
        }

        // 绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        functionJMenu.add(imageJMenu);
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
        this.setLayout(null); // 取消默认的居中放置，按照XY轴的形式添加组件

        // 监听键盘事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 65){
            this.getContentPane().removeAll();
            JLabel allImage = new JLabel(new ImageIcon(imagePath + "all.jpg"));
            allImage.setBounds(83,134,420,420);
            this.getContentPane().add(allImage);

            // 后添加的图片在下方
            JLabel background = new JLabel(new ImageIcon("GAMES/image/background.png"));
            background.setBounds(40,40,508,560);
            this.getContentPane().add(background);

            // 刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        // 如果胜利了，不能再移动图片了
        if(isVictory() && code != 65) return;
        if(code == 37){
            if(y == 3) return;
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
        }else if(code == 38){
            if(x == 3) return;
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
        }else if(code == 39){
            if(y == 0) return;
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
        }else if(code == 40){
            if(x == 0) return;
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
        } else if(code == 87){
            data = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,0},
            };
            step++;
        }
        // 重新渲染图片
        initImage();
    }

    public boolean isVictory(){
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                if(data[i][j] != winData[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == replayItem){
            step = 0;
            initData();
            initImage();
        } else if (source == reLoginItem) {
            this.setVisible(false);
            new LoginJFrame();
        } else if (source == closeItem) {
            System.exit(0); // 直接关闭虚拟机
        } else if (source == accountItem) {
            JDialog imageDialog = new JDialog();
            JLabel imageLabel = new JLabel(new ImageIcon("GAMES/image/about.png"));
            imageLabel.setBounds(0,0,258,258);
            imageDialog.getContentPane().add(imageLabel);
            imageDialog.setSize(344,344);
            imageDialog.setAlwaysOnTop(true);
            imageDialog.setLocationRelativeTo(null);
            imageDialog.setModal(true);
            imageDialog.setVisible(true);
        } else{
            for(int i = 0; i < allImage.length; i++){
                for (int j = 0; j < allImage[i].length; j++){
                    if(source == allImageEvent[i][j]){
                        String text = i == 0 ? "animal" : i == 1 ? "girl" : "sport";
                        imagePath = "GAMES/image/" + text + "/" + text + (j + 1) + "/";
                    }
                }
            }
            step = 0;
            initData();
            initImage();
        }
    }
}
