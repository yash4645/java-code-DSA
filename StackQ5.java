import java.util.*;
public class StackQ5 {
    public static void main(String[] args) {
        // input as: aaabbcccbddddeee, output: ace , as consucative 3 charecters
        String s="aaabbcccbddddeeefff";
        Stack<Character> st =new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(int i=1;i<s.length();i++){
            char ch1=s.charAt(i-1),ch2=s.charAt(i);
            if(i==1){
                st.push(ch1);
                st.push(ch2);
            }else if(ch1==ch2){
                st.push(ch2);
            }else{
                int num=0;
                while (!st.empty()) {
                    st.pop();
                    num++;
                }
                st.push(ch2);
                if(num==3){
                    ans.append(ch1);
                }
            }
        }
        if(!st.empty()){
            int n=0;
            char ch=st.peek();
            while (!st.empty()) {
                st.pop();
                n++;     
            }
            if(n==3) ans.append(ch);
        }
        System.out.println(ans.toString());
    }
}
