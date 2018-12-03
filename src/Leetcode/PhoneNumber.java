package Leetcode;

import java.util.ArrayList;
import java.util.List;
//11-28练习
public class PhoneNumber {
    static List<String> res;
    static String input="23";
    static String[] letterMap ={
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };
    public static void main(String[] args) {
        res=new ArrayList<>();
       good(input,0,"");
        System.out.println(res);

    }
    //递归处理函数
    //每次处理指定数字字符中的第index ， 并与字符index+1进行匹配
    public static void good(String s ,int index,String result){
        if(result.length()==input.length()){
            res.add(result);
            return;
        }
         char c = s.charAt(index);
         String  el=letterMap[c-'0'];
         for (int i=0;i<el.length();i++){
             good(s,index+1, result+el.charAt(i));
         }

    }
}
