import java.util.Scanner;

public class recursionQ6 {
    // program to print sum of n natural numbers with alternative sign

    static int findNum(int n){
        if(n==0) return 0;
        int ans=findNum(n-1);
        if(n%2==0){
            System.out.print("-");
            System.out.print(n);
            return ans-n;
        }
        System.out.print("+");
       System.out.print(n);
       return ans+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=sc.nextInt();
       int n= findNum(num);
      System.out.println();
      System.out.println("total value is: "+n);
    }
}
