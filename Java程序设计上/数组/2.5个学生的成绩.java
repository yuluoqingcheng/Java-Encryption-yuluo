
/*
 * @Author: 雨落倾城 
 * @Date: 2021-12-16 16:08:08 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-12-16 16:08:08 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
            if (a[i] < 0 || a[i] > 100) {
                System.out.println("error");
                flag = false;
                break;
            }
        }
        if (flag) {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }
}