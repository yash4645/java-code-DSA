public class question1 {
    public static void main(String[] args) {
        String s="this is ksr";
        s.trim();
        StringBuilder str=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=' '){
                str.append(ch);
            }else{
                System.out.print(str.reverse()+" ");
                str.delete(0, str.length());
           }
        }
        System.out.print(str.reverse());
    }
}
