import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        switch(year){
            case 1:
            System.out.println("1L");
            break;
            case 2:
            System.out.println("2L");
            break;
            case 3:
            System.out.println("3L");
            break;
            case 4:
            System.out.println("4L");
            break;
            case 5:
            System.out.println("5L");
        }
    }
}