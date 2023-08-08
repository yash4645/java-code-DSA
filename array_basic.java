public class array_basic {
    // declaration
    static void array_declaration(){
        int [] age=new int[3];
        String [] name =new String[3];
        int [] regno={001,200,3000};
        name[0]="aman";
        name[1]="rohan";
        name[2]="rajiv";
         age[0]=22;
         age[1]=18;
         age[2]=14;
        //  System.out.println(age[1]);
        //  System.out.println(age[0]);
        //  System.out.println(age[2]);
        for(int i: age ){
            System.out.println(i);
        }
        for(int i=0;i<3;i++){
            System.out.println(name[i]);
        }
        for(int i: regno ){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        array_declaration();
    }
}
