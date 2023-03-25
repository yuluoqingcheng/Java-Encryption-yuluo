
/*
 * @Author: 雨落倾城 
 * @Date: 2021-12-16 16:08:53 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-12-16 16:08:53 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] sum = new double[5];
        double a = 0;
        for (int x = 0; x < sum.length; x++) {
            sum[x] = scan.nextDouble();
        }
        for (int i = 0; i < sum.length; i++) {
            a += sum[i];
        }
        System.out.println(a / 5);
    }
}