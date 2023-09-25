import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of row");
        int row=sc.nextInt();
        System.out.println(("enter the number of column"));
        int col=sc.nextInt();
        int [][] matrix=new int[row][col];
        System.out.println("enter the elements 1 or 0");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<col;){
            int n=sc.nextInt();
            if(n==0 || n==1){
                matrix[i][j]=n;
                j++;
            }else{
                System.out.println("plz enter valid number 0 or 1");
            }
        }
        }
        int count=0;
        for(int i=0;i<row;i++){
            int temp=0;
            for(int j=0;j<col;j++){
                if(matrix[i][j]==1){
                    temp++;
                }
            }
            count=Math.max(temp,count);
        }
        System.out.println(count);
    }
}
