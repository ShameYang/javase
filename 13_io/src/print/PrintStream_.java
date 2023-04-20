package print;

import java.io.PrintStream;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO PrintStream 练习
 * @date 2023/3/22 16:30:00
 */
public class PrintStream_ {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        printStream.print("abc");
    }
}
