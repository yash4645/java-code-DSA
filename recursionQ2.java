import java.util.Scanner;
// find the fabnachhi series till given number

public class recursionQ2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();
        for(int i=0;i<=num;i++){
            System.out.println(findNum(i));
        }
    }
    static int findNum(int n){
        if(n==0 || n==1) return n;
        return findNum(n-1)+findNum(n-2);
    }
}
