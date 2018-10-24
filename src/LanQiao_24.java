import java.util.Scanner;

public class LanQiao_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int len=String.valueOf(N).length();
        char[] c=String.valueOf(N).toCharArray();
        int sum = 0;
        for (int i = 0; i <len ; i++) {
            sum+= Integer.parseInt(String.valueOf(c[i]));
        }
        System.out.println(len+" "+sum);
    }
}
