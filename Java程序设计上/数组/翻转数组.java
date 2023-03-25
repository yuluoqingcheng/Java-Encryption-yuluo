
/*
 * @Author: 雨落倾城 
 * @Date: 2021-12-16 16:13:13 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-12-16 16:13:13 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x <= 0) {
            System.out.println("error");
        } else {
            int[] sum = new int[x];

            for (int i = 0; i < sum.length; i++) {
                sum[i] = sc.nextInt();
            }
            for (int i = sum.length - 1; i >= 0; i--) {
                System.out.println(sum[i]);
            }

        }
    }
}