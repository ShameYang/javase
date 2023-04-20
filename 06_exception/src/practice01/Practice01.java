package practice01;

import java.util.Scanner;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 循环输出，直到整数为止
 * @date 2023/3/5 18:51:10
 */
public class Practice01 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个整数: ");
            String input = scanner.next();
            try {
                int n = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数!");
            }
        }
    }
}
