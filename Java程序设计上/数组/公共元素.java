
/*
 * @Author: 雨落倾城 
 * @Date: 2021-12-16 16:13:30 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-12-16 16:13:30 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] x = new double[10];
        double[] x2 = new double[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextDouble();
        }
        for (int i = 0; i < x.length; i++) {
            x2[i] = sc.nextDouble();
        }
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x2.length; j++) {
                if (x[i] == x2[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}