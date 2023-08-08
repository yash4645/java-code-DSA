
import java.util.Arrays;
import java.util.Scanner;

public class array2Dq2 {
    // addition of two 2d array by taking input from user
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("for 1st array  ....");
        System.out.println("enter the number of row: ");
        int r= sc.nextInt();
        System.out.println("enter the number of columns: ");
        int c= sc.nextInt();
        int [][]arr=new int[r][c];
        System.out.println("enter the elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(" ____________....");
        System.out.println("for 2nd array  ....");
        int [][]arr2=new int[r][c];
        System.out.println("enter the elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<arr[i].length;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        addArray(arr, arr2);    
    }

    static void PrintArray(int[][] a){
        for(int[] ele:a){
            System.out.println(Arrays.toString(ele));
        }
    }

    static void addArray(int[][] a,int[][] b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("addition of the arrays is: ");
        PrintArray(a);
    }
}
