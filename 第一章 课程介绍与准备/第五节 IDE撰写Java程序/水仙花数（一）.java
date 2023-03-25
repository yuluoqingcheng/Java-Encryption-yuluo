/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-04-28 09:04:51 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-04-28 09:04:51 
 */

// 写一个程序，接受一个3位整数作为输入，判断该数字是否是水仙花数。
// ⽔仙花数是指⼀个3位整数，它的每⼀位的3次⽅之和等于这个数字。
// 例如：153 = 1^3 + 5^3 + 3^3。如果是打印"yes"，如果不是打印"no"。
// 如果数字不是3位整数，打印error。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 100 || a > 999) {
            System.out.println("error");
        } else {
            int x = a / 100;
            int y = a / 10 % 10;
            int z = a % 10;
            if (a == x * x * x + y * y * y + z * z * z) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}