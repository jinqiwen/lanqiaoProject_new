package 蓝桥杯学习.取球博弈;
//https://blog.csdn.net/sunday_tutu/article/details/45603573
public class lq {
    public static void main(String[] args) {
        for (int i = 0; i <50 ; i++) {
            System.out.println(i+" : "+f(i));
        }
    }

    private static boolean f(int n) {
        if(n==1)return true;
        if(n>=1&&f(n-1)==false){return true;}
        if(n>=3&&f(n-3)==false){return true;}
        if(n>=7&&f(n-7)==false){return true;}
        if(n>=8&&f(n-8)==false){return true;}
        return false;
    }

}
