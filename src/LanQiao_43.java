import java.util.Scanner;

public class LanQiao_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        int find = 0;
            String[]  c = sc.nextLine().split(" ");
        for (int i = 0; i <c.length ; i++) {
            if (c[i].equals("250")) {
                System.out.println(i+1);
                break;
            }
        }

    }
}
