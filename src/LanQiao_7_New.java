import java.util.*;

public class LanQiao_7_New {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[][] s=new int[t][2];
        for(int i=0;i<t;i++){
            for(int j=0;j<2;j++){
                s[i][j]=sc.nextInt();

            }

        }
        for(int i=0;i<t;i++){
            double z=s[i][1];
            double weight=(s[i][0]-100)*0.9*2;
            System.out.println(weight);
            if(Math.abs(z-weight)<weight*0.1){
                System.out.println("You are wan mei!");
            }else if((z-weight)<weight*0.1){
                System.out.println("You are tai shou le!");
            }else{
                System.out.println("You are tai pang le!");
            }

        }
    }

}
