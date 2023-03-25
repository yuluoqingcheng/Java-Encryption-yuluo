
/*
 * @Author: 雨落倾城 
 * @Date: 2021-12-18 21:36:32 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-12-18 21:36:32 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 34; i++) {
            for (int j = 0; j < 51; j++) {
                for (int k = 0; k < 101; k++) {
                    if (i + k + j == 100 && 3 * i + 2 * j + k / 2 == 100 && k % 2 == 0) {
                        System.out.print(i);
                        System.out.print(" ");
                        System.out.print(j);
                        System.out.print(" ");
                        System.out.println(k);
                    }
                }
            }

        }
    }
}