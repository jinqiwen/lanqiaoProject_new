import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class LanQiao_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String [][]str=new String[N][2];
        for(int i=0;i<N;i++){
            for(int j=0;j<2;j++){
                str[i][j]=sc.next();
            }
        }
        int H;

        double r;
        for (int i = 0; i < str.length; i++) {
            if("M".equals(str[i][0])){
                r=Double.parseDouble(str[i][1])/1.09;
                BigDecimal b=new BigDecimal(r).setScale(2, RoundingMode.HALF_UP);
                System.out.println(b);
            }else{

                r=Double.parseDouble(str[i][1])*1.09;
                BigDecimal b=new BigDecimal(r).setScale(2, RoundingMode.HALF_UP);
                System.out.println(b);
            }

        }

    }
}
