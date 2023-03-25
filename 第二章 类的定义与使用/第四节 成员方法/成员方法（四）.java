/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-04-22 16:20:26 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-04-22 16:20:26 
 */

// 有一个Main类，为该类定义一个成员方法，该方法（方法名自拟）
// 能将给定的两个整数的平方加和后返回。请在主方法中接受两个整数，
// 并尝试调用刚才定义的成员方法，并将该方法返回的数据打印出来。


import java.util.Scanner;
public class Main {
    String name;

    public int sprt(int a, int b) {
        return a*a + b*b;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();

        // 请在此处对类进行实例化并调用成员方法和打印成员方法的返回值
        Main m = new Main();
        System.out.println(m.sprt(x1,x2));

    }
}