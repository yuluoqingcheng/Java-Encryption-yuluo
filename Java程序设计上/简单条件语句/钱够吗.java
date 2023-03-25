import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int time = sc.nextInt();
        if (time<0){
            System.out.println("error");
        } else if (time >10000){
            System.out.println("够");
        } else {
            System.out.println("不够");
        }
    }
}