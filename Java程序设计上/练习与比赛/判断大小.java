/*
 * @Author: 雨落倾城 
 * @Date: 2022-01-10 17:31:15 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2022-01-10 17:31:15 
 */

//问题：输入两个数，打印较大的数，若数字大小相同，输出任意一个即可。
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > b) {
            System.out.println(a);
        } else if (b > a) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}