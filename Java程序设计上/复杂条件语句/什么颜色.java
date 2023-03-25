//在计算机中我们使用红绿蓝三个颜色的色值来表示颜色.
//他们的取值范围均为0-255。如果三者皆为0，则表示黑色；
//如果三者皆为255，则表示白色；如果红色取值（第一个数）为255，其他两个颜色为0，则为红色；如果绿色取值（）第二个数为255，其他颜色取值为0，则为绿色；如果蓝色取值（第三个数）
//为255，其他两个颜色为0，则为蓝色。请写一个程序，使用三个变量保存红绿蓝的取值，

import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();

        if(d1 == 0 && d2 == 0 && d3 == 0) {
            System.out.println("black");
        }else if(d1 == 255 && d2 == 255 && d3 == 255){
            System.out.println("white");
        }
        else if(d1 == 255 && d2 == 0 && d3 == 0){
            System.out.println("red");
        }else if(d1 == 0 && d2 == 255 && d3 == 0) {
            System.out.println("green");
        }else if(d1 == 0 && d2 == 0 && d3 == 255) {
            System.out.println("blue");
        }else {
            System.out.println("other color");
        }
    }
}