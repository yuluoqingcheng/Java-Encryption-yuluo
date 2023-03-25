//写一个程序，接受三个数字，找到其中最大的打印出来。
//例如：输入30 40 50；输出50。如果有相等的最大数，输出这个数。

//第一种写法
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(a>b?(a==c)?a:(c>a)?c:a:(a==b)?(a>c)?a:(a==c)?a:c:(b>c)?b:(b==c)?b:(c>b)?c:b);
    }
}

//第二种写法
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = a;
    if(a>d){
        d = b;
    }
    if (c > d ){
        d =c;
    }
    System.out.println(d);
    }
}