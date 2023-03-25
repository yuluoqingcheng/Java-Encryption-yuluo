import java.util.Scanner;
public class Main{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
            if (d > 80) {
                System.out.println("超速了");
            }else {
                System.out.println("没超速");
            }

    }
}