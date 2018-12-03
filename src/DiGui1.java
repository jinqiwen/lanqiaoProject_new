/**
 * 递归-斐波那契数列
 */
public class DiGui1 {
    public static void main(String[] args) {
        System.out.println(fabnaqi(3));
    }
    public static int fabnaqi(int n){
        if(n==1||n==2){
            return 1;
        }
        return fabnaqi(n-1)+fabnaqi(n-2);

    }
}
