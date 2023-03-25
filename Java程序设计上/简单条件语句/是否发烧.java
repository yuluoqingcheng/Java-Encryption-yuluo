import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if(a > 37) {
            System.out.println("发烧");
        }else {
            System.out.println("正常");
        }
    }
}