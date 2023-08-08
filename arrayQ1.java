import java.util.Scanner;
// find the number is present in the array 
public class arrayQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find: ");
        int num=sc.nextInt();
        findNumber(num);
    }
    static void findNumber(int a){
        int [] number ={1,2,3,4,5,6,7,8,9,0,11,12,34,56,2,78,90};
        int num=0;
        for(int i=0;i<number.length;i++){
            if(number[i]==a){
                num=a;
                System.out.println("number is found at index " +i);
                break;
            }
        }
        if(num!=a){
            System.out.println("number not found ");
        }

        }

    }

