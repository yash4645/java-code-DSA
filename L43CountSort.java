public class L43CountSort {
    // in this we take a maximum range of the highest element of the array,then we count the accurance of the digits came,and at last we fill the array based on accurance

    static void CountSort(int[] arr){
        int max=findMax(arr);
        int[] count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }

    }

    public static void main(String[] args) {
        int arr []={4,8,2,1,3,7,4,9,5,6};
        System.out.println("before sort ");
        printArr(arr);
        System.out.println(" ");
        CountSort(arr);
        System.out.println("after sort");
        printArr(arr);

    }

    static void printArr(int[] a){
        for(int el:a){
            System.out.print(el+" ");
        }
    }

    static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
