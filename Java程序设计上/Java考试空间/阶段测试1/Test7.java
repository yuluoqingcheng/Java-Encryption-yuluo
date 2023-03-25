
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-27 22:16:49 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-27 22:16:49 
 */
import sun.java2d.ScreenUpdateManager;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = n; i != 0; i /= 10) {
            sum = sum + i % 10;
        }
        System.out.println(Math.abs(sum));
    }
}
