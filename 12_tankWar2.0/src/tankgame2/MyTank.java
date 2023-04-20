package tankgame2;

import java.util.Vector;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 自己的坦克
 * @date 2023/3/12 16:41:30
 */
public class MyTank extends Tank {
    //定义 Shot 对象，表示一个射击
    Shot shot = null;
    Vector<Shot> shots = new Vector<>();

    public MyTank(int x, int y) {
        super(x, y);
    }

    //射击
    public void shotEnemy() {
        switch (getDirect()) {
            case 0: //上
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1: //右
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2: //下
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3: //左
                shot = new Shot(getX(), getY() + 20, 3);
                break;
        }

        //把新建的 shot 放入到 shots
        shots.add(shot);

        //启动 Shot 线程
        new Thread(shot).start();
    }
}
