import java.util.Stack;
public class StackQ2 {
    public static void main(String[] args) {
        // reverse a stack
        Stack<Integer> s=new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        
        reverseStack(s);

        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();   
        }
    }

    public static void reverseStack(Stack<Integer> s){
        
        if(s.empty()){
            return ;
        }
        int n=s.pop();
        reverseStack(s);   
        pushAtButtom(n, s);
    }
    
    public static void pushAtButtom(int n, Stack<Integer> s){
        if(s.empty()){
            s.push(n);
            return;
        }
        int num=s.pop();
        pushAtButtom(n, s);
        s.push(num);
    }
}
