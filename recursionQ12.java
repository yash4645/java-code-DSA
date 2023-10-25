public class recursionQ12 {
    // find the digit index in the given array
    static void findInd(int[] arr,int ind,int num){
    if(ind==arr.length) return ;
    if(arr[ind]==num)  System.out.println(ind);
    findInd(arr, ind+1, num);
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int [] arr={2,5,3,3,7,4,3,7,2,8,4,3};
        findInd(arr,0,3);
    }
}
