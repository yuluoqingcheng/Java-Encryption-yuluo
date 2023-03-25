/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-05-02 17:59:18 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-05-02 17:59:18 
 */
// 写一个程序，将字符串"Welcom to the world of Java!"中指定的字符换成别的指定字符，
// 并将新字符串打印出来。注意：读取这两个字符的时候，一个字符一行读取。

import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = "Welcome to the world of Java!";
        String s1 = s.replaceAll(sc.nextLine(),sc.nextLine());
        System.out.println(s1);
    }
}