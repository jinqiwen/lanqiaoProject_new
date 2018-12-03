/**
 * 最优二叉树
 */
public class OptimalBST {

    public void getBestTree(double[] P) {
        int lenP = P.length;
        double[][] C = new double[lenP+1][lenP];
        int[][] R = new int[lenP+1][lenP];
        for(int i = 1;i < lenP;i++) {
            C[i][i] = P[i];
            R[i][i] = i;
        }

        for(int d = 1;d < lenP-1;d++) {
            for(int i = 1;i < lenP-d;i++) {
                int j = i + d;
                double minval = Double.MAX_VALUE;
                int min = 0;
                for(int k = i;k <= j;k++) {
                    if(C[i][k-1] + C[k+1][j] < minval) {
                        minval = C[i][k-1] + C[k+1][j];
                        min = k;
                    }
                }
                R[i][j] = min;
                double sum = P[i];
                for(int s = i+1;s <= j;s++)
                    sum += P[s];
                C[i][j] = minval + sum;
            }
        }

        System.out.println("在最优BST中查找的平均比较次数依次为：");
        for(int i = 1;i < C.length;i++) {
            for(int j = 0;j < C[0].length;j++)
                System.out.printf("%.1f\t",C[i][j]);
            System.out.println();
        }

        System.out.println("在最优BST中子树的根表R为：");
        for(int i = 1;i < R.length;i++) {
            for(int j = 0;j < R[0].length;j++)
                System.out.print(R[i][j]+"\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        OptimalBST test = new OptimalBST();
        double[] P = {0,0.1,0.2,0.5,0.3};
        test.getBestTree(P);
    }

}