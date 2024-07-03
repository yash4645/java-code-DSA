import java.util.Scanner;

public class question18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of books");
        int N=sc.nextInt();
        int[] A= new int[N] ;
        int sum=0;

        System.out.println("enter the pages of books");
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
            sum+=A[i];
        }

        int ans=sum/N;
        System.out.println(ans);


    }
}
