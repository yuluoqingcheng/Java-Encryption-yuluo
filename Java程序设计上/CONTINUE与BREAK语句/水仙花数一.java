
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-18 13:51:33 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-18 13:51:33 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 100 || a > 999) {
            System.out.println("error");
        } else {
            int x = a / 100;
            int y = a / 10 % 10;
            int z = a % 10;
            if (a == x * x * x + y * y * y + z * z * z) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}