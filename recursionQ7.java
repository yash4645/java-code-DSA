import java.util.Scanner;
// print reverse of the given string

public class recursionQ7 {
    static void printstr(String str,int indx){
        if(indx==0){
         System.out.print(str.charAt(indx));
        return;}
        System.out.print(str.charAt(indx));
        printstr(str, indx-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string: ");
        String str=sc.nextLine();
        printstr(str,str.length()-1);
    }
}
