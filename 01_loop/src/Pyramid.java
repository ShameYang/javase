import java.util.Scanner;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO打印金字塔
 * @date 2023/1/3 17:59:40
 */
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入金字塔层数：");
        int layer = sc.nextInt(); // 层数
        for (int i = 1; i <= layer; i++) {
            // 空格数
            for (int j = 1; j <= layer - i; j++) {
                System.out.print(" ");
            }
            // *数
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
