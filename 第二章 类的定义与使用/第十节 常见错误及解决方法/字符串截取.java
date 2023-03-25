/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-05-02 18:01:08 
 * @Last Modified by: 2021-2022 Copyright © by 雨落倾城 All Rights Reserved.
 * @Last Modified time: 2022-05-02 18:01:29
 */

 /*
请写一个程序，从字符串"Welcome to the world of Java!”
中截取指定起始位置到结束位置的字符串并打印出来
（先接受起始位置，再接受结束位置）。若起始位置小于0，
从第0位开始截取，若结束位置大于字符串长度，截取到字符串结尾结束。
若起始位置大于字符串长度或结束位置小于0，则打印空字符串。
 */

import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = "Welcome to the world of Java!";
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > s.length()||b < 0) {
            System.out.println();
        }else if (a < 0 && b<=s.length()){
             a = 0;
             String s1 = s.substring(a,b);
            System.out.println(s1);
        }else if (a>=0 && b > s.length()){
            b = s.length();
            String s1 = s.substring(a,b);
            System.out.println(s1);
        } else if (a<0 && b>s.length()) {
            a = 0;
            b = s.length();
            String s1 = s.substring(a, b);
            System.out.println(s1);
        } else {
            String s1 = s.substring(a, b);
            System.out.println(s1);
        }
    }
}