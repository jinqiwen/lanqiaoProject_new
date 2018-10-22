import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LanQiao_18 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N= sc.nextInt();
  List<Integer> list=new ArrayList<Integer>();
  //初始化队伍
  for (int i = 0; i < N; i++) {
      list.add(i+1);
  }
  //猴子的个数
  int remiander=N;
  //报数器
  int count=0;
  int i=0;
  while(remiander>1){
     if(i==remiander){ //如果下標等於剩餘的猴子個數如果不加會導致什麼，這裡代表報數已經到了尾部，必須讓索引回到頭部
         i=0;
     }
    if(list.get(i)!=null){   //如果寫成if(list.get(i)!=null&&count==3)會導致什麼問題
        count++;
         if(count==3){
             list.remove(i);
             count=0;
             remiander--;
             //注意從尾部回到頭部的時機,想想如果不加continue會導致什麼問題
             continue;
         }


        }
          i++;

}
   System.out.println(list.get(0));

}
}
