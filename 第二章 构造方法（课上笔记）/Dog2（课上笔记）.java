/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-04-22 15:20:32 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-04-22 15:20:32 
 */
import java.util.jar.Attributes.Name;

public class Dog2 {
    String name;
    String color;
    int num ;
    }

public Dog2(String name,String clor){
    this.name =name;
    this.color = color;
    this.num = 4;
    }

//最简单的方法（没有参数，没有返回值）
public void chi(){
System.out.println("吃饭");
    }

//有参数的方法，没有返回值
public void chiLingShi(String LingShi){
    System.out.println("我正在吃"+LingShi);
    }

//有参数，有返回值
//权限修饰符 返回值 方法名 参数
public int add(int a,int b){
    int c = a + b; //C是得数
     return c ;
    }

