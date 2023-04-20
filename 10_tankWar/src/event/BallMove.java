package event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 小球移动案例 -> 事件处理
 * @date 2023/3/12 16:00:41
 */
public class BallMove extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        new BallMove();
    }

    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setLocation(50, 50);
        this.setSize(1000, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //窗口 JFrame 对象可以监听键盘事件
        this.addKeyListener(mp);
    }
}

//画板，可以画出小球
//KeyListener 是监听器，可以监听键盘事件
class MyPanel extends JPanel implements KeyListener {
    //为了让小球移动，将左上角设置为变量
    int x = 100;
    int y = 100;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20);
    }

    //有字符输出时触法
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //某个键按下时触发
    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println(e.getKeyCode());

        //根据用户按下的不同键，处理小球的移动
        if (e.getKeyCode() == KeyEvent.VK_W) {
            y -= 10;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            y += 10;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            x -= 10;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            x += 10;
        }
        //重绘面板
        this.repaint();
    }

    //某个键释放（松开）时触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}