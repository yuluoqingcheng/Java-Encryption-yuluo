/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-18 13:51:15 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-18 13:51:15 
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int x = i / 100;
            int y = i / 10 % 10;
            int z = i % 10;
            if (i == x * x * x + y * y * y + z * z * z)
                System.out.println(i);
        }

    }
}