package localdatetime;

import java.time.LocalDateTime;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 测试第三代日期类
 * @date 2023/3/6 19:19:36
 */
public class Test {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDateTime newLdt = ldt.plusDays(1);
        System.out.println(Format.dtf.format(newLdt));
    }
}
