
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-18 13:54:22 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-18 13:54:22 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int max = 0;
        if (m <= 0) {
            System.out.println("error");
        } else {
            for (int i = 0; i < m; i++) {
                int temp = sc.nextInt();
                if (i == 0) {
                    if (temp < 0) {
                        max = temp;
                    } else {
                        if (temp >= max) {
                            max = temp;
                        }
                    }
                } else {
                    if (temp >= max) {
                        max = temp;
                    }
                }
            }
            System.out.println(max);
        }
    }
}