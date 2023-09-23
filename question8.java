import java.util.Arrays;

public class question8 {
    public static void main(String[] args) {
        int[] arr={44,22,33,11,23,32,15};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Sum(arr[i])>Sum(arr[j])){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }else if(Sum(arr[i])==Sum(arr[j])){
                    arr[i]=Math.min(arr[i], arr[j]);
                    arr[j]=Math.max(arr[i], arr[j]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static int Sum(int a){
        int sum=0;
        while(a!=0){
            int rem=a%10;
            sum+=rem;
            a/=10;
        }
        return sum;
    }

}

