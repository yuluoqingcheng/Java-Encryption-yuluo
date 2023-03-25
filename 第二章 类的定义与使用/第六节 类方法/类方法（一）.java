/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-04-27 14:49:26 
 * @Last Modified by: 2021-2022 Copyright © by 雨落倾城 All Rights Reserved.
 * @Last Modified time: 2022-04-27 14:49:52
 */

//  Math类有一个类方法max，它可以接收两个整数作为参数返回大的那个整数，
//  请你写一个程序，接受两个整数，使用Math类的max方法，
//  获得其中大的整数并打印出来。

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        System.out.println(Math.max(a1,a2));
    }
}