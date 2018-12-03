package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combinations {
    static ArrayList<List<Integer>> res;
    static LinkedList<Integer> result ;
    static int n =4,k=2;
    public static void main(String[] args) {
        res=new  ArrayList<List<Integer>>();
        result=new LinkedList<Integer>();
 ;       good(n,k,0,0,result);
        System.out.println(res);
    }
    //递归
    //每次从[index ,input.length]选择一个数做匹配
    //index是递归到下一层的索引
    static void good(int n,int k,int start, int index ,LinkedList<Integer>  result){
        if(result.size()==k){
           res.add((LinkedList)result.clone());
        }
        for(int i= start;i<n;i++){
             result.addLast(i+1);
             System.out.println(result);
             good(n ,k,start+1,index+1,result);
             result.removeLast();
             start+=1;//用于进入下一次循环改变起始索引的位置
        }
    }
}
