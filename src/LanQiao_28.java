import sun.security.util.Length;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.Stack;

public class LanQiao_28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String N=sc.nextLine();

      /*  String N = "+ + 2 * 3 - 7 4 / 8 4";*/
        String[] cs = N.split(" ");
        Stack stack = new Stack();
        int a = 0;
        int b = 0;
        for (int i = cs.length - 1; i > -1; i--) {//注意i 的判定条件
            if (Character.isDigit(cs[i].toCharArray()[0])) {
                stack.push(Integer.parseInt(cs[i]));
            }
            if ("/".equals(cs[i]) || "*".equals(cs[i]) || "+".equals(cs[i]) || "-".equals(cs[i])) {
                a = (int) stack.pop();
                b = (int) stack.pop();
                switch (cs[i]) {
                    case "/":
                        stack.push(a / b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "+":
                        stack.push(a + b);
                        break;
                    default:
                        stack.push(a - b);
                        break;
                }
            }
        }
        if(stack.isEmpty()||stack.size()>1){
            System.out.println("ERROR");
        }else {

                BigDecimal big = new BigDecimal((int) stack.pop()).setScale(1, RoundingMode.HALF_UP);
                System.out.print(big);


        }
    }
}
