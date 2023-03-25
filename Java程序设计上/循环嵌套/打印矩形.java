
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-22 11:48:48 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-22 11:48:48 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < 1 || b < 1 || a < b) {
            System.out.println("error");
        } else {
            if (a <= 0) {
                System.out.println("error");
            } else {
                for (int i = 0; i < b; i++) {
                    for (int j = 0; j < a; j++) {
                        System.out.print("*");
                    }
                    if (i == a - 1) {
                        break;
                    } else {
                        System.out.println();
                    }
                }
            }
        }

    }
}