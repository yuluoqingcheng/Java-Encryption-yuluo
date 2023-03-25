
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-18 13:51:47 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-18 13:51:47 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 1000 || x > 9999) {
            System.out.println("error");
        } else {
            int a = x % 10;
            int b = x / 10 % 10;
            int c = x / 100 % 10;
            int d = x / 1000;
            int sum = a * a * a * a + b * b * b * b + c * c * c * c + d * d * d * d;
            if (sum == x) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}