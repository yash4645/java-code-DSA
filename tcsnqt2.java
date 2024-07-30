import java.util.*;
public class tcsnqt2 {
    // given one array print the index of first non repeating element
    public static void main(String[] args) {
        int[] arr={2,4,3,7,3,5,2,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        // int ans=0;

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                int temp=map.get(arr[i]);
                map.put(arr[i], temp+1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
