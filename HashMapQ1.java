import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// find the number of charecters that occure more then once in the given string
public class HashMapQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.nextLine();
        System.out.println(countNum(str));
    }
    static int countNum(String str){
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
        int count=0;
        for(Map.Entry<Character,Integer> e:hm.entrySet()){
            if(e.getValue()>1){
                count++;
            }
        }
       return count;
    }
}

