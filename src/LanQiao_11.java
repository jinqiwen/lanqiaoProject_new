import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class LanQiao_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String C=sc.next();
     /*   int N =11;
        String C="a";*/
        double length=(double)N/2;
        int len = (int) Math.round(length);
        for (int i = 0; i <len ; i++) {
            for (int j = 0; j <N ; j++){
                System.out.print(C);

            }
            System.out.println();
        }
    }
}
