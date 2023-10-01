public class question16 {
    // print pyramid
    public static void main(String[] args) {
        int num=3;
        for(int i=0;i<num;i++){
            for(int j=0;j<2*num-1;j++){
                if(j>=num-1-i && j>=2*num-1-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }  
            }
            System.out.println();
        }
    }
}
