/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-05-02 17:58:50 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-05-02 17:58:50 
 */
// 查阅字符串的方法，找到可以将字符串前后的空白去除的方法
// 并使用该方法将用户输入的字符串的前后空白去除后打印出来。

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s.trim();
        System.out.println(s1);
    }

}