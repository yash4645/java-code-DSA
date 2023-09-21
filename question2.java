import java.util.Scanner;
// check the password is strong or not ,it having 1 uppercase ,1lower case,1 numeric & 1 spacial charecter
// asci values A=65 ,Z=90 ,a=97 ,z=122,0-9=48-57 others are spacial char
public class question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the password");
        String str=sc.nextLine();
        int flag1=0,flag2=0,flag3=0,flag4=0;
        if(str.length()>=8){
        for(int i=0;i<str.length()-1;i++){
            char ch=str.charAt(i);
            if(ch>=65 && ch<=90){
               flag1=1;
            }else if(ch>=97 && ch<=122){
                flag2=1;
            }else if(ch>=48 && ch<=57){
                flag3=1;
            }else{
                flag4=1;
            }
            if(flag1==1 && flag2==1 && flag3==1 && flag4==1){
                System.out.println("strong password");
                break;
            }
        }  
     }
      if(flag1 ==0 || flag2==0 || flag3==0 || flag4==0){
                System.out.println("weak password");
      } 
   }
}
