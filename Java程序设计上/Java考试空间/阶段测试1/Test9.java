
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-27 22:16:54 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-27 22:16:54 
 */
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (b > 0) {
            int sum = 0;
            for (int i = 0; i < b; i++) {
                sum = sum + a;
                a = a + c;
            }
            System.out.println(sum);
        }
    }
}
