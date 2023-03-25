
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-18 13:50:22 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-18 13:50:22 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 11; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }

        }
        System.out.println(sum);
    }
}