/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-04-22 16:16:51 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-04-22 16:16:51 
 */

//  在游戏类Main中定义一个成员变量SCREEN_WIDTH，存储着游戏窗口的宽度，值是400。对Main类进行实例化并打印出游戏窗口宽度。

public class Main {

    // 请在此处定义成员变量
    int SCREEN_WIDTH = 400;
    public static void main(String [] args){
        // 请在此处对类进行实例化并打印成员变量的值
        new Main();
    }
    public Main() {
        System.out.println(this.SCREEN_WIDTH);
    }
}