package practice02;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO
 * @date 2023/3/5 16:28:17
 */
public enum Color implements Imple {
    RED(255, 0, 0), BLUE(0, 0, 255), BLACK(0, 0, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0);

    private final int redValue;
    private final int greenValue;
    private final int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值：red = " + redValue + ", green = " + greenValue +
                ", blue = " + blueValue);
    }
}
