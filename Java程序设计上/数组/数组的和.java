
/*
 * @Author: 雨落倾城 
 * @Date: 2021-12-16 16:12:52 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-12-16 16:12:52 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x <= 0) {
            System.out.println("error");
        } else {
            double[] sum = new double[x];
            double max = 0;
            for (int i = 0; i < sum.length; i++) {
                sum[i] = sc.nextDouble();
                max = max + sum[i];
            }
            System.out.println(max);
        }
    }
}