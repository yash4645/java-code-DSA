
public class L40Q0nSorting{
    // sort the given array of string in lexicographical order of there name

    static void sortArr(String[] a){
        int n=a.length;

        for(int i=0;i<n-1;i++){
            int min_ind=i;
            for(int j=i+1;j<n;j++){
                if(a[j].compareTo(a[min_ind])<0){
                    min_ind=j;   
                }
                String temp=a[i];
                a[i]=a[min_ind];
                a[min_ind]=temp;      
            }
        }
        printArr(a);
    }

    static void printArr(String[] a){
        for(String el:a){
            System.out.print(el+" ");
        }
    }

    public static void main(String[] args) {
        String[] fruits={"apple","mango","papaya","gouva","banana","berry"};
        // String[] ab={"abc","abcd","acbd","aaaa"};
        // sortArr(ab);
        sortArr(fruits);
    }
}
