import java.util.Scanner;

public class LanQiao_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int time=0;
        int sum=0;
        for (int i=M;i<=N;i++){
            if(isPrimeNumber(i)){
                time+=1;
                sum+=i;
            }
        }
        System.out.println(time+" "+sum);
    }
    //判断一个数是否是素数
    static  boolean isPrimeNumber(int num){
        if(num==0|| num ==1) return false;
        if(num==2) return true;
        //清楚为什么i从3开始，想想如果i=0,1,2会导致什么
        for (int i = 2; i <= Math.sqrt(num); i++) {
          if(num%i==0){
            return false;
          }
        }
        return  true;
    }
}

