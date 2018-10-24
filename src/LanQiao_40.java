import java.util.Scanner;
public class LanQiao_40 {
        public static void main(String[] args){
            Scanner sr = new Scanner(System.in);
            String  b[] = new String[4];
            for(int i=0;i<4;i++){
                String  s = sr.nextLine();
                char[] a = s.toCharArray();
                b[i]=String.valueOf(a[a.length - 1]);
            }
            //System.out.println(b[0]+b[1]+b[2]+b[3]);
            StringBuffer sb = new StringBuffer();
            for (int i=0;i<4;i++){
                sb.append(b[i]);
            }
            System.out.print(sb.toString());
            System.out.println();
        }
    }
