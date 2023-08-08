import java.util.Scanner;
// program to find number of occurance of a perticuler number in a array given by user

public class arrayQ4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of arry ");
        int n=sc.nextInt();
        int [] arr=new int [n];
        System.out.println("enter "+n+ " elements");
        for(int i=0;i<arr.length;i++){
            arr [i]=sc.nextInt();
        }
        System.out.println("enter the number to find occurance: ");
        int num=sc.nextInt();
        int x= countNum(arr, num);
        System.out.println("number of accurance is " +x);
    }
    static int countNum(int []arr,int num){
        int count=0;
        for(int i: arr){
            if(i ==num)
            count++;
        }
        return count;
    }
}
