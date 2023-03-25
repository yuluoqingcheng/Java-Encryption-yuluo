/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-05-02 17:59:45 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-05-02 17:59:45 
 */
// 写一个程序，检测给定的字符串s是否以给定字符串head开头，如果是打印出true，否则打印false。

import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String head = scan.nextLine();

        System.out.println(str.startsWith(head) ? true : false);

    }
}