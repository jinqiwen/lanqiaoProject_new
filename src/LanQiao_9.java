import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class LanQiao_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
       if(a+b>c&& a+c>b&& a+c>b){
           double perimeter=(double)(a+b+c);
         double s = (perimeter)/2;
         double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
         BigDecimal result1=new BigDecimal(area).setScale(2, BigDecimal.ROUND_HALF_UP);
         BigDecimal result2=new BigDecimal(perimeter).setScale(2,BigDecimal.ROUND_HALF_UP);
         System.out.println("area = "+result1+"; perimeter = "+result2);
       }else {
           System.out.println("These sides do not correspond to a valid triangle");
       }
      /*  System.out.println(Math.sqrt(64));*/

    }

}
