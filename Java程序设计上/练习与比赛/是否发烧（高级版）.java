/*
 * @Author: 雨落倾城 
 * @Date: 2022-01-11 23:00:22 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2022-01-11 23:00:22 
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a < 25 || a > 44) {
            System.out.println("体温不正常，请输入25，小于44的体温");
        } else if (a > 37 || a < 43) {
            System.out.println("发烧");
        } else if (a < 35 || a > 33) {
            System.out.println("低烧");
        } else if (a < 36.5 || a > 35) {
            System.out.println("正常");
        }
    }
}