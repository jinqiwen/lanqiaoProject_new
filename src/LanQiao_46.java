import java.util.Scanner;
public class LanQiao_46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        persion[] p = new persion[N];
        int sum=0;
        for (int i = 0; i <N ; i++) {
             String name= sc.next();
             int score=sc.nextInt();
             sum+=score;
             p[i]=new persion(name,score);
        }
        double aver=sum/N/2;
        int min=1000000;
        String minName="";
        int tag=0;
        for (int i = 0; i <N ; i++) {
               if(Math.abs(aver-p[i].score)<min){
                 min =(int)Math.abs(aver-p[i].score);
                 tag =i;
               }
        }
        System.out.println((int)aver+" "+p[tag].name);

    }
    static class persion{
        String name;
        int score;
        public persion(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
}
