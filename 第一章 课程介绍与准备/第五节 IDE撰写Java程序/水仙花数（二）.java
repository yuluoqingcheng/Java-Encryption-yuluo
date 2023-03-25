/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-04-28 09:05:26 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-04-28 09:05:26 
 */

// 写一个程序，该程序可以找出所有的⽔仙花数并打印出来。
// ⽔仙花数是指⼀个3位整数，它的每⼀位的3次⽅之和等于这个数字。
// 例如：153 = 1^3 + 5^3 + 3^3。注意：使用println()而不是print()。

public class Main {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            int x =i/100;
            int y =i/10%10;
            int z =i%10;
            if(i==x*x*x+y*y*y+z*z*z)
                System.out.println(i);
        }

    }
}