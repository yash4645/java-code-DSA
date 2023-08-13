public class L42QuickShort {
    // in this we choose a random element from the array and take it as a partition ,and put it on its currect position in array,and after sure that left side only less element having and right side only greater element having to the partition,and then we sort that both side
// time compexicity -> O(nlogn)
    static int Partition(int[] a,int str,int end){
        int pivot=a[str];
        int count=0;
        for(int i=str+1;i<=end;i++){
            if(a[i]<=pivot){
                count++;
            }
        }
        int curr=str+count;
        swap(a, str, curr);
        int i=str;
        int j=end;
        while(i<curr && j>curr){
            while(a[i]<=pivot) i++;
            while(a[j]>pivot) j--;
            if(i<curr && j>curr){
                swap(a, i, j);
                i++;
                j--;
            }    
        } 
        return curr;
    }

    static void QuickSort(int[] a,int str,int end){
        if(str>=end) return;

        int pivit = Partition(a,str, end);
        QuickSort(a, str, pivit-1);
        QuickSort(a, pivit+1, end);
    }

    public static void main(String[] args) {
        int[] arr={6,6,3,1,5,4};
        System.out.println("before sorting");
        printArr(arr);
        System.out.println(" ");
        int n=arr.length;
        QuickSort(arr, 0,n-1);
        System.out.println("after sorting ");
        printArr(arr);
    }

    static void printArr(int[] a){
        for(int el:a){
            System.out.print(el+" ");
        }
    }

    static void swap(int[] a,int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }

}
