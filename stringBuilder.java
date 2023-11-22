// import java.util.*;
public class stringBuilder {
    // to increse the performance of the string we use this
    // string is immutable thats why we use StringBuilder
    public static void main(String[] args) {

        StringBuilder str= new StringBuilder("hello");
        str.append(" world");
        System.out.println(str);
        str.setCharAt(0, 'm');
        System.out.println(str);
        str.insert(3,'y');
        System.out.println(str);
        str.delete(3, 4);
        System.out.println(str);
        System.out.println(str.reverse());
        String s="radhe";
        StringBuilder str2=new StringBuilder(s);
        System.out.println(str2);
       
    }

}
