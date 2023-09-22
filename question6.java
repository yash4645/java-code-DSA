import java.util.Scanner;

public class question6 {
    // harshad number,if we add the digits of the number and the number is divisible by the ans 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0){
            sum+=temp%10;
            temp/=10;     
        }
        if(num%sum==0){
            System.out.println("number is harshad number");
        }else{
            System.out.println("number is not harshad number");
        }
    }
}
