import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first min number");
        int min=sc.nextInt();
        System.out.println("enter the max number");
        int max=sc.nextInt();
        int div=0,nondiv=0;
        for(int i=0;i<=max;i++){
            if(i%min==0){
                div+=i;
            }else{
                nondiv+=i;
            }
        }
        System.out.println(div);
        System.out.println(nondiv);
        int ans=nondiv-div;
        System.out.println(ans);
    }
}
