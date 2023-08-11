import java.util.Scanner;
// find gcd of two numbers

public class recursionQ9 {
    static int findgcd(int a,int b){
        if(b==0)return a;
        return findgcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the non zero numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(findgcd(a, b));
    }
}
