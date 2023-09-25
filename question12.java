import java.util.Scanner;

public class question12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rats");
        int r=sc.nextInt();
        System.out.println("enter the number of food");
        int n=sc.nextInt();
        System.out.println("enter the number of houshes");
        int h=sc.nextInt();
        int arr[]=new int[h];
        System.out.println("enter the elemets of house");

        for(int i=0;i<h;i++){
            arr[i]=sc.nextInt();
        }
        int total=r*n;
        int add=0,ans=0,i=0;
        while(add<total){
            add+=arr[i];
            i++;
            ans++;
        }
        System.out.println("total number of house needed is "+ans);
    }
}
