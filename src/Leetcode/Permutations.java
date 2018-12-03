package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//11-28 leetcode复习
public class Permutations {
    static ArrayList<List<Integer>> res;
    static int[] input={1,2,3};
    static boolean[] visited;
    static LinkedList<Integer> result;
    public static void main(String[] args) {
        res= new ArrayList<List<Integer>>();
        visited=new boolean[input.length];
        result =new LinkedList<>();
        good(input,0, result);
        System.out.println(res);
    }
    static void good(int[] s , int index,LinkedList<Integer> result){
         if(result.size()==s.length){
             res.add((LinkedList<Integer>)result.clone());
         }
         for(int i= 0;i<input.length;i++){
              if(!visited[i]){
                 visited[i]=true;
                 result.addLast(s[i]);
                  System.out.println(result);
                 good(s,index+1,result);
                 result.removeLast();
                 visited[i]=false;
              }

         }
    }
}
