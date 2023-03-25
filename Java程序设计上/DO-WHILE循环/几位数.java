
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-18 13:54:54 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-18 13:54:54 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int sum = 0;
        if (a > 0) {
            while (temp > 0) {
                a = temp % 10;
                temp = temp / 10;
                sum++;
            }
            System.out.println(sum);
        } else {
            temp = temp * -1;
            a = a * -1;
            while (temp > 0) {
                a = temp % 10;
                temp = temp / 10;
                sum++;
            }
            System.out.println(sum);
        }
    }
}