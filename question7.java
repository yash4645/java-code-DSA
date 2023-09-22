public class question7 {
    public static void main(String[] args) {
        int [] arr={11,22,33,44};
        int totalSum=0,digitSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
            while(arr[i]!=0){
                digitSum+=arr[i]%10;
                arr[i]/=10;
            }
        }
        int ans=totalSum-digitSum;
        System.out.println(ans);
    }
}
