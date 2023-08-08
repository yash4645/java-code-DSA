import java.util.*;
public class arrayQ8 {
    // swap two numbers without using temp method
    // find unique number in the array

    // swap code
    // public static void main(String[] args) {
    //     int a=10;
    //     int b=20;
    //     System.out.println("before swap : a is: "+ a + " and b is : "+b);
    //     a=a+b;
    //     b=a-b;
    //     a=a-b;
    //     System.out.println("after swap : a is "+a+" and b is : "+b);
    // }


    // find unique code
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int arr []=new int[n];
        System.out.println("enter the elements of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){   
                    int num=arr[i];
                    for(int k=j;k<arr.length;k++){
                        if(arr[k]==num){
                            arr[k]=-1;
                        }
                    }
                    arr[i]=-1;
                }
            }
        }
        int ans=-1;
        System.out.println(" the unique elements are: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans=arr[i];
                System.out.println(ans);
            }
        }

    }
}
