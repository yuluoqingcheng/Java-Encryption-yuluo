
/*
 * @Author: 雨落倾城 
 * @Date: 2021-12-16 16:12:37 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-12-16 16:12:37 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int[] x2 = new int[5];
        int[] max = new int[x.length + x2.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < x.length; i++) {
            x2[i] = sc.nextInt();
        }
        System.arraycopy(x, 0, max, 0, 5);
        System.arraycopy(x2, 0, max, 5, 5);
        for (int i = 0; i < max.length; i++) {
            System.out.print(max[i] + " ");
        }
    }
}