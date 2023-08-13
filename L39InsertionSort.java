public class L39InsertionSort {

    // we devide our array o in two parts after suppose one part is sorted ,we move elements from other parts to that part
    // time complexcity->O(n2),best->omega(n),space->o(n)
    static void insertionSort(int [] a){
        int n=a.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
        printArr(a);
    }

    // to print
    static void printArr(int[] a){
        for(int el:a){
            System.out.print(el+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={64,23,67,18,90,99,32};
        insertionSort(arr);
    }
    
}
