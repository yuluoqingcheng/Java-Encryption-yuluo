/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-05-09 09:20:59 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-05-09 09:20:59 
 */

// 已有一个类Animal，该类定义如下图所示。请定义一个继承Animal类的Main类
// 该类重载父类Animal的eat()方法，能接受一个字符串类型的参数食物（food）。
// 从命令行接受一个字符串作为Main的实例的name变量的值，一个作为食物的值。
// 用该实例调用eat方法，若该实例的name变量的值是Lily，传递的食物是orange则会打印"Lily在吃orange"。

public class Main extends Animal{
    public Main(String name){
        super(name);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name=scan.next();
        String n=scan.next();
        Main main=new Main(name);
        main.eat(n);
    }
    public void eat(String food){
        System.out.println(this.name+"在吃"+food);
    }
}