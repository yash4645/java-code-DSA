import java.util.Scanner;

public class recursionQ14 {
    // palindrome of string
    static boolean isPalindrome(String str,int st,int lt){
        if(st>=lt) return true;
        if(str.charAt(st)!=str.charAt(lt))return false;
       return isPalindrome(str, st+1, lt-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int last=str.length();
         boolean bl=isPalindrome(str,0,last-1);
         if(bl){
            System.out.println("true");
         }else{
            System.out.println("false");
         }
    }
}
