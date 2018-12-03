package Leetcode;

import java.util.Scanner;

public class ThreeMagic {
    public static void main(String[] args) {
        ThreeMagic mn = new ThreeMagic();
        int maze[][] = new int[105][105];
        {
            Scanner sr = new Scanner(System.in);
            int n = sr.nextInt();
            int m = sr.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    maze[i][j] = sr.nextInt();
                }
            }
            if (n < 3 || m < 3) {
                System.out.println("0");
            }
            int ans = 0;
            for (int i = 1; i <= n - 2; i++) {
                for (int j = 1; j <= m - 2; j++) {
                    if (mn.fit(i, j)) ans++;
                }
            }
            System.out.println(ans);
        }
    }

    public boolean fit(int x, int y) {
        int maze[][] = new int[105][105];
        int a[] = new int[10];
        a[1] = maze[x][y] + maze[x + 1][y] + maze[x + 2][y];
        a[2] = maze[x][y + 1] + maze[x + 1][y + 1] + maze[x + 2][y + 1];
        a[3] = maze[x][y + 2] + maze[x + 1][y + 2] + maze[x + 2][y + 2];
        a[4] = maze[x][y] + maze[x][y + 1] + maze[x][y + 2];
        a[5] = maze[x + 1][y] + maze[x + 1][y + 1] + maze[x + 1][y + 2];
        a[6] = maze[x + 2][y] + maze[x + 2][y + 1] + maze[x + 2][y + 2];
        a[7] = maze[x][y] + maze[x + 1][y + 1] + maze[x + 2][y + 2];
        a[8] = maze[x][y + 2] + maze[x + 1][y + 1] + maze[x + 2][y];
        for (int i = 1; i <= 8; i++) {
            if (a[i] != a[1]) {
                return  false;
            }
        }
        return  true;
    }
}
