import java.util.Arrays;
import java.util.Scanner;
// rotation of matrix on 90

public class array2dQ4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of row or column");
        int r=sc.nextInt();
        // System.out.println("enter the culmon ");
        // int c=sc.nextInt();
        int[][] arr=new int[r][r];
        System.out.println("enter the elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("original Array");
        printArr(arr);
        System.out.println("rptated Array");
        rotateArr(arr, r);
    }
    static void printArr(int[][] a){
        for(int[] e:a){
            System.out.println(Arrays.toString(e));
        }
    }
    static void rotateArr(int[][] a,int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            reverseArr(a[i]);
        }
    }
    static void reverseArr(int[] a){
        int i=0,j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }

}
