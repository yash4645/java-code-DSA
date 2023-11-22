import java.util.Scanner;

public class accentureProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row");
        int r=sc.nextInt();
        System.out.println("enter the number of column");
        int c=sc.nextInt();
        int [][]arr=new int[r][c];
        System.out.println("enter the elements of the array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                for(int k=0;k<c;k++){
                    if(arr[i][j]<arr[i][k]){
                        int temp=arr[i][j];
                        arr[i][j]=arr[i][k];
                        arr[i][k]=temp;
                    }
                }
                
            }
        }
        System.out.println("reverse of the row is: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
