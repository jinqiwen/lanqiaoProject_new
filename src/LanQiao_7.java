import java.math.BigDecimal;
import java.util.Scanner;

public class LanQiao_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[][] s=new int[t][2];
        for(int i=0;i<t;i++){
            for(int j=0;j<2;j++){
                s[i][j]=sc.nextInt();
            }

        }
        int H=0;
        int W=0;
        double stand;
        String result;
        for(int i=0;i<t;i++){
           H=s[i][0];
           W=s[i][1];
           stand=(H-100)*0.9*0.1;
           System.out.println(stand);
            double chazhi=sub((double)W/2,stand);
            double rate=mul(stand ,0.1 );
            result= chazhi<rate &&chazhi>0?"You are wan mei!" :chazhi> rate?"You are tai pang le!":"You are tai shou le!";
            System.out.println(result);
        }
    }
    /**
     * double 相减
     * @param d1
     * @param d2
     * @return
     */
    public static double sub(double d1,double d2){
        BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.subtract(bd2).doubleValue();
    }
    /**
     * double 乘法
     * @param d1
     * @param d2
     * @return
     */
    public static double mul(double d1,double d2){
        BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.multiply(bd2).doubleValue();
    }


}
