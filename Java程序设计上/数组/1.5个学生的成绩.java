
/*
 * @Author: 雨落倾城 
 * @Date: 2021-12-16 16:07:29 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-12-16 16:07:29 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] asd = new int[5];
        for (int i = 0; i < asd.length; i = i + 1) {
            asd[i] = sc.nextInt();
        }
        for (int i = 0; i < asd.length; i = i + 1) {
            System.out.println(asd[i]);
        }
    }
}