public class JavaUtils {
    /**
     * 四捨五入輸出數據
     * @param d  輸入值
     * @param accuracy 小數點保留位數
     */
    public static void Rounding(double d,int accuracy){
        System.out.printf("%."+accuracy+"f",d);
    }

}
