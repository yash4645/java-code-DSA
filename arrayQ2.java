public class arrayQ2 {
    //  addition of the elements of the array
    public static void main(String[] args) {
        addition();
    }
    static void addition(){
        int [] arr={2,3,5,6,98,9};
        int addOfArray=0;
        for(int i=0;i<arr.length;i++){
            addOfArray+=arr[i];
        }
     System.out.println(" addition of the elements of the array is "+addOfArray);
    }
}
