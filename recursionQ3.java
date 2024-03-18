import java.util.Scanner;
// program to add the digits of the given number

public class recursionQ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the number: ");
        Long num=sc.nextLong();
        if(num>999999999){
            System.out.println("Abhishek is land");
        }else{
            System.out.println(findNum(num));

        }
    }
    static Long findNum(Long n){
        if(n>=0 && n<=9) return n;
        return findNum(n/10)+n%10;
    }
}
