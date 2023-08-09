public class string {
    public static void main(String[] args) {
        String a= "ARul";
        String b= "Yash";

        System.out.println(a.concat(b));
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
         String m="Radhe  ";
         String n="Radhe  ";
        //  it compair memory is equal or not
        if(m==n){
            System.out.println("m==n");
        }
        // it compair content is equal or not
        if(m.equals(n)){
            System.out.println("m equals n");
        }

    }
}
