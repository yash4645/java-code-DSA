import java.util.*;
public class arrayQ7 {
    // code to find the 3 numbers that sum is equal to given target number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number that is equal to sum of three numbers: ");
        int num=sc.nextInt();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==num){
                        ans++;
                        System.out.print(arr[i] +" ");
                        System.out.print(arr[j] +" ");
                        System.out.print(arr[k]+" ");
                        System.out.println(" ");
                    }
                }
            }
        }
        System.out.println("total number of triplates are: ");
        System.out.println(ans);
    }
    static void printArray(int [] abc){
        for(int i=0;i<abc.length;i++){
            System.out.print(abc[i]+" ");
        }
        System.out.println(" ");
    }
}
