public class BubbleSort {

    // we do a certain number of passes & in every pass ,we compair adjacent elements &swap them if they are not in currect order
    // every iteration one max or min went to last of the position
    // time complexicity O(n2),space complexity O(1),its a stable sort,and it is an in place algorith also,best case O(n)

    static void bubbleSort(int[]a){
        int n=a.length;

        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){

                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                printArr(a);
                return;
            }
        }
       printArr(a);
    }

    public static void main(String[] args) {
        int[] a={2,3,452,6,3234,753,3};
        System.out.println("before sorting ");
        printArr(a);
       
        System.out.println(" ");
        System.out.println("after sorting");
        bubbleSort(a);   
}

static void printArr(int[] arr){
    for(int el:arr){
        System.out.print(el+" ");
    }
}
}
