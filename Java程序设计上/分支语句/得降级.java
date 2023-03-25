import java.util.Scanner;
public class Main{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x < 0 || y < 0) {
            System.out.println("error");
        } else if (x <= y) {
            if (x < 4) {
                System.out.println("正常");
            } else {
                if (y < 6) {
                    System.out.println("降级可跟班");
                } else {
                    System.out.println("降级");
                }
            }
        } else if (x > y) {
            System.out.println("error");
        }
    }
}