//输入两个值，分别是横坐标和纵坐标，根据符号判断象限。若在第一象限，输出‘1'；若在第二象限，输出‘2'；若在第三象限，输出‘3'；若在第四象限，输出‘4'，其他情况输出“error”

import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        if(d1 > 0 && d2 > 0) {
            System.out.println("1");
        }else if(d1 < 0 && d2 > 0) {
            System.out.println("2");
        }
        else if(d1 > 0 && d2 < 0) {
            System.out.println("4");
        }
        else if(d1 < 0 && d2 < 0) {
            System.out.println("3");
        }else  {
            System.out.println("error");
        }
    }
}