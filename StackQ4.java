import java.util.Arrays;
import java.util.Stack;
public class StackQ4 {
    public static void main(String[] args) {
        // newrest greater to left
        // [3,6,4,5,9,1,1,1,0,7]-->[-1,-1,6,6,-1,9,9,9,1,9]
        int[] arr={3,6,4,5,9,1,1,1,0,7};
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<arr.length;i++){
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
