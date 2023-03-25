/*
 * @Author: 雨落倾城 
 * @Date: 2021-12-02 14:59:18 
 * @Last Modified by:   雨落倾城 
 * @Last Modified time: 2021-12-02 14:59:18 
 */
public class Main {
    public static void main(String[] args) {
        int[][] sheet2 = new int[5][4];

        for (int x = 0; x < sheet2.length; x++) {
            for (int y = 0; y < sheet2[x].length; y++) {
                System.out.print(sheet2[x][y] + " ");
            }
        }
        System.out.println();
    }
}