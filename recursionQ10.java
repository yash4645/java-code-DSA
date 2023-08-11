import java.util.Scanner;
// find the highest number in the given array

public class recursionQ10 {
    static void findMax(int arr[],int indx){
        if(indx==arr.length) return;
        System.out.println(arr[indx]);
        findMax(arr, indx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findMax(arr,0);
    }
}
