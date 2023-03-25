import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        if(weight <= 0 ||height <= 0) {
            System.out.println("error");
        }else {
            if (weight/Math.pow(height,2) >= 20 && weight/Math.pow((height),2)<= 25) {
                System.out.println("健康");
            } else {
                System.out.println("不健康");
            }
        }

    }
}