import java.util.Scanner;

public class stringQ2 {
    // to convert toggle case of the string ...like if lower then convert it upper and if upper then convert it lower
// and if other charecter come apart frome alphabet leave that same

    static void toggleCon(StringBuilder str){

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int asci=(int)ch;
            if((asci >=97 && asci<=123) || (asci>=65 && asci<=91)){
                boolean flag=true;
                if(asci>=97) flag=false;
                if(flag==true){
                    asci+=32;
                    char n=(char)asci;
                    // str=str.substring(0,i)+n+str.substring(i+1);...if we have only string insted of stringBuilder
                    str.setCharAt(i, n);
                }else{
                    asci-=32;
                    char n=(char)asci;
                    // str=str.substring(0,i)+n+str.substring(i+1);
                    str.setCharAt(i,n);
                }

            }
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        StringBuilder str=new StringBuilder(sc.nextLine());
        toggleCon(str);
    }
}
