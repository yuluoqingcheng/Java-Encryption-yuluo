/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-04-28 09:03:14 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-04-28 09:03:14 
 */

// 写一个程序，接受用户输入的两个数字作为三角形的底边长度和高，计算出三角形面积并打印出来。

import java.util.Scanner;
public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        double a = sc.nextDouble();
        double b = sc.nextDouble();
    System.out.println(a*b/2);
    }
}