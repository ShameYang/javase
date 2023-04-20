package localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 格式化输出 LocalDateTime
 * @date 2023/3/6 19:26:39
 */
public class Format {
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("格式化前: " + ldt);

        System.out.println("格式化后: " + dtf.format(ldt));
    }
}
