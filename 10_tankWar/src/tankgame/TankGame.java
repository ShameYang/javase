package tankgame;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 游戏窗口设置以及启动
 * @date 2023/3/12 16:45:50
 */
public class TankGame extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        //启动游戏
        new TankGame();
    }

    public TankGame() {
        //把面板(游戏的绘图区域)添加到窗口
        mp = new MyPanel();
        this.add(mp);
        //窗口设置
        this.setSize(1000, 750);
        this.setLocation(50, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        //监听键盘事件
        this.addKeyListener(mp);
    }
}
