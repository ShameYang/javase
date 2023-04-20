package practice01;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 遍历输出枚举类
 * @date 2023/3/5 12:52:20
 */
public class TestWeek {
    public static void main(String[] args) {
        for (Week week : Week.values()) {
            System.out.println(week.toString());
        }
    }
}
