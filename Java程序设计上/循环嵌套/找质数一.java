
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-22 11:45:46 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-22 11:45:46 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 3; i < 100; i = i + 1) {
            int j;
            for (j = 2; j < i; j = j + 1) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                System.out.println(i);
            }
        }
    }
}