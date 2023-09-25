public class question10 {
    // tower of hanoi
            public static void TOH(int n,char fromrod,char torod,char aux)
            {
                if(n==1)
                {
                    System.out.printf("Move disk %d from %c to %c \n",n,fromrod,torod);
                }
                else{
                    TOH(n-1, fromrod, aux, torod);
                     System.out.printf("Move disk %d from %c to %c \n",n,fromrod,torod);
                     TOH(n-1, aux, torod, fromrod);
                }
            }
            public static void main(String[] args) {
                int  n=3;
                TOH(n,'A','C','B');
            }
        }

