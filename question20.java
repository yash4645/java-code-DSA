import java.util.Scanner;
// code to find hcf and lcm of two numbers...
public class question20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int hcf=1,lcm=num1*num2;

        while (num1!=0 && num2!=0) {
            if(num1>num2){
                num1=num1%num2;
            }else{
                num2=num2%num1;
            } 
        }

        if(num1!=0){
            hcf=num1;
        }else{
            hcf=num2;
        }
        lcm/=hcf;

        System.out.println("hcf is: "+hcf);
        System.out.println("lcm is : "+lcm);
    }
}
