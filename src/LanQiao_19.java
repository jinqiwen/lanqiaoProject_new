import java.util.Scanner;

public class LanQiao_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        char[] cs = String.valueOf(N).toCharArray();
        String s = "";
        for (int i =0;i<cs.length;i++) {
            switch (cs[i]) {
                case '0':
                    s = "ling";
                    break;
                case '1':
                    s = "yi";
                    break;
                case '2':
                    s = "er";
                    break;
                case '3':
                    s = "san";
                    break;
                case '4':
                    s = "si";
                    break;
                case '5':
                    s = "wu";
                    break;
                case '6':
                    s = "liu";
                    break;
                case '7':
                    s = "qi";
                    break;
                case '8':
                    s = "ba";
                    break;
                case '9':
                    s = "jiu";
                    break;
               default:
                    s = "fu";
                    break;
            }
            if(i!=cs.length-1){
                System.out.print(s+" ");
            }else {
                System.out.print(s);
            }
        }
    }
}
