package draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 画圆
 * @date 2023/3/12 14:51:47
 */
public class DrawCircle extends JFrame {
    //定义一个面板
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    // 构造器
    public DrawCircle() {
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口(画框)
        this.add(mp);
        //设置窗口大小
        this.setSize(600,400);
        //窗口可视化
        this.setVisible(true);
        //关闭窗口时，退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// 定义 MyPanel 类，继承 JPanel类，在面板上画图形
class MyPanel extends JPanel {
    // 1.MyPanel 对象就是一个画板
    // 2.Graphics g 可以把 g 理解为一支画笔
    // 3.Graphics 提供了许多绘图方法
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //画一个圆
        g.drawOval(20,20,200,200);
    }
}
