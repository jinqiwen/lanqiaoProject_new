import java.util.Scanner;

public class LanQiao_39 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String p1=s.substring(0,8);
        String p2=s.substring(8,16);
        String p3=s.substring(16,24);
        String p4 = s.substring(24, 32);
        int sum = 0;
        for (int i = p1.length()-1,j=0; i >-1; i--,j++) {
             if(p1.charAt(i)=='1'){
                  sum +=Math.pow(2,j);
             }
        }
        System.out.print(sum+".");
        sum=0;
        for (int i = p2.length()-1,j=0; i >-1; i--,j++) {
            if(p2.charAt(i)=='1'){
                sum +=Math.pow(2,j);
            }
        }
        System.out.print(sum+".");
        sum=0;
        for (int i = p3.length()-1,j=0; i >-1; i--,j++) {
            if(p3.charAt(i)=='1'){
                sum +=Math.pow(2,j);
            }
        }
        System.out.print(sum+".");
        sum=0;
        for (int i = p4.length()-1,j=0; i >-1; i--,j++) {
            if(p4.charAt(i)=='1'){
                sum +=Math.pow(2,j);
            }
        }
        System.out.print(sum);
    }
}
