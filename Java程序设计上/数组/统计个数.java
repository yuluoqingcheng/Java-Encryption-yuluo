
/*
 * @Author: 雨落倾城 
 * @Date: 2021-12-16 16:12:18 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-12-16 16:12:18 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        if (sum <= 0) {
            System.out.println("error");
        } else {
            int[] w = new int[sum];
            for (int i = 0; i < sum; i++) {
                w[i] = sc.nextInt();
            }
            int x2 = sc.nextInt();
            int count = 0;
            for (int i = 0; i < sum; i++) {
                if (w[i] == x2) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}