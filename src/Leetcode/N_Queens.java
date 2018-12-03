package Leetcode;

import java.util.SortedMap;

public class N_Queens {
    static int n=8 ;
    static long sum ;
    static int[] x ;
    public static void main(String[] args) {
        sum =0;
        x=new int[n+1];
        Backtrack(1);
        System.out.println(sum);
    }
    static void Backtrack(int index){
        if(index>n){
          sum++;
        }else{
          for(int i=1;i<=n;i++){
            x[index]=i;
            if(Contraint(index)){
                Backtrack(index+1);
            }
          }
        }
    }
    //约束函数
    //保证不在同一列上，而且不在统一斜线上， 为什么不去保证不在同一行上，因为默认数组的索引就不是相同的
    private static boolean Contraint(int k) {//t代表试探皇后的位置
        for (int j = 1; j <k ; j++) {//在保证当前皇后位置在[1,t)之间不存在满足同一斜线或者同一列的要求
            if((Math.abs(k-j)==Math.abs(x[j]-x[k]))||(x[j]==x[k])){
                  return false;
            }
        }
        return true;
    }
}
