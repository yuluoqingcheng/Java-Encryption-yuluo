
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-27 22:16:23 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-27 22:16:23 
 */
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 0 || age > 120) {
            System.out.println("error");
        } else if (age >= 18) {
            System.out.println("成年");
        } else {
            System.out.println("未成年");
        }
    }
}
