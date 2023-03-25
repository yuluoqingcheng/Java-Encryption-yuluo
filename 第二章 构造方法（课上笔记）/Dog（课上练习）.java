/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-04-22 11:31:39 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-04-22 11:31:39 
 */

public class Dog {
    //成员变量 属性
    //狗的颜色
    String color;
    //姓名
    String name;
    //年龄
    int age;
    //true 卷毛狗 false;直毛狗
    boolean juan;

    //成员方法 行为 狗类会叫的行为
    public void jiao(){
        System.out.println("汪汪汪");
        System.out.println("汪汪汪");
    }

public void chi(){
    System.out.println("狗要吃饭啦！");
}

//主方法
public static void main(String[] args) {
    //类 -> 实例化 -> 对象
    //从狗类里创建一个小狗
    Dog xh = new Dog();
   //给这只狗起个名字
    xh.name ="小花";
    xh.age = 2;
    xh.color = "绿色";
    xh.juan = true;
    //让小狗叫一声
    xh.jiao();
    xh.jiao();
    xh.chi();
    //看看狗叫什么名字
    System.out.println("狗的名字是"+xh.name);
    System.out.println("狗的年龄"+xh.age);
    System.out.println("狗的颜色"+xh.color);
    System.out.println("狗是不是卷毛"+xh.juan);
    }
}