public class exceptionQ1 {
    public static void main(String[] args) {
//             int c=0;
//         try{
//             int a=Integer.parseInt(args[0]);
//             int b=Integer.parseInt(args[1]);
//             c=a/b;
//             System.out.println(c);
//         }
//         catch(ArithmeticException e){
//             System.out.println("divide by 0");
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println(" enter the proper number");
//         }
//         catch(NumberFormatException e){
//             System.out.println("enter currect datatype ");
//         }

      String str="abc";
      int a=10,b=0;
      int arr[]=new int[4];
    //   if anyline get exception the next line will be not execute
      try{
        System.out.println(a/b);
        System.out.println(str.length());
        int x=arr[3];
     }
     catch(ArithmeticException e){
        System.out.println("divede by 0 is not possible");
     }
     catch(NullPointerException e){
        System.out.println("string length is null");
     }
     catch(ArrayIndexOutOfBoundsException e){
        System.out.println("index out of bound");
     }
     finally{
      System.out.println("program terminated");
     }
    }
 }

