/**
 * @author ShameYang
 * @version 1.0
 * @description TODO
 * @date 2023/2/27 16:39:26
 */
public class Test01 {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = n1;
        n1 = 200;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr2[0] = 1;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
    }
}
