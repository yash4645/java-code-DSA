import java.util.Scanner;
// given a number and a value ,print number to multiple of value

public class recursionQ5 {
    static void findNum(int a,int b){
        if(b<=0) return;
        findNum(a, b-1);
        System.out.println(a*b);    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();
        System.out.println("enter the k value: ");
        int k=sc.nextInt();
        System.out.println("answer is : ");
        findNum(num, k);

    }
}
