
/*
 * @Author: 雨落倾城 
 * @Date: 2021-12-16 16:08:38 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-12-16 16:08:38 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] sum = new int[5];
        boolean flag = false;
        for (int x = 0; x < sum.length; x++) {
            sum[x] = scan.nextInt();
        }
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] % 2 == 0) {
                System.out.println(sum[i] + 1);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("NULL");
        }
    }
}