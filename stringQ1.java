import java.util.Scanner;

public class stringQ1 {
    
    // to find all substring of the given string
    static void findSub(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i, j)+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String str=sc.nextLine();
        findSub(str);
    }
}
