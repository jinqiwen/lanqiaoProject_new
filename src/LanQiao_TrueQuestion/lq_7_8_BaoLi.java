package LanQiao_TrueQuestion;

import java.util.LinkedList;

public class lq_7_8_BaoLi {
    static int input=773535;
    public static void main(String[] args) {
        int sqrtn=(int)Math.sqrt(input);
              for(int i= 0;i<sqrtn;i++){
                  for (int j = 0; j < sqrtn; j++) {
                      for (int k = 0; k <sqrtn ; k++) {
                          for (int l = 0; l < sqrtn; l++) {
                               if(Math.pow(i,2)+Math.pow(j,2)+Math.pow(k,2)+Math.pow(l,2)==input){
                                       System.out.println(i+" "+j+" "+k+" "+l);
                                     return ;
                               }
                          }
                      }
                  }
              }
    }
    
}
