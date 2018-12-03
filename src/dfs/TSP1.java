package dfs;

import javax.sound.midi.Soundbank;

/**
 * 旅行售货员问题
 */
public class TSP1 {

    static int n = 4;//图G的顶点数
    static int[] x; //当前解
    static int[] bestx; //最优解
    static int[][] a;//图G的邻接矩阵
    static int cc; //当前费用
    static int bestc;//最优费用
    static int NoEdge = 0;//无边标记，默认为0


    public static void main(String[] args) {
        x= new int[]{1, 2, 3, 4,1};
        a = new int[][]{
                {0,0,0,0,0},
                {0,0,30, 6, 4},
                {0,30, 0, 5, 10},
                {0,0,5, 0, 20},
                {0,4, 10, 20, 0}
        };
        bestx=new int[n+1];
        Backtrack(1);
        for (int i = 0; i <bestx.length ; i++) {
            System.out.println(bestx[i]);
        }
    }

    private static void Backtrack(int i) {
        if (i == n)
        {
            if (a[x[n-1]][x[n]] != 0 && a[x[n]][1] != 0 &&
                    (cc + a[x[n-1]][x[n]] + a[x[n]][1] < bestc || bestc == 0))
            {
                for (int j = 1; j <= n; j++) bestx[j] = x[j];
                bestc = cc + a[x[n-1]][x[n]] + a[x[n]][1];
            }
        }
        else
        {
            for (int j = i; j <= n; j++)
            {
                // 是否可进入x[j]子树?
                if (a[x[i-1]][x[j]] != 0 && (cc + a[x[i-1]][x[i]] < bestc || bestc == 0))
                {
                    // 搜索子树
                    Swap(x[i], x[j]);
                    cc += a[x[i-1]][x[i]];  //当前费用累加
                    Backtrack(i+1);			//排列向右扩展,排列树向下一层扩展
                    cc -= a[x[i-1]][x[i]];
                    Swap(x[i], x[j]);
                }
            }
        }

        }


    private static void Swap(int i, int j) {
        int t = x[i];
        x[i]=x[j];
        x[j]=t;
    }

}
