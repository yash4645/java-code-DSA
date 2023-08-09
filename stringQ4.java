import java.util.Scanner;

public class stringQ4 {
    // print the number of char with present charecter as...aaabbbbccdddddefff...a3b4c2d5ef3

    static void printstr(String str){
        String ans="";
        int count=1;
        char next=' ';
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i-1);
             next=str.charAt(i);
            if(ch!=next){
                ans=ans+ch;
               if(count>1) ans=ans+count;
                count=1;
            }else{
                count++;
            }
        }
        ans=ans+next;
        if(count>1) ans=ans+count;
        System.out.println(ans); 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string :");
        String str=sc.nextLine();
        printstr(str);
    }
}
