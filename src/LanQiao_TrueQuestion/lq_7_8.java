package LanQiao_TrueQuestion;

import java.util.LinkedList;

public class lq_7_8 {
    static int input=5;
    static boolean find=false;
    static LinkedList<Integer> x;
    static LinkedList<Integer> res;
    public static void main(String[] args) {
        x=new LinkedList<>();
        Backtrack(0,0);
        System.out.println(res);
    }
    static void  Backtrack (int index, int start){
         if(index>3){
            return;
         }
        for (int i = start; i <1000 ; i++) {
             if(!find) {
                 x.addLast(i);
                 if (Contract(index)) {
                     System.out.println(x);
                    return;
                 }
                 Backtrack(index + 1, i);
                 x.removeLast();
             }
        }
    }

    private static boolean Contract(int index) {
        if(index==3){
             return Math.pow(x.get(0),2)+Math.pow(x.get(1),2)+Math.pow(x.get(2),2)+Math.pow(x.get(3),2)==input;
        }else{
            return false;
        }

    }
}
