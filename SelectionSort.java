public class SelectionSort {
        // in this we travel the array and select the minimum element of the array and put it in starting
        // instarting we we take a element as a min after compair to all we find our min
        // time complexicity -> O(n2) space -> O(1)
    
    
        static void SelectionSortm(int[] a){
            int n=a.length;
    
            for(int i=0;i<n-1;i++){
                int min_index=i;
                for(int j=i+1;j<n;j++){
                    if(a[j]<a[min_index]){
                        min_index=j;
                    }
                }
                int temp=a[i];
                a[i]=a[min_index];
                a[min_index]=temp;     
            }
            printArr(a);
        }
    // to print
        static void printArr(int[] arr){
            for(int el:arr){
                System.out.print(el+" ");
            }
        }
        // main
        public static void main(String[] args) {
            int [] arr={3,53,63,13,42,75,98,57,0};
            SelectionSortm(arr);
        }
    }
    

