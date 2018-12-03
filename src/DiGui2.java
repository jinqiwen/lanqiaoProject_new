/**
 * 递归-杨辉三角形
 */
public class DiGui2 {
    public static void main(String[] args) {
        int length=10;
        for (int i = 1; i <= length; i++) {

            // 打印空格
            for (int j = 1; j <= length-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4d",yanghui(i,j));
            }
            System.out.println();
        }
    }
    /*public static int  yanghui(int g[][],int n ){*/
    public static int  yanghui(int  x,int y ) {//指定行和列
      /*  if(x==0||y==0){
            return 1;
        }
       return yanghui(x-1 ,y-1)+yanghui(x-1,y);

    }*/

            if (y == 0 || x == y) {   // 递归终止条件
                return 1;
            } else {
                // 递归调用，缩小问题的规模
                return yanghui(x - 1, y) + yanghui(x - 1, y-1);
            }
        }

}
