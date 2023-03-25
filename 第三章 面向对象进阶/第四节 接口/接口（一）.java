/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-05-09 09:24:30 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-05-09 09:24:30 
 */

// 已导入Scanner类可以直接使用
// 已有接口Animal，可以直接使用
public class Main implements Animal{
    @Override
    public void eat(String food) {
        System.out.println("在吃"+food);
    }
    public static void main(String[] args) {
     Main main= new Main();
     Scanner scan=new Scanner(System.in);
     String food=scan.next();
     main.eat(food);
    }
}