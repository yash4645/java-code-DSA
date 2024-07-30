import java.util.*;
public class question21 {
    // intersection of two array
    // i:-[2,45,34,87,94,3,3,11,34],[45,87,90,11,22,34,56],o:-4,[45,87,34,11]#hashset
    public static void main(String[] args) {
        int[] a={2,45,34,87,94,3,3,11,34};
        int[] b={45,87,90,11,22,34,56,87};

        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int count=0;
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            if(set.contains(b[i])){
                count++;
                ans.add(b[i]);
                set.remove(b[i]);
            }
        }
        System.out.println(count);
        System.out.println(ans);


    }
}
