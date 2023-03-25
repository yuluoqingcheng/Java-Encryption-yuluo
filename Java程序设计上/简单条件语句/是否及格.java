import java.util.Scanner;
public class Main{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        if(d > 100 || d < 0) {
            System.out.println("error");
        }else {
            if (d >= 60) {
                System.out.println("及格");
            }else {
                System.out.println("不及格");
            }
        }

    }
}