/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-04-22 16:19:56 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-04-22 16:19:56 
 */

// 有一个类Main，为该类定义一个成员方法getName()，该方法能将类的成员变量name的值返回，随后在主方法中调用该类并将其返回值保存到变量中再打印出来。

import java.util.Scanner;
public class Main {
    String name;

    public Main(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    // 请在此处定义成员方法

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        // 请在此处对类进行实例化并调用成员方法和打印成员方法的返回值
        Main m = new Main(name);
        String n  = m.getName();
        System.out.println(n);

    }
}