//输入一个整数，判断是不是闰年，如果是闰年，输出‘yes’；如果不是闰年，输出‘no’；如果年份不对（是负数），输出‘error’。（能被4整除且不能被100整除，或者能被400整除的年份是闰年）

import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        if(d < 0) {
            System.out.println("error");
        }else {
            if ((d % 4 == 0 && d % 100 != 0) || (d % 400) == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}