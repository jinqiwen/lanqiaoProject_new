package LanQiao_TrueQuestion;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class lq_7_10 {
    static int n=12;
    static int[] x={1 ,1 ,2, 3, 2, 3, 1, 2, 2, 2 ,3, 1};//用户输入数组
    static LinkedList<Integer> newx ;//作为新数组输出
    static int[] y;//作为二表存储
    public static void main(String[] args) {
        y=new int[n];
        newx= new LinkedList<>();
       for (int i=0;i<x.length;i++){
           //遍历y,如果数组y中存储了相应的值，那么遍历区间存在多少种不同的数， 实现存储
           for (int j = 0; j <y.length ; j++) {
               if(x[i]==y[j]){
                   Set<Integer> set=new HashSet<>();
                   for (int k = j+1; k <i ; k++) {
                        set.add(x[k]);
                   }
                   newx.addLast(set.size());
                   //修改y中存储值
                   y[j]=0;//旧值删除
                   y[i]=x[i];//新址添加
                   break;
               }
               if(j==y.length-1){//代表了遍历了整个数组也没有找到，那么做另外处理
                   //数组y中不存在x中的元素
                   newx.addLast(x[i]-x[i]*2);
                   y[i]=x[i];//添加相应的值

               }
           }
       }
       System.out.print(newx);
    }

}
