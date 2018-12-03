package LanQiao_TrueQuestion;

public class lq_7_3 {
    static int[] g;
    static boolean[] usered;
    static int sum =0;
    public static void main(String[] args) {
        usered=new boolean[10];
        g=new int[10];
        Backtrack(1);
        System.out.println(sum);
    }
    static void Backtrack(int index){
         if(index==10){
               sum+=isCheck(g)?1:0;
               return;
         }
        for (int i = 1; i <=9 ; i++) {
             if(!usered[i]){
                 usered[i]=true;
                 g[index]=i;
                 Backtrack(index+1);
                 usered[i]=false;
             }
        }
    }
    static boolean isCheck(int[] g) {
        double m1= g[1];
        double m2= g[2]*1.0/g[3]*1.0;
        double m3= (g[4]*100+g[5]*10+g[6])*1.0/(g[7]*100+g[8]*10+g[9])*1.0;
        return m1+m2+m3==10.00?true:false;
    }
}
