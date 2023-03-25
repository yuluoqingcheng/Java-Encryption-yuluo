
/*
 * @Author: 雨落倾城 
 * @Date: 2021-12-16 16:08:22 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-12-16 16:08:22 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] sum = new double[5];
        for (int x = 0; x < sum.length; x++) {
            sum[x] = scan.nextDouble();
        }
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length - 1; j++) {
                double temp = 0;
                if (sum[j] > sum[j + 1]) {
                    temp = sum[j];
                    sum[j] = sum[j + 1];
                    sum[j + 1] = temp;
                }
            }
        }
        System.out.println(sum[0]);
    }
}