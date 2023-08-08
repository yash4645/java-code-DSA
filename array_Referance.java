import java.util.Arrays;

public class array_Referance {
    public static void main(String[] args) {
        int [] arr=new int[4];
        arr[0]=11;
        arr[1]=22;
        arr[2]=33;
        arr[3]=44;
        printArray(arr);
        // here in arr2 we just copy all value by same address so if we do any change in arr2 that will refelect the arr also
        int []arr2=arr;
        arr2[0]=77;
        arr[3]=88;
        System.out.println("1st array is ");
        printArray(arr);
        System.out.println("2nd array is :");
        printArray(arr2);
        // here change in array refelect the others

         int arr3 []=arr.clone();
         arr3 [2]=66;
        //  here the value did not affect the another array
         System.out.println("array 3rd is");
         printArray(arr3);

         int arr4[]=Arrays.copyOf(arr3, arr3.length-1);
         System.out.println("4th array is");
         printArray(arr4);
         
         int arr5[]=Arrays.copyOfRange(arr, 1, 3);
         System.out.println("5th array is: ");
         printArray(arr5);
    }

    static void printArray(int [] abc){
        for(int i: abc){
            System.out.print( i+" ");
        }
        System.out.println(" ");
    }
}
