package tankgame2;

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
//为了不停重绘子弹，将 MyPanel 做成一个线程
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义自己的坦克
    MyTank myTank = null;
    //定义敌方坦克，放到 Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;

    public MyPanel() {
        //初始化自己坦克
        myTank = new MyTank(600, 600);
        myTank.setSpeed(10);

        //初始化敌人坦克
        for (int i = 0; i < enemyTankSize; i++) {
            //创建一个敌人坦克
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            enemyTank.setSpeed(3);
            //设置方向
            enemyTank.setDirect(2);
            //启动敌人坦克线程，动起来
            new Thread(enemyTank).start();
            //给坦克创建一个子弹
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60,
                    enemyTank.getDirect());
            //加入 enemyTank 的 Vector 成员
            enemyTank.shots.add(shot);
            //启动 shot 对象
            new Thread(shot).start();
            //加入
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //填充背景，默认黑色
        g.fillRect(0, 0, 1000, 750);

        //画出坦克 -> 封装方法
        if (myTank != null && myTank.isLive) {
            drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirect(), 0);
        }

        //画出 myTank 子弹
//        if (myTank.shot != null && myTank.shot.isLive == true) {
//            g.draw3DRect(myTank.shot.x, myTank.shot.y, 3, 3, false);
//        }
        //遍历并绘制 myTank 子弹集合 shots
        for (int i = 0; i < myTank.shots.size(); i++) {
            Shot shot = myTank.shots.get(i);
            if (shot != null && shot.isLive) {
                g.draw3DRect(shot.x, shot.y, 3, 3, false);
            } else { //shot 对象已经无效
                myTank.shots.remove(shot);
            }
        }

        //画出敌人坦克, 遍历 Vector
        for (int i = 0; i < enemyTankSize; i++) {
            //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //判断当前坦克是否存活
            if (enemyTank.isLive) {
                drawTank(enemyTank.getX() + 10, enemyTank.getY() + 10, g, enemyTank.getDirect(), 1);
                //画出 enemyTank 所有子弹
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    //取出子弹
                    Shot shot = enemyTank.shots.get(j);
                    //绘制
                    if (shot.isLive) {
                        g.draw3DRect(shot.x, shot.y, 3, 3, false);
                    } else {
                        //从 Vector 移除
                        enemyTank.shots.remove(shot);
                    }
                }
            }
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

    //判断子弹是否命中坦克
    public static void hitTank(Shot shot, Tank tank) {
        switch (tank.getDirect()) {
            case 0: //坦克向上
            case 2: //坦克向下
                if (shot.x > tank.getX() && shot.x < tank.getX() + 40
                        && shot.y > tank.getY() && shot.y < tank.getY() + 60) {
                    shot.isLive = false;
                    tank.isLive = false;
                }
                break;
            case 1: //坦克向右
            case 3: //坦克向左
                if (shot.x > tank.getX() && shot.x < tank.getX() + 60
                        && shot.y > tank.getY() && shot.y < tank.getY() + 40) {
                    shot.isLive = false;
                    tank.isLive = false;
                }
                break;
        }
    }

    //判断我方坦克是否命中敌方
    public void hitEnemy() {
        for (int j = 0; j < myTank.shots.size(); j++) {
            Shot shot = myTank.shots.get(j);
            //判断是否击中敌人坦克
            if (shot != null && shot.isLive) {
                //遍历敌人所有坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(shot, enemyTank);
                }
            }
        }
    }

    //判断敌方坦克是否命中我方
    public void hitMytank() {
        //遍历所有敌人坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            //遍历 enemyTank 对象的所有子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                //判断 shot 是否命中我方坦克
                if (myTank.isLive && shot.isLive) {
                    hitTank(shot, myTank);
                }
            }
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

        //按下 J 键，发射子弹
        if (e.getKeyCode() == KeyEvent.VK_J) {
            //发射一颗子弹
//            if (myTank.shot == null || !myTank.shot.isLive) {
//                myTank.shotEnemy();
//            }
            //发射多颗子弹
            myTank.shotEnemy();
        }

        //面板重绘
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() { //每隔10毫秒，重绘区域
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            hitEnemy();
            hitMytank();

            this.repaint();
        }
    }
}
