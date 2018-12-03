package 蓝桥杯学习.填字母;

import java.util.Scanner;
//博弈问题
public class lq {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = Integer.valueOf(cin.nextLine());
        while (n-- > 0) {
            System.out.println(dfs(cin.nextLine()));
        }

    }

    private static int dfs(String str) {
        if (str.contains("LOL")) {
            return -1;
        }
        if (!str.contains("*")) {
            return 0;
        }
        int ping = 0;
        char[] cs = str.toCharArray();

        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '*') {//前提这个位置没有被填
                cs[i] = 'L';//试着填入L
                switch (dfs(new String(cs))) {
                    case -1:
                        return 1;
                    case 0:
                        ping = 1;
            }//如果上面没有return 1 ,那么我们再尝试填入O
                cs[i] = 'O';//试着填入O
                switch (dfs(new String(cs))) {
                    case -1:
                        return 1;
                    case 0:
                        ping = 1;
                }
                //既然这个位置既不能填L，也不能填O，那么说明这个位置不适合填，那么让i++,去尝试填下一个位置
                cs[i] = '*';//回溯，代表我没填
            }
        }
        //如果上面的递归函数结束了，没有return 1 ,那么说明我已经无法赢对手了，那么这是看能不能平手
        if (ping > 0) {
            return 0;
        }
        return -1;


    }
}
