package LanQiao_TrueQuestion;

import sun.plugin.javascript.navig.Link;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class lq_7_6{
    static int[] input={0,1,2,3,4,5,6,7,8,9};
    static boolean[] visited;
    static int count=0;
    static LinkedList<Integer> result;
    static ArrayList<List<Integer>> res;

    public static void main(String[] args) {

        visited=new boolean[10];
        result=new LinkedList<>();
        res=new ArrayList<>();
        Backtrack(0);
        System.out.println(res);
    }

    private static void Backtrack(int index ) {
        if(index==10){
            res.add(result);
            count++;
            System.out.println(count);
            return;
        }
        for (int i = 0; i <=9 ; i++) {
            if(!visited[i]){
                visited[i] = true;
                result.addLast(input[i]);
                if(index==4||index==5||index==6||index==7||index==8||index==9) {
                    if ((result.get(index) == result.get(index - 4))) {
                        return;
                    }
                }
                if(index==1||index==2||index==4||index==5||index==6||index==8||index==9){
                    if (Math.abs(result.get(index)-result.get(index-1))==1) {
                        return;
                    }
                }

                    Backtrack(index+1);

                result.removeLast();
                visited[i] = false;
            }
        }
    }

}
