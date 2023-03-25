/*
 * @Author: 雨落倾城 
 * @Date: 2021-11-22 11:50:57 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-11-22 11:50:57 
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 33; j++) {
                int z = 100-i-j;
                if (z%3==0&&5*i+3*j+z/3==100) {
                    System.out.println(i+" "+j+" "+z);
                }
            }
        }
    }
}