
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-18 13:54:36 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-18 13:54:36 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 48) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}