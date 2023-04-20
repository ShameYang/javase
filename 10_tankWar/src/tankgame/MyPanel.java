package tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 坦克大战绘图区域
 * @date 2023/3/12 16:42:42
 */
@SuppressWarnings({"all"})
//实现 KetListener，监听键盘事件
public class MyPanel extends JPanel implements KeyListener {
    //定义自己的坦克
    MyTank myTank = null;
    //定义敌方坦克，放到 Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;

    public MyPanel() {
        //初始化自己坦克
        myTank = new MyTank(100, 100);
        myTank.setSpeed(10);
        //初始化敌人坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            enemyTank.setDirect(2);
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //填充背景，默认黑色
        g.fillRect(0, 0, 1000, 750);

        //画出坦克 -> 封装方法
        drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirect(), 0);

        //画出敌人坦克, 遍历 Vector
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
        }
    }

    /**
     *
     * @param x 坦克左上角 x 坐标
     * @param y 坦克左上角 y 坐标
     * @param g 画笔
     * @param direct 坦克方向
     * @param type 坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {

        //根据坦克类型，设置颜色
        switch (type) {
            case 0: // 自己的坦克
                g.setColor(Color.cyan);
                break;
            case 1: // 敌方坦克
                g.setColor(Color.ORANGE);
                break;
        }

        //根据坦克方向，绘制对应坦克
        //direct 表示不同方向(0:向上 1:向右 2:向下 3:向左)
        switch (direct) {
            case 0: // 向上
                g.fill3DRect(x, y, 10, 60, false); //画出左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false); //画出右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false); //中间正方体
                g.fillOval(x + 10, y + 20, 20, 20); //中间圆盖
                g.drawLine(x + 20, y + 30, x + 20, y); //炮筒
                break;
            case 1: //向右
                g.fill3DRect(x, y, 60, 10, false); //画出上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false); //画出下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false); //中间正方体
                g.fillOval(x + 20, y + 10, 20, 20); //中间圆盖
                g.drawLine(x + 30, y + 20, x + 60, y + 20); //炮筒
                break;
            case 2: //向下
                g.fill3DRect(x, y, 10, 60, false); //画出左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false); //画出右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false); //中间正方体
                g.fillOval(x + 10, y + 20, 20, 20); //中间圆盖
                g.drawLine(x + 20, y + 30, x + 20, y + 60); //炮筒
                break;
            case 3: //向左
                g.fill3DRect(x, y, 60, 10, false); //画出上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false); //画出下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false); //中间正方体
                g.fillOval(x + 20, y + 10, 20, 20); //中间圆盖
                g.drawLine(x + 30, y + 20, x, y + 20); //炮筒
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            myTank.setDirect(0);
            myTank.moveUp();
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            myTank.setDirect(1);
            myTank.moveRight();
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            myTank.setDirect(2);
            myTank.moveDown();
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            myTank.setDirect(3);
            myTank.moveLeft();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
