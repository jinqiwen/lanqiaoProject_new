import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class LanQiao_4_New{
    public static void main(String[] args) throws IOException{
        BufferedReader sr = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(sr.readLine());
        int i=0;
        String []into =new String[150000];
        while(token.hasMoreTokens()){
            into[i++]= token.nextToken();
        }
        StringBuilder sb = new StringBuilder();
        int n=0;
        for(i--; i>=0; i--){
            sb.append(into[i]);
            if(i!=0)sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}