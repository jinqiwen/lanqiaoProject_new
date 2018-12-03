package 蓝桥杯学习.天平称重问题;
import java.util.Scanner;
public class lq {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int w = input.nextInt();    //所称物体的重量

            for (int i = 1; i <= w; i++) {   //i为所需称重的物品重量
                System.out.println(i + ": " + fun(i));
            }
            input.close();
        }

        public static String fun(int w) {

            int i = 1;
            while(i < w) i *= 3;

            if (w == i) return i + "";

            if (w <= i/2) return i/3 + "+" + fun(w - i/3);

            return i + "-" + reve(fun(i - w));
        }

        private static String reve(String str) {
            str = str.replace("+", "#");
            str = str.replace("-", "+");
            str = str.replace("#", "-");

            return str;
        }

}
