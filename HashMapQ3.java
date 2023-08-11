import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
// chacke two strings are isomorphic or not
public class HashMapQ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two strings two compair");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(findIsomorphic(str1, str2));
    }
    static boolean findIsomorphic(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        HashMap<Character,Character> hm=new HashMap<>();
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(hm.containsKey(ch1)){
                if(hm.get(ch1)!=ch2)
                    return false;
            }else if(hs.contains(ch2)){
                    return false;
            } else{
                hm.put(ch1, ch2);
                hs.add(ch2);
            }
        }
        return true;
    }
}
