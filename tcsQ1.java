import java.util.*;
public class tcsQ1 {
    // given two strings s1 and s2 ,calculate the sum of the character occurance of s2 in s1
    public static void main(String[] args) {
        String s1="developer";
        String s2="dev";
        int sum=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else{
                int current=map.get(ch);
                map.put(ch, current+1);
            }
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            int add=map.get(ch);
            sum+=add;
        }
        System.out.println(sum);
    }
}
