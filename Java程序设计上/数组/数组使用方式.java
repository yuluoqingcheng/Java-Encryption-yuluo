/*
 * @Author: 雨落倾城 
 * @Date: 2021-12-01 14:06:41 
 * @Last Modified by: 雨落倾城
 * @Last Modified time: 2021-12-01 14:14:08
 */
public class Main {
    public static void main(String[] args) {
        // 1.定义数组
        int[] scores;
        // 2.分配空间
        scores = new int[5];
        // 3.数值
        scores[0] = 15;
        scores[3] = 20;
        // 4. 使用
        int a = scores[0] + scores[3];
        System.out.println(a);
        System.out.println(scores[3]);
    }
}