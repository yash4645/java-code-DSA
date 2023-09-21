import java.util.Scanner;

public class question4 {
    // automorphic number ,given number is present in the square of that number at last
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int sqr=num*num;
        if(sqr%10==num){
            System.out.println("number is automorphic");
        }else{
            System.out.println("not automorphic");
        }
    }
}
