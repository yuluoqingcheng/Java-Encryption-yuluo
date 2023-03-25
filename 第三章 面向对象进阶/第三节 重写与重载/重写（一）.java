/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-05-09 09:10:27 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-05-09 09:10:27 
 */

// 已有一个类Animal，该类定义如下图所示。
// 请定义一个继承Animal类的Main类，该类重写父类
// Animal的eat()方法，能打印出“Main正在吃饭
// "。请在主方法中对main类进行实例化并调用eat方法。注意：Main类的构造方法也要定义。

// 已有Animal类可以直接使用
public class Main extends Animal{
    public Main(String name){
        super(name);
    }
    public static void main(String[] args) {
        Main main=new Main("Main");
        main.eat();
    }
    public void eat(){
        System.out.println(this.name+"正在吃饭");
    }
}