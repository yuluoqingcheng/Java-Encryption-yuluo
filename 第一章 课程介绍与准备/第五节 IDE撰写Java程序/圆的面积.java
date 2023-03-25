/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-04-28 09:02:48 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-04-28 09:02:48 
 */

// 写一个程序，接受一个数字作为圆的半径，计算出它的面积并打印出来，圆周率为3.14。

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