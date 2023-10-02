import java.util.Arrays;
import java.util.Scanner;

public class array2dQ3 {
    //  transpose  of matrix
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of row ");
        int r=sc.nextInt();
        System.out.println("enter the culmon ");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("enter the elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printArr(arr);
        System.out.println("reversed matrix");
        if(r==c){
            transposeOfSqureMatrix(arr, c);
        }else{
             int[][]ans=tanspposeOfMatrix(arr, r, c);
        printArr(ans);
        }
    }

    static void printArr(int[][] a){
        for(int[] ele:a){
            System.out.println(Arrays.toString(ele));
        }
    }

    // for non square matrix
    static int[][] tanspposeOfMatrix(int[][] a,int r,int c){
        int[][] arr=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                arr[i][j]=a[j][i];
            }
        }
        return arr;
    }

    // for square matrix
    static void transposeOfSqureMatrix(int[][] a,int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        printArr(a);
    }
}
