/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-04-28 09:06:07 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-04-28 09:06:07 
 */

// 写一个程序，接受一个长度为10的整数数组和一个目标整数，请找到该数组中相加之和等于目标整数的两个数字在数组中的下标并打印出来，
// 先打印低位再打印高位。这个数组中每个数字只能使用一次，最多只有一组能相加得到目标数字，且可能找不到这样的一对数字，如果找不到请打印NULL。

import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int [] i =new int[10] ;
        for(int y=0;y<10;y++){
            i [y] = scan.nextInt() ;
        }
        int u=0;
        int b = scan.nextInt() ;
        for (int n=0;n<9;n++){
            int t;
        for (t=n+1;t<10;t++) {
            if (i[n] + i[t] == b) {
                System.out.print(n+" "+t);
                u++;
                break;
            }
        }if(t!=10){
            break;
            }
        }
            if(u==0){
                System.out.print("NULL");
            }


        }
        }