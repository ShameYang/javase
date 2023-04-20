/**
 * @author ShameYang
 * @version 1.0
 * @description TODO九九乘法表
 * @date 2023/1/3 17:47:07
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + '\t');
            }
            System.out.println();
        }
    }
}
