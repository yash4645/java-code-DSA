import java.util.*;
public class tcsQ3 {
    // union of two array
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5,6};
        int[]arr2={3,4,2,7,8};
        int max=Math.max(arr1.length, arr2.length);
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<max;i++){
            if(i<arr1.length) set.add(arr1[i]);
            if(i<arr2.length) set.add(arr2[i]);
        }

        System.out.println(set.size());
        System.out.println(set);
    }
}
