
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-27 22:16:57 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-27 22:16:57 
 */
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("error");
        } else {
            int he = 0;
            for (int i = n; i != 0; i /= 10) {
                int sum = 1;
                for (int j = 1; j <= i % 10; j++) {
                    sum = sum * j;
                }
                he = he + sum;
            }
            if (he == n) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
