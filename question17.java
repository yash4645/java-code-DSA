import java.util.*;

public class question17 {
    // count and say problem 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println(findstr(num));
    }
    public static String findstr(int n){
        if(n==1) return "1";
        if(n==2) return "11";
        String ans="11";
         for(int i=3;i<n;i++){
            String t="";
            ans+="&";
            int count=1;
            for(int j=1;j<ans.length();j++){
                char ch1=ans.charAt(j);
                char ch2=ans.charAt(j-1);
                if(ch1!=ch2){
                    t=t+count;
                    t=t+ch2;
                    count=1;
                }else{
                    count++;
                }
            }
            ans=t;

         }

         return ans;
    }
}
