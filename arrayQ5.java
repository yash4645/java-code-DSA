import java.util.Scanner;
// program to find array is sorted or not
public class arrayQ5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter "+n+" elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("is array sorted : " +findSort(arr));
    }
    static boolean findSort(int [] arr){
        boolean check=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;
    }
}
