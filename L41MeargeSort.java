public class L41MeargeSort {
    // based on divide and conqure approach,divide the given array in to two parts and sort both array by using recursion after merge the overall sorted array
// time complexity ->O(nlogn)
    static void merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i,j,k;
        for(i=0;i<n1;i++) left[i]=arr[l+i];
        for(j=0;j<n2;j++) right[j]=arr[mid+1+j];
        i=0;
        j=0;
        k=l;

        while(i<n1 &&j<n2){
            if(left[i]<=right[j])
            arr[k++]=left[i++];
            else
            arr[k++]=right[j++];
        }
        while(i<n1)
        arr[k++]=left[i++];
        while(j<n2)
        arr[k++]=right[j++];

    }

    static void mergeSort(int[] arr,int l,int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }
    
    static void printArr(int[] a){
        for(int el:a){
            System.out.print(el+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr={3,4,2,8,5,9,2,54,87,98,23,14};
        System.out.println("before sorting");
        printArr(arr);
        int n=arr.length;
       
        System.out.println(" ");
        System.out.println("after sorting");  
        mergeSort(arr, 0,n-1);
        printArr(arr);
        
    }
}
