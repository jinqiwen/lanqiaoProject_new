package 蓝桥杯学习.出栈次序;

public class lq {
    public static void main(String[] args) {
        System.out.println(f(3,0));
    }
    //a表示左边车的数目
    //b表示栈中车的数目
    private static int  f(int a ,int b ) {
        if(a==0) return 1;
        if(b==0) return f(a-1,1);
        return f(a-1,b+1)+f(a,b-1);
    }
}
