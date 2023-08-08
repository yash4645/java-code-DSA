import java.util.Scanner;
// print an 2d array by taking input from user

public class array2Dq1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of row : ");
        int r=sc.nextInt();
        System.out.println("enter the number of culomn : ");
        int c=sc.nextInt();
        int [][]arr=new int[r][c];
        System.out.println("enter the elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printArray(arr);
    }

      static void printArray(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
