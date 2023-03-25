
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-18 13:53:36 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-18 13:53:36 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = getMaxCommonDivisor(a, b);

        System.out.print(m);
    }

    private static int getMaxCommonDivisor(int a, int b) {
        // 使a小,b大
        if (a > b) {
            // 两个数交换
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int temp = a;
        while (temp > 0) {
            if (a % temp == 0 && b % temp == 0) {
                break;
            }
            temp--;
        }
        return temp;
    }

}