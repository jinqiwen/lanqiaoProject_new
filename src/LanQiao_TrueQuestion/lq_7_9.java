package LanQiao_TrueQuestion;

import java.util.ArrayList;
import java.util.List;

public class lq_7_9 {
    static int[] n = {1, 2, 3};
    static int[] initSums = {1,2,3,4,5};
    static int initSum =5;
    static int x;//甲方
    static int y;//乙方
    static String result;//结果
    static List<String> res;
    static int currentSum=5;
    public static void main(String[] args) {
        res=new ArrayList<>();
        Backtrack(0, 0, 0);
      /*  for (int i = 0; i < 5; i++) {
            initSum=initSums[i];
            currentSum=initSums[i];*/
           System.out.println(res);
           /* if (res.indexOf("+") == 1) {
                System.out.print("+");
            } else if (res.indexOf("0") == 1) {
                System.out.print("0");
            } else {
                System.out.print("-");
            }*/

    }

    private static void Backtrack(int index, int x, int y) {
        if ((initSum == 0)&&(x+y==currentSum)) {
            res.add(constrait(y, x));
          /*  System.out.println("res +"+res);*/
            return;
        }
        for (int i = 0; i < 3; i++) {
            if (initSum >= 0) {
                x += n[i];
                initSum -= n[i];
                /* System.out.println(x + " " + y + " sum:" + initSum);*/
                Backtrack(index + 1, y, x);
                /* System.out.println("x- "+n[i]);*/
                x -= n[i];
                initSum += n[i];
            }
        }
        return;
    }

    //判定函数
    private static String constrait(int x, int y) {
        if (x % 2 != 0 && y % 2 != 0) {//平手
            return "0";
        } else if (x % 2 != 0) {
            return "+";
        } else {
            return "-";
        }
    }

}
