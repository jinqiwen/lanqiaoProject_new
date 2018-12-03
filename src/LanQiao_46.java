import java.util.Scanner;

public class LanQiao_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        persion[] p = new persion[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            sum += score;
            p[i] = new persion(name, score);
        }
        float aver = sum / N / 2;
        int min = 1000000;
        int tag = 0;
        float abs = 0;
        for (int i = 0; i < N; i++) {
            abs = Math.abs(aver - p[i].score);
            if (abs < min) {
                min = (int) abs;
                tag = i;
            }
        }
        System.out.print((int) aver + " " + p[tag].name);

    }

    static class persion {
        String name;
        int score;

        public persion(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
}
