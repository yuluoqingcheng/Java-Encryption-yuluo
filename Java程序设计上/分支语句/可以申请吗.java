import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean xi = sc.nextBoolean();
        int pai = sc.nextInt();

            if(pai>10){
                System.out.println("不可以");
            }else if(pai<=0){
                System.out.println("error");
            }else {
                if(xi){
                    System.out.println("可以");
                }else{
                System.out.println("不可以");
                }
            }
    }
}
