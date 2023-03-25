//输入三个值作为三角形的三条边，判断是否可以构成三角形，如果可以打印‘yes’，如果不可以打印‘no’，如果有边长小于等于0，打印‘error’。（三角形的两边之和大于第三边）

import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("error");
        } else {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}