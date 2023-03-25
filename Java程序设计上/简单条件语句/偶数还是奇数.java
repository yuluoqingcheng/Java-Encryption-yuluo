import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if(s % 2 == 0) {
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }
}