
/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-27 22:16:38 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-27 22:16:38 
 */
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("error");
        } else if (score < 60) {
            System.out.println("不合格");
        } else if (score >= 60 && score < 80) {
            System.out.println("初级");
        } else if (score >= 80 && score < 95) {
            System.out.println("中级");
        } else if (score >= 95 && score <= 100) {
            System.out.println("高级");
        }
    }
}
