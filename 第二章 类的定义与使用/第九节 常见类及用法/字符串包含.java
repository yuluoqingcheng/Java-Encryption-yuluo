/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-05-02 18:00:06 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-05-02 18:00:06 
 */
// 写一个程序，接受两个字符串，请判断这两个字符串中是否有一样的单词，如果有则打印true，否则打印false。

import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str2 = scan.nextLine();
        String[] s = str.split(" ");
        String[] s2 = str2.split(" ");
        boolean flag = false;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s2.length ; j++) {

                if(s[i].length() > s2[j].length()) {
                    if (s[i].contains(s2[j])) {
                        flag = true;
                        break;
                    }
                }else  if(s[i].length() < s2[j].length()) {
                    if (s2[j].contains(s[i])) {
                        flag = true;
                        break;
                    }
                }else{
                    if (s[i].contains(s2[j])) {
                        flag = true;
                        break;
                    }
                }
            }
        }
        System.out.println(flag);
    }
}