import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        if (a == 0) {
            System.out.println(a);
        } else {
            if (a >= 0) {
                while (temp > 0) {
                    a = temp % 10;
                    temp = temp / 10;
                    System.out.print(a);
                }
            } else {
                String w = new String("-");
                a = a * -1;
                temp = temp * -1;
                while (temp > 0) {
                    a = temp % 10;
                    temp = temp / 10;
                    w = w + a;
                }
                System.out.println(Integer.parseInt(w));
            }
        }
    }

}