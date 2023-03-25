import java.util.Scanner;

public class duwell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("九九乘法表");
        for (int a = 0; a <= 9; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(b + "*" + a + "=" + a * b + " ");
            }
            System.out.println();
        }
    }
}