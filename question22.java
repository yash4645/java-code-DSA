import java.util.*;
public class question22 {
    // array,hashmap
    // given an array and one element, find the exactly two element sum from the array is that element or not
    // eg:={2,56,4,8,9,10} ,x=14...op: 4,10
    public static void main(String[] args) {
        int[] arr={2,56,4,8,9,10};
        int x=14;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                int temp=map.get(arr[i]);
                map.put(arr[i],temp+1);
            }
        }
        for(int i:arr){
            if(map.containsKey(x-i))
            System.out.println(i);
            System.out.println(x-i);


        }

    }
}
