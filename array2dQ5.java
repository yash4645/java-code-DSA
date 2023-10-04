import java.util.Arrays;
import java.util.Scanner;
// pascals triangle
public class array2dQ5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row");
        int n=sc.nextInt();
        pascleTriangle(n);
    }
    static void pascleTriangle(int n){
        int [][] arr=new int[n][];  
        for(int i=0;i<n;i++){
            arr[i]=new int[i+1];
            arr[i][0]=arr[i][i]=1;
            for(int j=1;j<i;j++){  
               arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
            Printarr(arr[i]);
        }    
    }
    static void Printarr(int[] a){
        System.out.println(Arrays.toString(a));
    }
}
