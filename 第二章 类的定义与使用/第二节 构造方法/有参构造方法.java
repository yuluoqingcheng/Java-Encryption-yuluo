/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-04-22 11:33:19 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-04-22 11:33:19 
 */

 /* 在一个给定的Main类中定义一个有参构造方法，该构造方法接受游戏名称（name）作为参数，并将游戏名称打印出来。在主方法中对该类进行实例化。 */
import java.util.Scanner;
public class Main{
    // 请在此处定义构造方法

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        new Main(name);

        // 请在此处写程序对类进行实例化
    }
    public Main(String name) {
        System.out.println(name);
    }
}