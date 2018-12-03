import java.util.*;
public class Main{
    static int sum =0;
    public static void f(int a[],int k){
        if(k==a.length-1){
            if(t(a))
                sum +=1;
            return;
        }
        for(int i=k;i<a.length; i++){
            System.out.println(Arrays.toString(a));
            {int t=a[k]; a[k]=a[i]; a[i]=t;}
            System.out.println(Arrays.toString(a));
            f(a,k+1);
            {int t=a[k]; a[k]=a[i]; a[i]=t;}
        }
    }
    public static boolean t(int a[]){
        if(Math.abs(a[0]-a[1])==1 || Math.abs(a[0]-a[4])==1 || Math.abs(a[0]-a[3])==1 || Math.abs(a[0]-a[5]) == 1)
            return false;
        if(Math.abs(a[1]-a[2])==1 || Math.abs(a[1]-a[4])==1 || Math.abs(a[1]-a[6])==1 || Math.abs(a[1]-a[5]) == 1)
            return false;
        if(Math.abs(a[2]-a[6])==1 || Math.abs(a[2]-a[5]) == 1)
            return false;
        if(Math.abs(a[3]-a[4])==1 || Math.abs(a[3]-a[7])==1 || Math.abs(a[3]-a[8])==1)
            return false;
        if(Math.abs(a[4]-a[7])==1 || Math.abs(a[4]-a[8])==1 || Math.abs(a[4]-a[9])==1 || Math.abs(a[4]-a[5]) == 1)
            return false;
        if(Math.abs(a[5]-a[6])==1 || Math.abs(a[5]-a[8])==1 || Math.abs(a[5]-a[9])==1)
            return false;
        if(Math.abs(a[6]-a[9])==1 || Math.abs(a[7]-a[8])==1 || Math.abs(a[8]-a[9])==1)
            return false;
        return true;
    }
    public static void main(String [] args){
        int a[] = {0,1,2,3,4,5,6,7,8,9};
        f(a,0);
        System.out.println(sum);
    }
}
