package tankgame2;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 坦克发射子弹
 * @date 2023/3/17 14:08:20
 */
public class Shot implements Runnable {
    int x; // 子弹 x 坐标
    int y; // 子弹 y 坐标
    int direct = 0; // 子弹方向
    int speed = 10; // 子弹速度
    boolean isLive = true; //子弹是否存活

    //构造器
    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() { //射击

        while (true) {
            //休眠50毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //根据方向改变 x, y 坐标
            switch (direct) {
                case 0: //上
                    y -= speed;
                    break;
                case 1: //右
                    x += speed;
                    break;
                case 2: //下
                    y += speed;
                    break;
                case 3: //左
                    x -= speed;
                    break;
            }

            //子弹碰到边缘或敌人坦克时，就应销毁
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)) {
                isLive = false;
                break;
            }
        }
    }
}
