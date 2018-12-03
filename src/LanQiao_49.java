import java.util.Scanner;

public class LanQiao_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] a=new int[N];//用于存储元素值
        int[] b=new int[N];//用于存储元素对应的个数
        for (int i = 0; i <N ; i++) {
            a[i]=sc.nextInt();
            b[i]=1;
        }
        for(int i=0;i<N;i++){
            for (int j = i+1; j <N ; j++) {
                  if(a[i]==a[j]){
                        b[i]++;
                  }
            }
        }
        int max=0;
        int maxValue=0;
        for (int i = 0; i <b.length ; i++) {
            if(b[i]>max){
                  max =b[i];
                  maxValue=a[i];
            }
        }
        System.out.print(maxValue+" "+max);
    }
}
