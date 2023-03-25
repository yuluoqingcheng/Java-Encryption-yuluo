/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-04-22 16:17:26 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-04-22 16:17:26 
 */

//  请在给定的游戏类Main中定义一个成员变量用来存储游戏名称（name），该成员变量将在对类进行实例化时被赋值，并且会被打印出来。请在主方法中接受一个游戏名，并在对类进行实例化时将游戏名传递给构造方法。

import java.util.Scanner;

public class Main {

    // 请在此处定义成员变量
    String name;
    public static void main(String [] args){
        // 请在此处对类进行实例化并打印成员变量的值
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        new Main(name);
        
    }
    public Main(String name ) {
       this.name = name;
        System.out.println(this.name);
    }
}