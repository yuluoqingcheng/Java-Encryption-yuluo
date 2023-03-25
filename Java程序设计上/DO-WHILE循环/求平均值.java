
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-18 13:53:54 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-18 13:53:54 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        double sum = 0;
        if (m <= 0) {
            System.out.println("error");
        } else {
            for (int i = 0; i < m; i++) {
                double temp = sc.nextDouble();
                sum += temp;
            }
            System.out.println(sum /= m);
        }
    }
}