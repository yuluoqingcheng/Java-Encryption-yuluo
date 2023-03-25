
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-22 11:49:20 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-22 11:49:20 
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println("error");
        } else {
            fun(a);
        }

    }

    public static void fun(int a) {
        int factor = 0;
        for (int j = 1; j < a / 2 + 1; j++) {
            if (a % j == 0)
                factor += j;
        }
        if (factor == a) {
            System.out.println("yes");
            return;
        }
        System.out.println("no");
    }
}