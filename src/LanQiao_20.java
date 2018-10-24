import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class LanQiao_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
       /* long N=-1223;*/
        char[] c=String.valueOf(N).toCharArray();

        int sum=0;
        double bei=0;
        if(Math.abs(N)%2==0){
            bei += 1;
        }
        int len= c.length ;
        if(c[0]=='-'){
            bei += 0.5;
            len = c.length - 1;
        }
        for (int i = 0; i < c.length; i++) {
            if(c[i]=='2'){
                sum += 1;
            }
        }
        double result=(double) sum/len*bei*2*100;
            BigDecimal b= new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
            System.out.println(b+"%");

    }
}
