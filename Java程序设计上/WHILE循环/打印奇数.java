import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a  < b) {
            if(b%2==1 || b%2==-1) {
                System.out.println(b);
            }
            b--;
        }

    }
}