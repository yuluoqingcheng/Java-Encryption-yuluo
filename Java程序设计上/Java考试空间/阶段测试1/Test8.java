
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-27 22:16:52 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-27 22:16:52 
 */
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("error");
        } else {
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + 1.0 / i;
            }
            System.out.println(sum);
        }
    }
}
