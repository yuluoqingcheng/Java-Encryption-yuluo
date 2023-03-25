
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-27 22:16:34 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-27 22:16:34 
 */
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        if (time > 0) {
            int min = sc.nextInt();
            for (int i = 0; i < time - 1; i++) {
                int num = sc.nextInt();
                if (num < min) {
                    min = num;
                }
            }
            System.out.println(min);
        } else {
            System.out.println("error");
        }
    }
}
