/*
 * @Author: THEME MADE BY 雨落倾城 @ yuluoqc 
 * @Date: 2022-05-02 17:45:38 
 * @Last Modified by:   2021-2022 Copyright © by 雨落倾城 All Rights Reserved. 
 * @Last Modified time: 2022-05-02 17:45:38 
 */
// 给Main类定义两个成员方法
// 一个叫做getNumbers，它能接受10个用户输入的整数并存到数组中之后返回；
// 一个叫做findMax，它能从给定的整数数组中找到最大的数字并返回。



import java.util.Scanner;

public class Main {
    //成员变量
    Scanner scan=new Scanner(System.in);
    //请在此处定义成员方法getnumbers
    //它能接收10个用户输入的整数并存到数组之后返回
    public int[] getNumbers(){
        int[] numbers= new int[10];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=scan.nextByte();
        }
        return numbers;
    }
    //定义成员方法findMax
    public int findMax(int[] numbers){
        int max =numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Main m=new Main();
 // 调用getNumber 获得返回值放到numbers数组里
        int[] numbers= m.getNumbers();
       int result=m.findMax(numbers);
        System.out.println(result);
    }
}