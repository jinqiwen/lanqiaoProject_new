import java.util.Scanner;

public class LanQiao_4 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int input=sr.nextInt();
//        int input=242;
        int rabbit=0;
        int Tortois = 0;
        int i=0;
        do{
            i+=1;
            rabbit+=9;
            Tortois+=3;
            if(i%10==0&&rabbit>Tortois){//到底休息的逻辑怎么实现？
                int t= i;
               for(int j = i;j<input&&j<t+30;j++,i++){
                   Tortois+=3;
               }
            }
        }while (i<input);
        String result=rabbit>Tortois?"^_^":rabbit==Tortois?"-_-":"@_@";
        System.out.print(result+" "+Tortois);
    }

}
