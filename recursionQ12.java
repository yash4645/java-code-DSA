public class recursionQ12 {

    // find the all index of the digit in the given array
    static void findInd(int[] arr,int ind,int num){
    if(ind==arr.length) return ;
    if(arr[ind]==num)  System.out.print(ind+" ");
    findInd(arr, ind+1, num);
    }

    // find the first index if having else return -1
    static int findFirst(int[] arr,int ind , int num){
        if(ind==arr.length) return -1;
        if(arr[ind]==num) return ind;
        return findFirst(arr, ind+1, num); 
            
    }

    // find last index
    static int findLst(int[] arr,int ind,int num){
        int ans=-1;
        if(ind==arr.length) return ans;
        if(arr[ind]==num) ans=ind;
        int temp=findLst(arr, ind+1, num);
        return Math.max(ans, temp);
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int [] arr={2,5,3,3,7,4,3,7,2,8,4,3};
        findInd(arr,0,3);
        System.out.println(findFirst(arr, 0, 4));
        System.out.println(findLst(arr, 0, 5));
}
}
