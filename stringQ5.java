public class stringQ5 {
    // given a string as b3c6d15---->bbbccccccddddddddddddddd
    public static void main(String[] args) {
        String str="b3c6d15";
        char ch=' ';
        String num=new String();
        StringBuilder ans=new StringBuilder();   
        for(int i=0;i<str.length();i++){
            char ch1=str.charAt(i);
            int asci=(int)ch1;
            if(ch==' ' && ((asci>=97 && asci<=123) || (asci>=65 && asci<=91))){
                ch=ch1;
            }else if(ch!=' ' && (asci>=48 && asci<=57)){
                num+=ch1;
            }else{
                int temp=Integer.valueOf(num);
                for(int j=0;j<temp;j++){
                    ans.append(ch);
                }
                ch=ch1;
                num="";
            }
        //     if(num.length()>0){
        //     int temp2=Integer.valueOf(num);
        //     for(int j=0;j<temp2;j++){
        //         ans.append(ch);
        //     }
        // }
        }
        int temp2=Integer.valueOf(num);
        for(int j=0;j<temp2;j++){
            ans.append(ch);
        }
        System.out.println(ans.toString());
    }    
}
