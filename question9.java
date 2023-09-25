public class question9 {
    // print 2d array in elements one after anothr in row and column
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int fr=0,lr=3,fc=0,lc=3;

        while(fr<lr || fc<lc){
        for(int i=fc;i<=lc;i++){
            System.out.print(arr[fr][i]+" ");
        }
        fr++;
        for(int i=fr;i<=lr;i++){
            System.out.print(arr[i][lc]+" ");
        }
        lc--;
        for(int i=lc;i>=fc;i--){
            System.out.print(arr[lr][i]+" ");
        }
        lr--;
        for(int i=lr;i>=fr;i--){
            System.out.print(arr[i][fc]+" ");
        }
        fc++;
    }
    }
}
