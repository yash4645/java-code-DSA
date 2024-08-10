import java.util.Scanner;

public class question19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String S=sc.nextLine();

        System.out.println("enter the number");
        int N=sc.nextInt();

        StringBuilder ans=new StringBuilder();
        int current=0;

        for(int i=0;i<S.length();i++){
            int asci=(int) S.charAt(i);
            current+=asci;
            if(current<N){
                ans.append(S.charAt(i));
            }else{
                break;
            }
        }
        String output=ans.toString();
        System.out.println(output);
    }
}
