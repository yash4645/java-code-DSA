import java.util.*;
public class HashMapQ4 {
    public static void main(String[] args) {
        // input as: aaabbbbccddddddeee, output :ade as odd count

        String s="aaabbbbccdddddeee";
        Map<Character,Integer> map=new HashMap<>();
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                int num=map.get(ch);
                map.put(ch,num+1);
            }
        }

        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue()%2 !=0){
                ans.append(e.getKey());
            }
        }

        System.out.println(ans.toString());
    }
}
