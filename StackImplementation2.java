import java.util.ArrayList;

public class StackImplementation2 {
    // Stack implementation from arraylist
    static class Stack {
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }

        public static void push(int data){
            list.add(data);
        }
    
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            if ((isEmpty())) {
                return -1;      
            }
            return list.get(list.size()-1);
        }
        
    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(4);
        st.push(7);
        st.push(3);;
        st.push(9);

        while ((!st.isEmpty())) {
            System.out.println(st.peek());
            st.pop();      
        }   
    }
}
