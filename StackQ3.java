import java.util.Arrays;
import java.util.Stack;
public class StackQ3 {
    // next largest element or nearest greater to right
    // [1,3,2,4]--> [3,4,4,-1], [1,3,0,0,1,2,1,4,3]-->[3,4,1,1,,2,4,4,-1,-1]
    public static void main(String[] args) {
        int[] arr={1,3,0,0,1,2,1,4,3};
        Stack<Integer> s=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            if(s.empty()){
                s.push(arr[i]);
                arr[i]=-1;
            }else if(s.peek()>arr[i]){
                int top=s.peek();
                s.push(arr[i]);
                arr[i]=top;
            }else{
               
                while (!s.empty() && s.peek()<=arr[i]) {
                  s.pop();        
                }
                if(s.empty()){
                    s.push(arr[i]);
                    arr[i]=-1;
                }else{
                    int top=s.peek();
                    s.push(arr[i]);
                    arr[i]=top;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}