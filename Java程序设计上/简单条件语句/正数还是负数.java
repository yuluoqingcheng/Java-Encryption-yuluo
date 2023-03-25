import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        System.out.println(s<0?"负数":s==0?0:"正数");
    }
}