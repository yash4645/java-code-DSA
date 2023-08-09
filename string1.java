import java.util.Scanner;

public class string1 {
    // in this we will see all the basics to advance about the string 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // normal declaration or initialization

        String str="yash raj";
        String str2="yash ";
        // String str2=sc.next();
        // String str3=sc.nextLine();

        // to find length of the string
        System.out.println(str.length());
        // to find the charecter of the string at particuler index
        System.out.println(str.charAt(3));
        // to find a charecter index by passing the charecter
        System.out.println(str.indexOf('a'));
        // to compair two strings we will get 0 when both is equal ,+ve value when 1st one is lexographically greater to 2nd one else negative value
        System.out.println(str.compareTo(str2));
//  // to chake a chunk of string is inside or not in the given string  
        System.out.println(str.contains("sh"));
//  // to chake start and ends is having or not
        System.out.println(str.startsWith("ya"));
        System.out.println(str.endsWith("j"));
//     // to convert upperCase or LowerCase
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());   
        // to concat two strings
        System.out.println(str.concat(str2));
        // to find substring
        System.out.println(str.substring(1, 5));
        System.out.println(str.substring(1));


        // if we write to string with same value then both will point the same sting address in heap but when we create 
        // using new keyword that will create new string with same value
        String a="hello";
        String b="hello";
        // above both pointing the same string but the change in one will not affect the other it will point another
        // its known as interning,to save the space,but below line will create new one
        String c=new String("hello");
        // == it refer the same address thats why a==b is true but a==c is different bcz it has another address
        // we use .equals method that compair the content of the string is equal or not
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(c));

        // strings are immutable by nature ,that means we can't change it,if we rewrite it with anothr string that will
        // refrence to the new string but the old one is also exist that time it will be not changed
        a=a.substring(0, 2)+'y'+a.substring(3);
        System.out.println(a);

        // strings performance is too poor so we use stringBuilder and string buffer to increase the performance 
        


    }
}