import java.util.Scanner;

public class L45BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target number :");
        int target=sc.nextInt();
        printArr(arr);
        System.out.println("target is "+target);
        System.out.println("is target present in array :" +BS(arr,target));
    }


    static boolean BS(int [] arr,int target){
        int n=arr.length;
        int str=0,end=n-1;
        while(str<=end){
            int mid=(str+end)/2;
            if(target==arr[mid]){
                return true;
            }else if(target >arr[mid]){
                str=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }

    static void printArr(int [] a){
        for(int i : a){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        }

        // by recursion
        static boolean BSbyRecursion(int[] a,int str,int end,int target){
            
            return false;
        }
    }
