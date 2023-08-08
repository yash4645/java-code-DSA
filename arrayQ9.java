import java.util.Scanner;
// reveres of the array

public class arrayQ9 {
    static void printArray(int [] arr){
        for(int i:arr){
            System.out.print(i+ " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int arr []=new int[n];
        System.out.println("enter the elements of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("before swap array: ");
        printArray(arr);
        System.out.println(" ");
        int i=0,j=n-1,temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("after swap array: ");
        printArray(arr);

    }
}
