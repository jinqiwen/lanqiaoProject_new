import java.util.Stack;

public class LanQiao_25_false {
    public static void main(String[] args) {
        String input = "Hello World   Here I Come";
        char[] n =input.toCharArray();
        Stack stack = new Stack<>();
        Stack s = new Stack<>();
        for (int i = 0; i < n.length; i++) {
            if (!s.empty()) {
                if( s.pop()=="" && n[i]==' '){
                  continue;
                }
            }
            stack.push(n[i]);
            s.push(n[i]);

        }
       for (int i = 1; i < n.length; i++) {
            System.out.print(stack.pop());
        }
    }
}
