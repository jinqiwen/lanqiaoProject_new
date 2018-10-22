import java.math.BigDecimal;
import java.math.RoundingMode;

public class  shiyan{
    public static void main(String[] args) {
        double area = 7.1545440106270926;
        int perimeter = 13;
        BigDecimal result1=new BigDecimal(area).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(result1);
    }
 /*public static void main(String[] args) {
     BigDecimal decimal = new BigDecimal(7.1545440106270926);
     System.out.println(decimal);
     BigDecimal setScale = decimal.setScale(2,BigDecimal.ROUND_HALF_DOWN);
     System.out.println(setScale);

     BigDecimal setScale1 = decimal.setScale(2,BigDecimal.ROUND_HALF_UP);
     System.out.println(setScale1);
 }*/
}