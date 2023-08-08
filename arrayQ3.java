import java.util.Scanner;

public class arrayQ3 {
    // print the reverse of the array by taking input by user
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of arry ");
        int n=sc.nextInt();
        int [] arr=new int [n];
        System.out.println("enter "+n+ " elements");
        for(int i=0;i<arr.length;i++){
            arr [i]=sc.nextInt();
        }
        for(int j=n-1;j>=0;j--){
            System.out.print( arr[j]+" " );
        }
        // print the reverse of the elements of the given array
    //     revOfArray();
    // }
    // static void revOfArray(){
    //     int []arr={1,2,3,4,5,6,7,8,9,0};
    //     for(int i=arr.length-1;i>=0;i--){
    //         System.out.print(arr[i]+" ");
    //     }
    }
}