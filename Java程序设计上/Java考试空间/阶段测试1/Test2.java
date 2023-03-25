
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-27 22:16:29 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-27 22:16:29 
 */
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("error");
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
