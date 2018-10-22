import java.util.Scanner;

public class shiyan2 {
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        String line = sr.nextLine();
        String[] attr=line.replaceAll(" +"," ").split(" ");
        for(int i=attr.length-1;i>-1;i--){
            System.out.print(attr[i]);
            if(i!= 0){
                System.out.print(" ");
            }
        }
    }
}