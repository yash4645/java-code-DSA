import java.util.Scanner;

public class question5 {
    // friendly fair number that is common in both 2 numbers divisers
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st number");
        int num1=sc.nextInt();
        System.out.println("enter the2nd number");
        int num2=sc.nextInt();
        int temp=Math.min(num1,num2);
        int flag=0;
        for(int i=2;i<=temp;i++){
            if(num1%i==0 && num2%i==0){
                System.out.println(i+" is a friendly fair number");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("number has no any friendly fair number is common");
        }

    }
}
