
/*
 * @Author: 雨落倾城 
 * @Date: 2021-12-01 14:54:29 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-12-01 14:54:29 
 */
import java.util.Scanner;

public class zu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int b = 0;
        // 赋值
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        // 遍历
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("最高成绩是" + max);
    }
}
