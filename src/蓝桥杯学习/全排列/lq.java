package 蓝桥杯学习.全排列;

public class lq {
    static String s="ABC";
    public static void main(String[] args) {
        f(   s.toCharArray(),0);
    }
    private static void f(char[] c,int index) {
        if(index==c.length-1 ){
            System.out.println(String.valueOf(c));
            return;
        }
        for (int i = index; i <c.length ; i++) {
            {char t = c[index];c[index]=c[i];c[i]=t;}//试探
            f(c,index+1);
            {char t = c[index];c[index]=c[i];c[i]=t;}//回溯
        }

    }


}
