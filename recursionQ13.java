
public class recursionQ13 {
    // find the sum of subset of the array
    static void sumSubARR(int[] a,int idx,int sum){
        if(idx==a.length){
            System.out.print(sum+" ");
            return ;
        } 
        sumSubARR(a, idx+1, sum);
         sumSubARR(a, idx+1, sum+a[idx]);
    }
    public static void main(String[] args) {
        int [] arr={2,4,5,3};
        sumSubARR(arr, 0, 0);
        
    }
}
