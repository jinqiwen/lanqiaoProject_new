import java.util.Scanner;
public class LanQiao_25 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String input = sr.nextLine();
      /* String input="Hello World   Here I Come";*/
        char[] n =input.toCharArray();
        StringBuffer result=new StringBuffer();
        for (int i = 0; i < n.length; i++) {
            if (i>0&&n[i]==n[i-1]&&n[i]==' ') {
             continue;
            }
            result.append(String.valueOf(n[i]));
        }
        String r2 =result.toString();
        String[] result1=r2.split(" ");
        for (int i = result1.length-1; i >-1; i--) {
         System.out.print(result1[i]);
         if(i!= 0){
             System.out.print(" ");
         }
        }



    }
}
