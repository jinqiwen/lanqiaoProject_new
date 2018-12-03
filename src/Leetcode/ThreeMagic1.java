package Leetcode;

import java.util.Scanner;

public class ThreeMagic1 {
    static int n=5;
    static int[][] input = {
            {4, 9, 2, 1, 8},
            {3, 5, 7, 6, 2},
            {8 ,1 ,6 ,9 ,3},
            {2 ,3 ,3 ,6 ,9},
            {5 ,6 ,9 ,3 ,6}
    };
    public static void main(String[] args) {
        Contraint(0,0,0);
    }
    static void Backtrack(int index,int x,int y){
         if(index==3){
               return;
         }
         if(Contraint(index,x,y)){

         }
    }

    private static boolean Contraint(int index,int x,int y) {
        int sum1=0;
        int sum2=0;
        boolean result=true;
        for (int i = 0; i <3 ; i++) {
                int xsum = input[i][y]+input[i][y+1]+input[i][y+2];//每行和
                int ysum = input[i][y]+input[i][y+1]+input[i][y+2];//每行和
               if((xsum!=sum1||ysum!=sum2)&&(sum1!=0&&sum2!=0)&&(xsum==ysum)){
                       result=false;
                       break;
               }else{
                   sum1=xsum;
                   sum2=ysum;
               }
        }
        int left = input[x][y]+input[x+1][y+1]+input[x+2][y+2];//左对角线
        int right =input[x][Math.abs(2-x)]+input[x-1][y-1]+input[Math.abs(2-x)][x];//右对角线
         result= left==right?left==sum1?true:false:false;
        return result;
    }
}
