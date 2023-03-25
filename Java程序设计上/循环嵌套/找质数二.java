
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-22 11:46:17 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-22 11:46:17 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 3) {
            for (int i = 3; i < a; i++) {
                if (i > 2 && i % 2 == 0) {
                    continue;
                } else {
                    boolean flag = false;
                    for (int j = 2; j <= i - 1; j++) {
                        if (i % j == 0) {
                            flag = true;
                        }
                    }
                    if (flag == false) {
                        System.out.println(i);
                    } else {
                        continue;
                    }
                }
            }
        } else {
            System.out.println("error");
        }

    }
}