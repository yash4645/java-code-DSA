import java.util.Scanner;

public class recursionQ4 {
    // program to find p^q as the givem two integers


    // public static int findNum(int base,int pow){
    //     if(pow==0) return 1;
    //     return base*findNum(base, pow-1);   
    // }
    // time compexcity o(n)


    static int findNum(int p,int q){
        if(q==0) return 1;

        int ans=findNum(p, q/2);
        if(q%2==0)
        return ans*ans;

        return ans*ans*p;
    }
    // time complexicty o(logn)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers : ");
        int base=sc.nextInt();
        int pow=sc.nextInt();
        System.out.println(findNum(base, pow)); 
    }
}
