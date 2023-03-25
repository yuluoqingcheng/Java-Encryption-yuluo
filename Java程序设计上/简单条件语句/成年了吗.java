import java.util.Scanner;
public class Main{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 0 || age > 120) {
            System.out.println("error");
        }else {
            if (age >= 18) {
                System.out.println("成年");
            } else {
                System.out.println("未成年");
            }
        }

    }
}