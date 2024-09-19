import java.util.Stack;
public class recursionQ16 {
    // delete middle element of the stack
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(6);
        st.push(3);
        st.push(9);
        st.push(2);
        st.push(31);
        // System.out.println(Math.ceil(5/2.0));
        int n=st.size();
        double s= (n%2==0) ? n/2 : Math.ceil(n/2.0);
        // System.out.println(s);
        deletMiddle(st, s);
        System.out.println(st);
    }
    public static void deletMiddle(Stack<Integer> st, double s){

        if(st.size()==s){
            st.pop();
            return;
        }
        int top=st.pop();
        deletMiddle(st, s);
        st.push(top);   
        return;    
    }
}
