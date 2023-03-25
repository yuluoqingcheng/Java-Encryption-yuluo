import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        for (int i = 0; i < 5; i++) {
            a -= 1;
            System.out.println(a);
        }

    }
}