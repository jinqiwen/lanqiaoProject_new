import java.util.*;

public class LanQiao_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N ="";
        LinkedList<Character> list = new LinkedList<>();
        boolean input=true;
        while(true){
            N=sc.next();//注意next()和nextLine的區別
            char[] cs=N.toCharArray();
            for (int i = 0; i <N.length() ; i++) {
                if(cs[i]=='\n'){
                    break;
                }else if(cs[i]=='/'||cs[i]=='*'||cs[i]=='['||cs[i]==']'||cs[i]=='{'||cs[i]=='}'||cs[i]=='('||cs[i]==')'){
                    if(cs[i]=='*'&&cs[i-1]=='/'){
                        list.add('<');
                    }else if(cs[i]=='*'&&cs[i]=='/'){
                        list.add('>');
                    }else{
                        list.add(cs[i]);
                    }
                    continue;
                }else if(cs[i]=='.'){
                    input=false;
                }
            }
            if(input==false){
                break;
            }
        }
        char f=' ';
        char l=' ';
        boolean logic=true;
       for(int i = 0; i <list.size() ; i++) {
            if((list.get(i)=='['&&list.get(i+1)==']')){
                 list.remove(i);
                 list.remove(i);
            }else if(list.get(i)=='{'&&list.get(i+1)=='}'){
                list.remove(i);
                list.remove(i+1 );
            }else if(list.get(i)=='('&&list.get(i+1)==')'){
                list.remove(i);
                list.remove(i);
            }
        }
        System.out.println(list);



    }

}
