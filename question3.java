import java.util.Scanner;

public class question3 {
    // find the sum of all number withinn the given range that is divisible by 3 or 5
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("enter the range");
       int num=sc.nextInt();
       int sum=0;
       for(int i=3;i<=num;i+=3){
        sum+=i;
       }
       for(int i=5;i<=num;i+=5){
        if(i%3!=0){
            sum+=i;
        }
       }
       System.out.println(sum);
    }
}
