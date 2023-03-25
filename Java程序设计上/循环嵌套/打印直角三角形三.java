
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-22 11:50:17 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-22 11:50:17 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s < 1) {
            System.out.println("error");
        } else {
            for (int i = 1; i <= s; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}