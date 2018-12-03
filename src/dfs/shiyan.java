package dfs;

import java.util.Arrays;

public class shiyan {
    static int sum =0;
    public static void f(int a[],int k){
        if(k==a.length-1){
                sum +=1;
            return;
        }
        for(int i=k;i<a.length; i++){
            {int t=a[k]; a[k]=a[i]; a[i]=t;}
            System.out.println(Arrays.toString(a));
            f(a,k+1);
            {int t=a[k]; a[k]=a[i]; a[i]=t;}
        }
    }

    public static void main(String [] args){
        int a[] = {0,1,2};
        f(a,0);
        System.out.println(sum);
    }
}
