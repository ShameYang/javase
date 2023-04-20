package practice02;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 编写程序，接受命令行的两个参数（整数），计算两数相除
 * @date 2023/3/5 19:35:25
 */
public class Practice02 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不正确");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println(cal(n1, n2));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确，应为整数");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }
    }

    public static int cal(int n1, int n2) {
        return n1 / n2;
    }
}
