import java.util.Stack;
public class StackQ1 {
    // push at the buttom of the stack, in given stack push a new element at the buttom of the stack
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        reverseStack(4, st);

        while (!st.empty()) {
            System.out.println(st.peek());
            st.pop();   
        }
        
    }
    public static void reverseStack(int n, Stack<Integer> s){
        if(s.empty()){
            s.push(n);
            return;
        }
        int num=s.pop();
        reverseStack(n, s);
        s.push(num);
    }
}
