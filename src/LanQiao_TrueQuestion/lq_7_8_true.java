package LanQiao_TrueQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class lq_7_8_true {
    public static void main(String[] args) {
        int a;
        int[] rs = new int[4];
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            a = scanner.nextInt();
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++)
                    for (int d = 0; d < 10; d++) {
                        for (int e = 0; e < 10; e++) {
                            if (a == b * b + c * c + d * d + e * e) {
                                rs[0] = b;
                                rs[1] = c;
                                rs[2] = d;
                                rs[3] = e;

                            }
                        }
                    }
            }
            Arrays.sort(rs);
            for (int i = 0; i < 4; i++) {
                System.out.print(rs[i] + " ");
            }
        }

    }
}
