import java.util.*;
public class StackBasics {
    // basic concept and important metodhs of stack
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        // push operation to add elements in stack
        st.push(5);
        st.push(2);
        st.push(8);
        st.push(1);

        // to check stack is empty or not, it will return boolean value
        System.out.println(st.empty());

        // remove element from the top of the stack
        st.pop();

        // to get top element of stack
        System.out.println(st.peek());

        // it return the number from top of the element
        System.out.println(st.search(5));

        // now methods inherited from class java.util.Vector

        // add the element at top
        st.add(55);

        // add element at the particuler index
        st.add(3,77);

        System.out.println(st.get(3));
        System.out.println(st.size());
        // System.out.println(st.toArray());
        System.out.println(st.toString());
        System.out.println(st.capacity());
        System.out.println(st.clone());
        System.out.println(st.contains(23));
        System.out.println(st.set(2, 9));
        System.out.println(st.elementAt(2));
    }
}
