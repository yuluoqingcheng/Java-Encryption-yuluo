/*
 * @Author: 雨落倾城 
 * @Date: 2021-12-02 13:57:15 
 * @Last Modified by: 雨落倾城
 * @Last Modified time: 2021-12-02 13:59:28
 */
public class Main {
    public static void main(String[] args) {
        // 1.定义数组
        int[][] sheet;
        // 2.分配空间
        sheet = new int[5][4];
        // 3.赋值
        sheet[0][0] = 10;
        // 4.使用
        int[][] sheet2 = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.println(sheet2[2][2]);
    }
}