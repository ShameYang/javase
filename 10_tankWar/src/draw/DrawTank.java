package draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 画坦克
 * @date 2023/3/12 15:23:14
 */
public class DrawTank extends JFrame {
    //定义面板
    MyPanel_Tank mp = null;

    public static void main(String[] args) {
        new DrawTank();
    }

    DrawTank() {
        //初始化面板
        mp = new MyPanel_Tank();
        this.add(mp);
        this.setLocation(100, 50);
        this.setSize(1440, 960);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyPanel_Tank extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //背景
        g.fillRect(-1,-1,1441,961);
        //左边轮子
        g.setColor(Color.pink);
        g.setColor(Color.black);
        g.drawRect(120, 160, 40, 200);
        //中间
        g.drawRect(160, 200, 120, 120);
        g.drawOval(180, 220, 80, 80);
        g.drawRect(215, 90, 10, 130);
        //右边轮子
        g.drawRect(280, 160, 40, 200);
    }
}