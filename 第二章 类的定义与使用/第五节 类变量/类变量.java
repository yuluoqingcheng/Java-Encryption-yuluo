/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-04-27 14:41:08 
 * @Last Modified by: 2021-2022 Copyright © by 雨落倾城 All Rights Reserved.
 * @Last Modified time: 2022-04-27 14:41:33
 */

// 一个学生对象拥有所属学院的属性，这个属性对于所有学生来说
// ，状态都是一样的，因此应该在定义类时应该被定义为类变量。因此请在下面的学生类（Main）中定义一个类变量college
// 它的值是"NSI"，并在主方法中打印出该类变量的值。

public class Main {
    // 请在此处写程序定义类变量
    static String college = "NSI";
    public static void main(String [] args){
        // 请在此处写程序打印出类变量的值
        System.out.println(Main.college);
    }
}