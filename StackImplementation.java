public class StackImplementation {
     // implementation from linkedlist
    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }  
    }
    static class Stack {
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }

        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
         public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
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
