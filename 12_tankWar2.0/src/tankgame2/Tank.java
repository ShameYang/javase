package tankgame2;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 坦克类
 * @date 2023/3/12 16:39:38
 */
public class Tank {
    private int x; // 坦克横坐标
    private int y; // 坦克纵坐标
    private int direct; //坦克方向 (0上 1右 2下 3左)
    private int speed; //坦克移动速度
    boolean isLive = true; //坦克是否存活

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        if (y < 10) {
            return;
        }
        y -= speed;
    }

    public void moveDown() {
        if (y > 630) {
            return;
        }
        y += speed;
    }

    public void moveLeft() {
        if (x < 10) {
            return;
        }
        x -= speed;
    }

    public void moveRight() {
        if (x > 910) {
            return;
        }
            x += speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
