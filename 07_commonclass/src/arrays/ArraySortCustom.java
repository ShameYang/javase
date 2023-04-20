package arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO sort定制排序
 * @date 2023/3/6 17:53:28
 */
public class ArraySortCustom {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 7, 6, 5};
        bubble(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i1 - i2;
            }
        });
        System.out.println("===排序后的数组===");
        System.out.println(Arrays.toString(arr));
    }

    //冒泡排序
    public static void bubble(int[] arr, Comparator c) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
