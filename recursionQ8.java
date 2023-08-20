import java.util.Scanner;
// print all the subsequences of a string 

public class recursionQ8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        printSub(str," ");
    }
    static void printSub(String s,String current){
        if(s.length()==0){
            System.out.print(current+" ");
            return;
        }
        char ch=s.charAt(0);
        String remaining=s.substring(1);
        printSub(remaining, current+ch);
        printSub(remaining, current);
    }
}
