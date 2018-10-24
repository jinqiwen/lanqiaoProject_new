import java.util.Scanner;

public class LanQiao_26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String N = sc.next();
        String[] s=N.split("/");
        int fenzi = Integer.parseInt(s[0]);
        int fenmu = Integer.parseInt(s[1]);
        int g=gcd(fenzi,fenmu);
       /* 这里是进行直接约分的方式，但算法还是不高效，
         如果使用下面的辗转相除先求公约数的方式，
         效率会高很多
        int max =  Math.max(fenzi, fenmu);
        for(int i=1;i<=max;i++){
                if(fenzi%i==0&&fenmu%i==0){
                    fenzi=fenzi/i;
                    fenmu=fenmu/i;
                }
         }*/
         System.out.println(fenzi/g+"/"+fenmu/g);
    }
    /**
     * 求俩个数的最大公约数
     * 这里使用辗转相除法
     */
    static int gcd(int a,int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
