import java.util.Scanner;

public class LanQiao_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean HaveOutput = false;
        while (in.hasNext()) {
            int expon = in.nextInt();
            int coef = in.nextInt();

            if (expon * coef != 0) {
                if (HaveOutput) {
                    System.out.print(" ");
                } else {
                    HaveOutput = true;
                }

                System.out.print(expon * coef + " " + (coef - 1));
            }
        }
        in.close();

        if (!HaveOutput) {
            System.out.print("0 0");
        }
    }
}
