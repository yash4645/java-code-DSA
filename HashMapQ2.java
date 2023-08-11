import java.util.HashMap;
import java.util.Scanner;

public class HashMapQ2 {
    // find the given two strings are anagram or not
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two strings two compair");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
       System.out.println("the given string is anagram : "+findAnagram(str1,str2)); 
    }

    static boolean findAnagram(String s1,String S2){
        if(s1.length()!=S2.length()) return false;
        HashMap<Character,Integer> hm1=makeHashMap(s1);
        HashMap<Character,Integer> hm2=makeHashMap(S2);
        return hm1.equals(hm2);
    }

    static HashMap<Character,Integer> makeHashMap(String str){
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch, 1);
            }else{
                int currentVal=hm.get(ch);
                hm.put(ch, currentVal+1);
            }
        }
        return hm;
    }

}
