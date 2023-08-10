import java.util.Scanner;

public class recursionQ1 {
    // find factorial of the number by using resursion
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();
       System.out.println("factorial is "+ findNumber(num));
    }
    static int findNumber(int n){
        if(n==0) return 1;
         return n*findNumber(n-1);
    }
}
