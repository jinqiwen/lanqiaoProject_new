import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LanQiao_30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list1 =new LinkedList<>();
        while(true){
            int a =sc.nextInt();
            if(a==-1){
                break;
            }
            list1.add(a);
        }
        LinkedList<Integer> list2 =new LinkedList<>();
        while(true){
            int a =sc.nextInt();
            if(a==-1){
                break;
            }
            list2.add(a);
        }
        list1.addAll(list2);
        Collections.sort(list1);
        if(list1.isEmpty()){
          System.out.print("NULL");
        }else{

        for (int i = 0,len=list1.size(); i <len ; i++) {
            if(i!=len-1){
                System.out.print(list1.get(i)+" ");
            }else{
                System.out.print(list1.get(i));
            }

        }
        }
    }

}
