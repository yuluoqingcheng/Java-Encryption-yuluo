/*
 * @Author: 雨落倾城 
 * @Date: 2022-01-08 12:20:19 
 * @Last Modified by: 雨落倾城
 * @Last Modified time: 2022-01-08 12:21:00
 */

/*
题目：
 * 写一个程序接受用户输入圆的半径，输出圆的面积。圆半径应为大于0的整数。
 * 当用户输入的半径不合法时，提示"error"(不含双引号)。本题圆周率为3.14。
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double d = 3.14;
        double s = d * (r * r);
        if (r > 0) {
            System.out.println(s);
        } else {
            System.out.println("error");
        }
    }
}