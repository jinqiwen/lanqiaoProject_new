package 蓝桥杯学习.反转字符串;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(f("abcde"));
    }

    private static String  f(String s ) {
        if(s.length()<=1) return s;
        return f(s.substring(1))+s.charAt(0);
    }
}
