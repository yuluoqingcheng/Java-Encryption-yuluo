/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-18 13:49:39 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-18 13:49:39 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = a + 1; i < b; i++) {

            sum += i;

        }
        System.out.println(sum);
    }
}