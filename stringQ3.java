import java.util.Scanner;

public class stringQ3 {
    // reverse the words of the given sentance as HII I AM YASH ...IIH I MA HSAY

    static void reverseStr(String str){
        String ans="";
        StringBuilder ab=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                ab.append(ch);
            }else{
                ab.reverse();
                ans=ans+ab+" ";
                ab.delete(0, ab.length());
            }
        }
        ab.reverse();
        ans+=ab;
        System.out.println(ans);
        System.out.println(ans.length());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentance : ");
        String str=sc.nextLine();
        System.out.println(str.length());
        reverseStr(str);
    }
}
