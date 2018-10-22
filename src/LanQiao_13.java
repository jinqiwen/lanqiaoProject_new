import java.util.Scanner;

public class LanQiao_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int Ra = sc.nextInt();
            int Ca = sc.nextInt();
            String[][] A = new String[Ra][Ca];
            for (int i = 0; i < Ra; i++) {
                for (int j = 0; j < Ca; j++) {
                    A[i][j] = sc.next();
                }
            }
        int Rb = sc.nextInt();
        int Cb = sc.nextInt();
        String[][] B = new String[Rb][Cb];
        for (int i = 0; i < Rb; i++) {
            for (int j = 0; j < Cb; j++) {
                B[i][j] = sc.next();
            }
        }
        int[][] C = new int[Ra][Cb];
        if(Ca != Rb){
          System.out.println("Error: "+Ca+" != "+Rb);
        }else {
            System.out.println(Ra + " " + Cb);
            for (int i = 0; i < Ra; i++) {
                for (int j = 0; j < Cb; j++) {
                    for (int k = 0; k < Ca; k++) {
                        C[i][j] += Integer.parseInt(A[i][k]) * Integer.parseInt(B[k][j]);
                    }
                    System.out.print(C[i][j]);
                    if (j != Cb - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
